package com.example.rest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import ch.qos.logback.classic.Logger;

@SpringBootTest
class SpringDataRest1ApplicationTests {

	@Test
	void contextLoads() {
		Logger logger =(Logger) LoggerFactory.getLogger(SpringDataRest1ApplicationTests.class);
		
		logger.info("tests executing");
		assertThat(true).equals(true);
		
	}

}
