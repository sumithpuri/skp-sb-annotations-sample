package xyz.sumithpuri.spring.boot.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import xyz.sumithpuri.spring.boot.annotation.configuration.SBASampleConfigurationProperties;


//@SpringBootApplication
@EnableAutoConfiguration
@SpringBootConfiguration
@ComponentScan(basePackages = "xyz.sumithpuri.spring.boot.annotation")
public class SpringBootAnnotationApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotationApplication.class, args);
	}
		
}
