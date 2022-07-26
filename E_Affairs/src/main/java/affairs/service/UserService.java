package affairs.service;

import affairs.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kinoz
 * @Date 2022/7/26 - 16:06
 * @apiNote
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    //转装
    public void transfer(){
        userDao.addMoney();

        userDao.reduceMoney();

        System.out.println("事务操作完成");
    }
}
