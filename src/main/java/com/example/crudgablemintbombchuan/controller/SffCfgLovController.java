package com.example.crudgablemintbombchuan.controller;


import com.example.crudgablemintbombchuan.entity.SffCfgLov;
import com.example.crudgablemintbombchuan.service.SffCfgLovService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/sffCfgLovs")
public class SffCfgLovController {
    @Autowired
    private SffCfgLovService  sffCfgLovService;

    @GetMapping("")
    public List<SffCfgLov> findAll(){
        return sffCfgLovService.findAll();
    }

    @GetMapping("/{ROW_ID}")
    public ResponseEntity<SffCfgLov> findById(@PathVariable String ROW_ID){
        return sffCfgLovService.findById(ROW_ID);
    }

    @PostMapping("")
    public SffCfgLov create(@RequestBody SffCfgLov sffCfgLov){
        return sffCfgLovService.create(sffCfgLov);
    }

    @PutMapping("/{ROW_ID}")
    public ResponseEntity<SffCfgLov> update(@PathVariable String ROW_ID,@RequestBody SffCfgLov sffCfgLov){
        return sffCfgLovService.update(ROW_ID,sffCfgLov);
    }

    @DeleteMapping("/{ROW_ID}")
    public ResponseEntity<Map<String,Boolean>> delete(@PathVariable String ROW_ID){
        return sffCfgLovService.delete(ROW_ID);
    }






}
