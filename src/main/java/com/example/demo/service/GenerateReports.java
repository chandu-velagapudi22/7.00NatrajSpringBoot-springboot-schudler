package com.example.demo.service;

import java.util.Date;

import org.springframework.stereotype.Component;


@Component
public class GenerateReports {

	public static void ss() {
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("This is static method");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");

	}

	public void mySalesReport() {
		System.out.println("**************");
		System.out.println("welcome chandu");
		System.out.println(new Date());
		System.out.println("sucess chandu");
		System.out.println("***************");
	}

	public void add() {
		System.out.println(("%%%%%%%%%%%%%%%%%%%%%%%"));
		System.out.println("This is add()");
		System.out.println(("%%%%%%%%%%%%%%%%%%%%%%%"));
	}
}
