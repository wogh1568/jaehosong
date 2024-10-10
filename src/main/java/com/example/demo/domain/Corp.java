package com.example.demo.domain;

import lombok.Data;

import java.io.Serializable;
@Data
public class Corp implements Serializable {
    private Integer corp_Idx;
    private String corp_Name;
    private String corp_Number;
}
