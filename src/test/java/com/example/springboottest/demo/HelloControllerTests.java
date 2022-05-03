package com.example.springboottest.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(classes = HelloController.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
// @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTests {

	@Autowired
	private TestRestTemplate template;

	@Test
	public void hello_ok() throws Exception {
		ResponseEntity<String> response = template.getForEntity("/hello", String.class);
		assertThat(response.getBody()).contains("Hello, World!");
	}

	@Test
	public void hello_with_name_ok() throws Exception {
		ResponseEntity<String> response = template.getForEntity("/hello?name=Tester", String.class);
		assertThat(response.getBody()).contains("Hello, Tester!");
	}

}
