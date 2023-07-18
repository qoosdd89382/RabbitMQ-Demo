package com.example.rabbitmq.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
public class AppApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private TesteController testeController;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testSend() throws Exception {
		mockMvc.perform(get("/teste/test")).andExpect(status().isOk());
		mockMvc.perform(get("/teste/test")).andExpect(status().isOk());
		mockMvc.perform(get("/teste/test")).andExpect(status().isOk());
		mockMvc.perform(get("/teste/test")).andExpect(status().isOk());
	}
}
