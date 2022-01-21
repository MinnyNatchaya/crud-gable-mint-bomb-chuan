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

    @GetMapping("/{rowId}")
    public ResponseEntity<SffCfgLov> findById(@PathVariable String rowId){
        return sffCfgLovService.findById(rowId);
    }

    @PostMapping("")
    public SffCfgLov create(@RequestBody SffCfgLov sffCfgLov){
        return sffCfgLovService.create(sffCfgLov);
    }

    @PutMapping("/{rowId}")
    public ResponseEntity<SffCfgLov> update(@PathVariable String rowId,@RequestBody SffCfgLov sffCfgLov){
        return sffCfgLovService.update(rowId,sffCfgLov);
    }

    @DeleteMapping("/{rowId}")
    public ResponseEntity<Map<String,Boolean>> delete(@PathVariable String rowId){
        return sffCfgLovService.delete(rowId);
    }






}
