package com.springboot.multidatasources.controller;

import com.springboot.multidatasources.config.datasource.DatabaseType;
import com.springboot.multidatasources.entity.Relation;
import com.springboot.multidatasources.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RelationController {

    @Autowired
    private RelationService relationService;

    @GetMapping("/relation/{id}")
    public Relation getRelationById(@PathVariable("id")int id,
                                    @RequestParam("dataBaseType")String dataBaseType){

        if(dataBaseType.equals(DatabaseType.localDB.toString())){
            return relationService.getRelationByIdFromLocalDb(id);
        }else if(dataBaseType.equals(DatabaseType.remoteDB.toString())){
            return relationService.getRelationByIdFromRemoteDb(id);
        }

        return new Relation();
    }

}
