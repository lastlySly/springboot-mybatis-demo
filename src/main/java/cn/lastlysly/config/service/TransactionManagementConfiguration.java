package cn.lastlysly.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-04-09 15:45
 **/
@Configuration
@EnableTransactionManagement
public class TransactionManagementConfiguration implements TransactionManagementConfigurer{
//    @Qualifier("dataSource")
    @Autowired
    private DataSource dataSource;

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
