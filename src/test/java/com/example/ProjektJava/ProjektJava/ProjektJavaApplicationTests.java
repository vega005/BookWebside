package com.example.ProjektJava.ProjektJava;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.function.BooleanSupplier;

@SpringBootTest
//@RunWith(JUnit4.class)
//@AutoConfigureMockMvc
public class ProjektJavaApplicationTests {

	@Autowired
	private Library library;

//	@Autowired
//	private MockMvc mockMvc;

	@Test
	void contextLoads() {
		Assertions.assertThat(library).isNotNull();
	}



}
