package assets;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public enum ObjectFactory {
    
    INSTANCE;
    
    private JdbcTemplate jdbcTemplate;

    public synchronized JdbcTemplate getJdbcTemplate(){

       if (jdbcTemplate == null) {
            MysqlDataSource dataSource;
            dataSource = new MysqlDataSource();
            dataSource.setDatabaseName("dochadzky");
            dataSource.setUser("dochadzkyUser");
            dataSource.setPassword("dochadzkyPassword");
            jdbcTemplate = new JdbcTemplate(dataSource);
       }
        return jdbcTemplate;
    }


}
