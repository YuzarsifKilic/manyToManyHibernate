package com.example.cvv2.dto;

public class CreateExperienceRequest {

    private String companyName;
    private int cvId;

    public CreateExperienceRequest() {}

    public CreateExperienceRequest(String companyName, int cvId) {
        this.companyName = companyName;
        this.cvId = cvId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCvId() {
        return cvId;
    }

    public void setCvId(int cvId) {
        this.cvId = cvId;
    }
}
