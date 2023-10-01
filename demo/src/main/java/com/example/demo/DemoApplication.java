package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*Esta anotación se utiliza para marcar una clase principal de la aplicación Spring Boot 
y suele ubicarse en la clase que contiene el método main() de la aplicación.*/
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hola !");
	}

}
