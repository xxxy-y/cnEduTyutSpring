package cn.edu.tyut.dao.impl;

import cn.edu.tyut.dao.AccountDao;
import cn.edu.tyut.entity.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author 羊羊
 * @ClassName AccountDaoImpl
 * @SubmitTime 周六
 * @DATE 2023/12/2
 * @Time 17:59
 * @Package_Name cn.edu.tyut.dao.impl
 */
public class AccountDaoImpl implements AccountDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * 添加
     * int update(String sql, Object... args)
     *
     * @param account account detail
     * @return 0/1
     */
    @Override
    public int addAccount(Account account) {
        String sql = "INSERT INTO account(id, username, balance) VALUES(?, ?, ?)";
        Object[] obj = new Object[]{
                account.getId(),
                account.getUsername(),
                account.getBalance()
        };
        return this.jdbcTemplate.update(sql, obj);
    }

    /**
     * 更新
     * int update(String sql, Object... args)  args为sql语句中的参数
     *
     * @param account update account detail
     * @return 0/1
     */
    @Override
    public int updateAccount(Account account) {
        String sql = "UPDATE account set username=?, balance=? WHERE id=?";
        Object[] objects = new Object[]{
                account.getUsername(),
                account.getBalance(),
                account.getId()
        };
        return this.jdbcTemplate.update(sql, objects);
    }

    /**
     * 删除
     * int update(String sql, PreparedStatementSetter pss)  pss为sql语句中的参数
     *
     * @param id int
     * @return 0/1
     */
    @Override
    public int deleteAccount(int id) {
        String sql = "DELETE FROM account WHERE id=?";
        return this.jdbcTemplate.update(sql, id);
    }

    /**
     * select
     * rowMapper的作用是为了将数据表中的数据映射到用户自定义的类中
     * 通过Java反射机制自动匹配数据库查询结果的列名与目标类的属性名，然后将对应的值设置到目标类的属性中
     *
     * @param id id
     * @return account detail
     */
    @Override
    public Account findAccountById(int id) {
        String sql = "SELECT * FROM account WHERE id=?";
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<>(Account.class);
        return this.jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

    /**
     * select
     *
     * @return list
     */
    @Override
    public List<Account> findAllAccount() {
        String sql = "SELECT * FROM account";
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<>(Account.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    /**
     * transfer
     * propagation:事务的传播行为
     * isolation:事务的隔离级别
     * readOnly:指定事务是否为只读
     *
     * @param outUser user
     * @param inUser  user
     * @param money   double
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
    public void transfer(String outUser, String inUser, Double money) {
        String sql = "UPDATE account set balance = balance + ? WHERE username = ?";
        this.jdbcTemplate.update(sql, money, inUser);
//        int i = 1 / 0;
        String sql1 = "UPDATE account set balance = balance - ? WHERE username = ?";
        this.jdbcTemplate.update(sql1, money, outUser);
    }
}