package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;

@SpringBootApplication
public class Day6Application {

	public static void main(String[] args) {
		SpringApplication.run(Day6Application.class, args);
		System.out.println("Hello Yavi!!");
	}

}
