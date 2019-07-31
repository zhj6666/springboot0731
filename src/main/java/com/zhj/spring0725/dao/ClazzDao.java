package com.zhj.spring0725.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface ClazzDao {

    @Select("select * from clazz")
    public List<Map> selectClazz();
}
