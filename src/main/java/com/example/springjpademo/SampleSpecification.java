package com.example.springjpademo;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

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
