package com.example.springjpademo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

/**
 * *
 * <p>Created by irina on 26.01.2021.</p>
 * <p>Project: spring-jpa-demo</p>
 * *
 */
@Entity
public class Sample extends AbstractBaseEntity {

    private Integer version;
    private String sample;
    private String color;

    @Basic
    @Column(name = "version")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Basic
    @Column(name = "sample")
    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    @Basic
    @Column(name = "color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sample sample1 = (Sample) o;
        return Objects.equals(id, sample1.id) && Objects.equals(version, sample1.version) && Objects.equals(sample,
                sample1.sample) && Objects.equals(color, sample1.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, sample, color);
    }

    @Override
    public String toString() {
        return "Sample: " +
                "id=" + id +
                ", version=" + version +
                ", sample='" + sample + '\'' +
                ", color='" + color + '\'' +
                ' ';
    }
}
