package com.bridgelabz.addressbook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class AddressbookApplication {

	public static void main(String[] args) {
		ApplicationContext context=  SpringApplication.run(AddressbookApplication.class, args);
		//SpringApplication.run(AddressbookApplication.class, args);

		log.info("Employee Payroll app Started in {} Enviorment", context.getEnvironment().getProperty("enviroment"));
		log.info("Employee payroll DB User is {} ", context.getEnvironment().getProperty("spring.datasource.username"));
	}

}
