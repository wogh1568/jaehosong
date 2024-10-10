package com.example.demo.service;

import com.example.demo.dao.CorpDao;
import com.example.demo.domain.Corp;
import com.example.demo.domain.params.CorpParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorpService {
    @Autowired
    private CorpDao corpDao;
    public List<Corp> selectList(CorpParams corpParams) {
        return corpDao.selectList(corpParams);
    }

    public void insert(Corp corp) {
        corpDao.insert(corp);
    }

    public void update(Corp corp) {
        corpDao.update(corp);
    }

    public void delete(Integer corpIdx) {
        corpDao.delete(corpIdx);
    }
}
