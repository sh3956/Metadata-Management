package com.emma.bootscala.controller;

import com.emma.bootscala.domain.MetaDatabase;
import com.emma.bootscala.service.MetaDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meta")
public class MetaDatabaseController {

    @Autowired
    private MetaDatabaseService metaDatabaseService;

    @RequestMapping(value = "/", method= RequestMethod.POST)
    public String save(@ModelAttribute MetaDatabase metaDatabase){
        metaDatabaseService.save(metaDatabase);
        return "success";
    }

}
