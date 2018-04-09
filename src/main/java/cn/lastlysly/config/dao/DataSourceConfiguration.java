package cn.lastlysly.config.dao;

import com.jolbox.bonecp.BoneCPDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-04-02 17:50
 **/

//@MapperScan("cn.lastlysly.mapper")配置mybatis mapper的扫描路径
@Configuration
@MapperScan("cn.lastlysly.mapper")
public class DataSourceConfiguration {
    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.username}")
    private String jdbcUsername;
    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean(name="dataSource")
    public BoneCPDataSource createDataSource(){
        BoneCPDataSource dataSource = new BoneCPDataSource();
        dataSource.setDriverClass(jdbcDriver);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(jdbcUsername);
        dataSource.setPassword(jdbcPassword);

        dataSource.setDefaultAutoCommit(true);
        return dataSource;
    }
}
