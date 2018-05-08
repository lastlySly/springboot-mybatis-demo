package cn.lastlysly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootMybatisDemoApplication  extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringbootMybatisDemoApplication.class);
	}
	public static void main(String[] args) {
		//		SpringApplication.run(SpringbootMybatisDemoApplication.class, args);


		SpringApplication springApplication = new SpringApplication(SpringbootMybatisDemoApplication.class);
//		springApplication.setBannerMode(Banner.Mode.OFF); 关闭banner
		springApplication.run(args);
	}
}
