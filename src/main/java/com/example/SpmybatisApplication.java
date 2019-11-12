package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
@SpringBootApplication
public class SpmybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpmybatisApplication.class, args);
	}

}
