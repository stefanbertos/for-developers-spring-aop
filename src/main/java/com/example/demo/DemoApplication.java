package com.example.demo;

import com.example.demo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private TestService testService;

	public DemoApplication(TestService testService) {
		this.testService = testService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("calling method from mail {}", testService.dummyMethod("really dummy"));
	}
}
