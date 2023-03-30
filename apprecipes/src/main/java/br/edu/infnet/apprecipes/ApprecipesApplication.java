package br.edu.infnet.apprecipes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApprecipesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApprecipesApplication.class, args);
	}

}
