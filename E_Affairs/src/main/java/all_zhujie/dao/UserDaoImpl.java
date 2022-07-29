package all_zhujie.dao;

import all_zhujie.dao.UserDao;
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
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update account set money=money-? where name=?;";
        jdbcTemplate.update(sql,100,"Tom");
    }

    @Override
    public void reduceMoney() {
        String sql = "update account set money=money+? where name=?;";
        jdbcTemplate.update(sql,100,"Jerry");
    }
}
