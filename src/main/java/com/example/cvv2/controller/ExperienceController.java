package com.example.cvv2.controller;

import com.example.cvv2.dto.CreateExperienceRequest;
import com.example.cvv2.model.Experince;
import com.example.cvv2.service.ExperienceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/experience")
public class ExperienceController {

    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @PostMapping("/save")
    public Experince save(@RequestBody CreateExperienceRequest request) {
        return experienceService.save(request);
    }
}
