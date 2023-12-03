package cn.edu.tyut.dao;

import cn.edu.tyut.entity.Account;

/**
 * @Author 羊羊
 * @ClassName AccountDao
 * @SubmitTime 周六
 * @DATE 2023/12/2
 * @Time 17:59
 * @Package_Name cn.edu.tyut.dao
 */
public interface AccountDao {
    /**
     * 添加
     * @param account account detail
     * @return 0/1
     */
    int addAccount(Account account);

    /**
     * 更新
     * @param account update account detail
     * @return 0/1
     */
    int updateAccount(Account account);

    /**
     * 删除
     * @param id int
     * @return 0/1
     */
    int deleteAccount(int id);
}
