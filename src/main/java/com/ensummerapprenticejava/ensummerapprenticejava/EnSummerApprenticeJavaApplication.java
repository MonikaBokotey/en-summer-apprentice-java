package com.ensummerapprenticejava.ensummerapprenticejava;

import com.ensummerapprenticejava.ensummerapprenticejava.controller.EventController;
import com.ensummerapprenticejava.ensummerapprenticejava.controller.OrderController;
import com.ensummerapprenticejava.ensummerapprenticejava.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class EnSummerApprenticeJavaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(EnSummerApprenticeJavaApplication.class, args);
		EventController ec = context.getBean(EventController.class);
		OrderController ec2 = context.getBean(OrderController.class);
		ec.toString();
		ec2.toString();

	}


}
