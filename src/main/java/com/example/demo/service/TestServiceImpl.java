package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestServiceImpl implements TestService {
    @Override
    public String dummyMethod(String input) {
      log.info("inside dummy method, input is {}", input);
        return "executed";
    }
}
