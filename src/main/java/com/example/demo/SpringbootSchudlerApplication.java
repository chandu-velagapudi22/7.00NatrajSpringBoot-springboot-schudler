package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.example.demo.service.GenerateReports;

@SpringBootApplication
@EnableScheduling
public class SpringbootSchudlerApplication {

	@Autowired
	private static GenerateReports generateReports;

	public static void ii(GenerateReports generateReports) {
		generateReports.mySalesReport();

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSchudlerApplication.class, args);
		generateReports.mySalesReport();
		System.out.println(" I AM EXICTING THE SCHEDULING");
		System.out.println("I EXICUTED THE METHOD");

	}

}
