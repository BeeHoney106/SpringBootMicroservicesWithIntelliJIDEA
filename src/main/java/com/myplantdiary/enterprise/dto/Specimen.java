package com.myplantdiary.enterprise.dto;


import lombok.Data;

public @Data
class  Specimen {
    private int plantId;
    String specimenId;
    String latitude;
    String longitude;
    String description;
}
