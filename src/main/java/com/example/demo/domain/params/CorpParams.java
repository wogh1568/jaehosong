package com.example.demo.domain.params;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CorpParams {
    private Integer corp_Idx;
    private String corp_Name;
    private String corp_Number;
}
