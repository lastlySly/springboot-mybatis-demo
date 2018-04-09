package cn.lastlysly.config.dao;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-04-02 18:16
 **/
@Configuration
public class SessionFactoryConfiguration {
    // mybatis配置文件的路径
    @Value("${mybatis_config_file}")
    private String mybatisConfigFilePath;
    //mybatis mapper文件所在路径
    @Value("${mapper_path}")
    private String mapperPath;
    //实体类所在的package，，即pojo
    @Value("${pojo_package}")
    private String pojoPackage;

    //@Qualifier("dataSource")  按照名字加载dataSource
    //SessionFactoryConfiguration定义了名为dataSource的Bean
   @Autowired
   @Qualifier("dataSource")
    private DataSource dataSource;


    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        //设置mybatis配置文件路径
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(mybatisConfigFilePath));

        //指定mapper路径
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//       源码： java.lang.String CLASSPATH_URL_PREFIX = "classpath:";
        String packageSearchPath = PathMatchingResourcePatternResolver.CLASSPATH_URL_PREFIX + mapperPath;
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(packageSearchPath));

        //引用数据源
        sqlSessionFactoryBean.setDataSource(dataSource);

        //设置pojo包所在位置
        sqlSessionFactoryBean.setTypeAliasesPackage(pojoPackage);

        return sqlSessionFactoryBean;
    }
}
