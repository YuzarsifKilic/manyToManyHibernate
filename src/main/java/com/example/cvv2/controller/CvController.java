package com.example.cvv2.controller;

import com.example.cvv2.dto.CreateCvRequest;
import com.example.cvv2.model.Cv;
import com.example.cvv2.service.CvService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cv")
public class CvController {

    private final CvService cvService;

    public CvController(CvService cvService) {
        this.cvService = cvService;
    }

    @PostMapping("/save")
    public Cv save(@RequestBody CreateCvRequest request) {
        return cvService.save(request);
    }
}
