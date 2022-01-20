package com.example.crudgablemintbombchuan.service;

import com.example.crudgablemintbombchuan.entity.SffCfgLov;
import com.example.crudgablemintbombchuan.exception.ResourceNotFoundException;
import com.example.crudgablemintbombchuan.repository.SffCfgLovRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SffCfgLovService {
    @Autowired
    private SffCfgLovRepository sffCfgLovRepo;

    public List<SffCfgLov> findAll(){
        return sffCfgLovRepo.findAll();
    }

    public ResponseEntity<SffCfgLov> findById(String ROW_ID){
        SffCfgLov sffCfgLov=sffCfgLovRepo.findById(ROW_ID).orElseThrow(()->new ResourceNotFoundException("SffCfgLov not exist with ROW_ID : " + ROW_ID));
        return ResponseEntity.ok(sffCfgLov);
    }

    public SffCfgLov create(SffCfgLov sffCfgLov){
        return sffCfgLovRepo.save(sffCfgLov);
    }

    public ResponseEntity<SffCfgLov> update(String ROW_ID,SffCfgLov sffCfgLovDetail){
        SffCfgLov sffCfgLov=sffCfgLovRepo.findById(ROW_ID).map(x->{
            x.copy(sffCfgLovDetail);
            return sffCfgLovRepo.save(x);
        }).orElseGet(()->{
            throw new ResourceNotFoundException("SffCfgLov not exist with ROW_ID : " + ROW_ID);
        });
        return ResponseEntity.ok(sffCfgLov);
    }

    public ResponseEntity<Map<String,Boolean>> delete(String ROW_ID){
        SffCfgLov sffCfgLov=sffCfgLovRepo.findById(ROW_ID).orElseThrow(()->new ResourceNotFoundException("SffCfgLov not exist with ROW_ID : " + ROW_ID));
        sffCfgLovRepo.delete(sffCfgLov);
        Map<String,Boolean> response = new HashMap<>();
        response.put("delete",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
