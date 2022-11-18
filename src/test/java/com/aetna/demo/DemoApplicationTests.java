package com.aetna.demo;

import com.aetna.demo.control.HelloController;
import org.junit.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DemoApplicationTests {

	@Autowired
	HelloController helloController;

	@Test
	public void contextLoads() {
	}

	@Test
	public void HelloControllerTest(){
		assertThat(helloController.index()).isEqualTo("Greetings from Spring Boot!");
	}

}
