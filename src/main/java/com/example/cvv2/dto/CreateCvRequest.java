package com.example.cvv2.dto;

public class CreateCvRequest {

    private String name;

    public CreateCvRequest() {}

    public CreateCvRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
