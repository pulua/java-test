package com.example.demo;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		System.out.println("test");
		HashMap<Integer , HashMap<String , String>> dim2 = new HashMap<>();
		HashMap<String , String> vec1 = new HashMap<>();
		vec1.put("id", "1111");
		vec1.put("em", "xxxx");
		dim2.put(0, vec1);
		
		vec1.put("id", "2222");
		vec1.put("em", "yyyy");
		dim2.put(1, vec1);
		
		vec1.put("id", "3333");
		vec1.put("em", "zzzz");
		dim2.put(2, vec1);
		
		System.out.println("size=>"+dim2.size());
		System.out.println("columns size=>"+vec1.size());
		
		
		SpringApplication.run(HelloApplication.class, args);
	}
}
