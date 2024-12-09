package com.spark.betaSite.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
public class Box {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long boxID;
    @JsonProperty("company_name")
    private String company_name;
    @JsonProperty("company_phone")
    private String company_phone;

    public Box(Long boxID, String company_name, String company_phone) {
        this.boxID = boxID;
        this.company_name = company_name;
        this.company_phone = company_phone;
    }

    public Box() {
    }
}
