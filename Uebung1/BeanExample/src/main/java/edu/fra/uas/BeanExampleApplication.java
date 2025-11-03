package edu.fra.uas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import edu.fra.uas.controller.*;
import edu.fra.uas.service.MessageService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class BeanExampleApplication {

	private static final Logger log = LoggerFactory.getLogger(BeanExampleApplication.class);

	@Autowired
	private BeanController beanController;
	@Autowired
	private MessageService messageService;

	public static void main(String[] args) {
		SpringApplication.run(BeanExampleApplication.class, args);
	}

	@Bean // In der main methode wird nach Objekten gesucht, die mit @Bean annotiert sind
			// ohne das @Bean wird das Objekt nie ausgeführt
	CommandLineRunner init() {
		CommandLineRunner action = new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {

				log.debug(beanController.putMessage("Hello World!"));
				log.debug(beanController.putMessage("(^_^)"));
				System.out.println(messageService.getCounter());
			}
		};
		return action;
	}
}
