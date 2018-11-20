package com.up.selling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing //插入数据时自动创建时间的注解
public class SellingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellingApplication.class, args);
	}
}
