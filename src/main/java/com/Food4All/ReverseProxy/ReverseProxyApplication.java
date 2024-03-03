package com.Food4All.ReverseProxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class ReverseProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReverseProxyApplication.class, args);
	}

}
