package cn.edu.tyut.dao.impl;

import cn.edu.tyut.dao.AccountDao;
import cn.edu.tyut.entity.Account;
import org.springframework.cache.annotation.AbstractCachingConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

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
}