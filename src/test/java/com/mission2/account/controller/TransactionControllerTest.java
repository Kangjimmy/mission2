package com.mission2.account.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mission2.account.service.TransactionService;
import org.junit.jupiter.api.Test;
import org.redisson.client.protocol.decoder.ObjectMapDecoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(TransactionController.class)
class TransactionControllerTest {

    @MockBean
    private TransactionService transactionService;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void successUserBalance() {
        //given
    }


}