package com.example.cvv2.service;

import com.example.cvv2.dto.CreateExperienceRequest;
import com.example.cvv2.model.Cv;
import com.example.cvv2.model.Experince;
import com.example.cvv2.repository.ExperienceRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ExperienceService {

    private final ExperienceRepository experienceRepository;
    private final CvService cvService;

    public ExperienceService(ExperienceRepository experienceRepository, CvService cvService) {
        this.experienceRepository = experienceRepository;
        this.cvService = cvService;
    }

    public Experince save(CreateExperienceRequest request) {
        Set<Cv> cvs = new HashSet<>();
        Cv cv = cvService.findById(request.getCvId());

        cvs.add(cv);

        Experince experience = new Experince(
                request.getCompanyName(),
                cvs
        );

        return experienceRepository.save(experience);
    }
}
