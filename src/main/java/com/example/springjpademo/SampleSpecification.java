package com.example.springjpademo;

import org.springframework.data.jpa.domain.Specification;


/**
 * *
 * <p>Created by irina on 26.01.2021.</p>
 * <p>Project: spring-jpa-demo</p>
 * *
 */
public class SampleSpecification {

    public static Specification<Sample> colorSpec(String color) {
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("color"), color);
    }
}
