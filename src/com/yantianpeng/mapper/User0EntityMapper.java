package com.yantianpeng.mapper;

import com.yantianpeng.entity.User0Entity;
import java.util.List;

public interface User0EntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User0Entity record);

    User0Entity selectByPrimaryKey(Integer id);

    List<User0Entity> selectAll();

    int updateByPrimaryKey(User0Entity record);
}