package affairs.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @author kinoz
 * @Date 2022/7/26 - 16:06
 * @apiNote
 */
@Component
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jte;

    @Override
    public void addMoney() {
        String sql = "update account set money=money-? where name=?;";
        jte.update(sql,100,"Tom");
    }

    @Override
    public void reduceMoney() {
        String sql = "update account set money=money+? where name=?;";
        jte.update(sql,100,"Jerry");
    }
}
