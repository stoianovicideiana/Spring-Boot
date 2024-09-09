package com.itschool.project;

import com.itschool.project.services.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ProjectApplicationTests {

	@Test
	void contextLoads() {
		ApplicationContext context = new AnnotationConfigApplicationContext(ProjectApplication.class);
		GreetingService greetingService = context.getBean(GreetingService.class);

		String greeting = greetingService.greet();
		System.out.println(greeting);
	}
}