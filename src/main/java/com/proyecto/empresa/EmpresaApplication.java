package com.proyecto.empresa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude=HibernateJpaAutoConfiguration.class)
public class EmpresaApplication{


	
	public static void main(String[] args) {
		SpringApplication.run(EmpresaApplication.class, args);
	}

}
