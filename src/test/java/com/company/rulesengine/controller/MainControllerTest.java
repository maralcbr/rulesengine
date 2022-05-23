package com.company.rulesengine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MainControllerTest {

    @Autowired
    private TestRestTemplate template;

//    @Test
//    public void getRules() throws Exception {
//        ResponseEntity<String> response = template.getForEntity("/rules", String.class);
//        assertThat(response.getBody()).isEqualTo("Rules!");
//    }
}