package com.example.springjpademo;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * *
 * <p>Created by irina on 26.01.2021.</p>
 * <p>Project: spring-jpa-demo</p>
 * *
 */

@Repository
public interface SampleRepoWithSpecification extends CrudRepository<Sample, Long>, JpaSpecificationExecutor<Sample> {


}
