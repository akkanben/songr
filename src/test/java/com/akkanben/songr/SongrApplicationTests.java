package com.akkanben.songr;

import com.akkanben.songr.controller.AlbumController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@AutoConfigureMockMvc
class SongrApplicationTests {

	@Autowired
	MockMvc mockMVC;


	@Test
	void contextLoads() {
		AlbumController sut = new AlbumController();
		assertNotNull(sut, "The controller was null.");
	}

	@Test
	void test_index() throws Exception {
		mockMVC.perform(get("/")).andDo(print())
				.andExpect(content().string(containsString("<a href=\"/\">home</a>")))
				.andExpect(status().isOk());
	}

}
