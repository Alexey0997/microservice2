package com.example.microservice2.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String getText() {
        return "Home";
    }

}