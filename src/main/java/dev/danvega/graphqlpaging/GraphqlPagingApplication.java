package dev.danvega.graphqlpaging;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlPagingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlPagingApplication.class, args);
	}

	@Bean
	public Faker faker() {
		return new Faker();
	}
}
