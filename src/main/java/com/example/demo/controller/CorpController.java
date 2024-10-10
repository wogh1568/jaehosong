package com.example.demo.controller;

import com.example.demo.domain.Corp;
import com.example.demo.domain.params.CorpParams;
import com.example.demo.domain.result.CorpResult;
import com.example.demo.service.CorpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/corps")
public class CorpController {

    @Autowired
    private CorpService corpService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public CorpResult selectList(){
        CorpParams corpParams = CorpParams.builder().build();
        List<Corp> corpList =corpService.selectList(corpParams);
        return CorpResult.builder()
                .corps(corpList)
                .build();
    }


    @RequestMapping(value = "", method = RequestMethod.POST)
    public void insert(
            @RequestBody Corp corp
    ){
        corpService.insert(corp);
    }

    @RequestMapping(value = "/{corp_Idx}",method = RequestMethod.PUT)
    public void update(
            @RequestBody Corp corp
    ){
        corpService.update(corp);
    }

    @RequestMapping(value = "/{corpIdx}",method = RequestMethod.DELETE)
    public void delete(
            @PathVariable("corpIdx") Integer corpIdx
    ){
        corpService.delete(corpIdx);
    }




}
