package com.ed.panda.demo.web;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @Author: Edward
 * @Date: 2020/9/1 下午6:09
 */
public class LotteryWebTest extends WebBaseTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testLottery() throws Exception {

        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders
                .post("/lottery")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .param("activityId", "639301")
                .param("uToken", "t2dfgh3j73ui2ghjx==");

        String response = mockMvc.perform(builder)
                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().json("{}"))
//                .andDo(MockMvcResultHandlers.print())
                .andReturn().getResponse().getContentAsString();

        System.out.println(response);
    }
}
