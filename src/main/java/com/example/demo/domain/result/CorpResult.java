package com.example.demo.domain.result;

import com.example.demo.domain.Corp;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class CorpResult {
    private List<Corp> corps;
}
