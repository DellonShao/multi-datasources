package com.springboot.multidatasources.mapper;

import com.springboot.multidatasources.entity.Relation;
import org.apache.ibatis.annotations.Select;

public interface RelationMapper {

    @Select("select * from relation where r_id = #{id}")
    public Relation getRelationById(Integer id);
}
