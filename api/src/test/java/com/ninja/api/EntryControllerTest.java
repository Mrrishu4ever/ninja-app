package com.ninja.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class EntryControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void createsAndListsEntry() throws Exception {
        mockMvc.perform(post("/entries")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"content\":\"Test entry\",\"mood\":\"calm\"}"))
            .andExpect(status().isCreated())
            .andExpect(jsonPath("$.content").value("Test entry"));

        mockMvc.perform(get("/entries"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$[0].mood").value("calm"));
    }
}
