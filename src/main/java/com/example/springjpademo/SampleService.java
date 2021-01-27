package com.example.springjpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 26.01.2021.</p>
 * <p>Project: spring-jpa-demo</p>
 * *
 */
@Service
public class SampleService {


    @Autowired
    private SampleRepoWithSpecification sampleRepoWithSpecification;
    @Autowired
    private SampleRepo sampleRepo;

    public void displayRedSamples() {
        for (Sample sample : sampleRepoWithSpecification.findAll(SampleSpecification.colorSpec("red"))) {
            System.out.println(sample.toString());
        }
    }

    public void displayFirstSample() {
        System.out.println(sampleRepo.idQuery(1L).toString());
    }

}
