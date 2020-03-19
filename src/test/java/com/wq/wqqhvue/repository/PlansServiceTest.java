package com.wq.wqqhvue.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by Mr LMF on 2020-03-02 22:58
 */
@SpringBootTest
class PlansServiceTest {

    @Autowired
    private PlansService plansService;
    @Test
    void findAll(){
        System.out.println(plansService.findAll());
    }
}