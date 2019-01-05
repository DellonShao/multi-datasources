package com.springboot.multidatasources.service;


import com.springboot.multidatasources.dao.RelationDao;
import com.springboot.multidatasources.entity.Relation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelationService {
    @Autowired
    private RelationDao relationDao;

    public Relation getRelationByIdFromLocalDb(Integer id){
        return relationDao.getRelationByIdFromLocalDb(id);
    }

    public Relation getRelationByIdFromRemoteDb(Integer id){
        return relationDao.getRelationByIdFromRemoteDb(id);
    }
}
