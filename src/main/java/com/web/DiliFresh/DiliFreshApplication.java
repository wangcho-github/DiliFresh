package com.web.DiliFresh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan("com.web.DiliFresh")
public class DiliFreshApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiliFreshApplication.class, args);
	}

}
