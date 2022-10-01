package all_zhujie.util;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author kinoz
 * @Date 2022/7/28 - 13:33
 * @apiNote
 */
@Configuration
@ComponentScan(basePackages = "all_zhujie") //开启组件扫描
@EnableTransactionManagement        //开启事务管理器
public class BeanConfig {
    //创建数据库连接池
    @Bean
    public DruidDataSource getDruidDataSource(){
        DruidDataSource dds = new DruidDataSource();
        dds.setDriverClassName("com.mysql.jdbc.Driver");
        dds.setUrl("jdbc:mysql://localhost:3306/springframe?userUnicode=true&amp;characterEncoding=utf-8&amp;useSSL=true");
        dds.setUsername("root");
        dds.setPassword("123456");
        return dds;
    }
    //创建jdbcTemplate对象
    @Bean
    public JdbcTemplate JdbcTemplate(DataSource dataSource){
        //在IOC容器中根据类型找到dataSource
        final JdbcTemplate jte = new JdbcTemplate();
        //注入dataSource
        jte.setDataSource(dataSource);
        return jte;
    }

    //创建事务管理器
    @Bean
    public DataSourceTransactionManager getTransactionManager(DataSource dataSource){
        final DataSourceTransactionManager TransactionManager = new DataSourceTransactionManager();
        TransactionManager.setDataSource(dataSource);
        return TransactionManager;

    }
}
