package com.example.springjpademo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



/**
 * *
 * <p>Created by irina on 26.01.2021.</p>
 * <p>Project: spring-jpa-demo</p>
 * *
 */
public interface SampleRepo extends CrudRepository<Sample,Long> {
    
    @Query(value = "select sample from Sample sample where sample.id = :id")
    Sample idQuery(Long id);
}
