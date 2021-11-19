package com.xy.oaweb;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})
@MapperScan("com.xy.oaservice.dao")
@EnableSwagger2
public class OaWebApplication {
	public static void main(String[] args) {

		SpringApplication.run(OaWebApplication.class, args);


	}

}
