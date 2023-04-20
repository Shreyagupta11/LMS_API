package spring.com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class LmsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmsApiApplication.class, args);
	}

}
