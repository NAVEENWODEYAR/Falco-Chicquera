package com.bhas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FalconApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(FalconApplication.class, args);
		System.out.println(FalconApplication.class);
	}

}
