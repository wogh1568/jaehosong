package com.example.demo.dao;

import com.example.demo.domain.Corp;
import com.example.demo.domain.params.CorpParams;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CorpDao {
    List<Corp> selectList(CorpParams corpParams);

    void insert(Corp corp);

    void update(Corp corp);

    void delete(Integer corpIdx);
}
