package com.jenkins.spring_jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringJenkinsApplicationTests {


	@Test
	void contextLoads() {
		System.out.println("test case executing");
		assertEquals(true, true);
	}

}
