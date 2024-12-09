package com.spark.betaSite.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class boxDTO {
    @JsonProperty("company_name")
    private String company_name;
    @JsonProperty("company_phone")
    private String company_phone;
}
