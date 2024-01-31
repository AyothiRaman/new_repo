package com.transactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TransactionalDemoExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionalDemoExampleApplication.class, args);
	}

}
