package com.devnied.liquibase.includemulti;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class IncludeMultiApplicationTest {

	@Autowired
	private IncludeMultiApplication application;

	@Test
	void main() {
		assertNotNull(application);
	}
}