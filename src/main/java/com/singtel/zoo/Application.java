package com.singtel.zoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.singtel.zoo.animals.Rooster;
import com.singtel.zoo.config.Message;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		// To check Rooster sound in French
		Rooster rooster = ctx.getBean(Rooster.class);
		rooster.sing();

	}

	@Bean
	public Rooster getRooster() {
		return new Rooster();
	}

	@Bean
	public Message getMessage() {
		return new Message();
	}

}
