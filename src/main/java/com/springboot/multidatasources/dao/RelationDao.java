package com.springboot.multidatasources.dao;

import com.springboot.multidatasources.config.datasource.DatabaseContextHolder;
import com.springboot.multidatasources.config.datasource.DatabaseType;
import com.springboot.multidatasources.entity.Relation;
import com.springboot.multidatasources.mapper.RelationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RelationDao {
    @Autowired
    private RelationMapper relationMapper;

    public Relation getRelationByIdFromLocalDb(Integer id){
        DatabaseContextHolder.setDatabaseType(DatabaseType.localDB);
        return relationMapper.getRelationById(id);
    }

    public Relation getRelationByIdFromRemoteDb(Integer id){
        DatabaseContextHolder.setDatabaseType(DatabaseType.remoteDB);
        return relationMapper.getRelationById(id);
    }
}
