package com.akkanben.songr;

import com.akkanben.songr.controller.PracticeFeaturesController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class PracticeFeaturesTest {

    @Autowired
    MockMvc mockMVC;

    @Test
    void test_context_loads() {
        PracticeFeaturesController sut = new PracticeFeaturesController();
        assertNotNull(sut, "Test controller was null!");
    }

    @Test
    void test_hello_no_name() throws Exception
    {
        mockMVC.perform(get("/hello"))
                .andDo(print())
                .andExpect(content().string(containsString("<h1>Hello World!</h1>")))
                .andExpect(status().isOk());
    }

    @Test
    void test_hello_with_name() throws Exception
    {
        mockMVC.perform(get("/hello/Ben"))
                .andDo(print())
                .andExpect(content().string(containsString("<h1>Hello Ben!</h1>")))
                .andExpect(status().isOk());
    }

    @Test
    void test_hello_with_name_and_space() throws Exception
    {
        mockMVC.perform(get("/hello/Ben Mills"))
                .andDo(print())
                .andExpect(content().string(containsString("<h1>Hello Ben Mills!</h1>")))
                .andExpect(status().isOk());
    }

    @Test
    void test_capitalize() throws Exception
    {
        mockMVC.perform(get("/capitalize/potato"))
                .andDo(print())
                .andExpect(content().string(containsString("<h1>POTATO</h1>")))
                .andExpect(status().isOk());
    }
}
