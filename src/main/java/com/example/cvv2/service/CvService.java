package com.example.cvv2.service;

import com.example.cvv2.dto.CreateCvRequest;
import com.example.cvv2.exception.CvNotFoundException;
import com.example.cvv2.model.Cv;
import com.example.cvv2.repository.CvRepository;
import org.springframework.stereotype.Service;

@Service
public class CvService {

    private final CvRepository cvRepository;

    public CvService(CvRepository cvRepository) {
        this.cvRepository = cvRepository;
    }

    public Cv save(CreateCvRequest request) {
        Cv cv = new Cv(
                request.getName()
        );
        return cvRepository.save(cv);
    }

    public Cv findById(int id) {
        return cvRepository.findById(id).orElseThrow(
                () -> new CvNotFoundException("Cv Bulunamadı")
        );
    }
}
