package UserRegister;

import net.sf.log4jdbc.sql.jdbcapi.DataSourceSpy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by KAJIWARAYutaka on 2015/04/18.
 */
@Configuration
public class DBConfig {

    @Autowired
    DataSourceProperties properties;
    DataSource dataSource;

    @Bean
    DataSource realDataSource() {
        String url;
        String username;
        String password;

        url = this.properties.getUrl();
        username = this.properties.getUsername();
        password = this.properties.getPassword();
        DataSourceBuilder factory = DataSourceBuilder.create()
                .driverClassName(this.properties.getDriverClassName())
                .url(url).username(username).password(password);
        this.dataSource = factory.build();
        return new DataSourceSpy(dataSource);
    }
}
