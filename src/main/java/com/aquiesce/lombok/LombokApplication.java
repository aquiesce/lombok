package com.aquiesce.lombok;

import com.aquiesce.lombok.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokApplication {

	public static void main(String[] args) {

		SpringApplication.run(LombokApplication.class, args);
		System.out.println("Hello");

		User obj = new User((long) 1,"matt","smith");

		System.out.println("hi:" + obj.getFirstName());
		System.out.println("toString: " + obj.toString());
		System.out.println("w: " + obj.hashCode());

		System.out.println(obj.saySomething());

	}

}
