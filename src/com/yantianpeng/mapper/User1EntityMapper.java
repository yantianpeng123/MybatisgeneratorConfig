package com.yantianpeng.mapper;

import com.yantianpeng.entity.User1Entity;
import java.util.List;

public interface User1EntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User1Entity record);

    User1Entity selectByPrimaryKey(Integer id);

    List<User1Entity> selectAll();

    int updateByPrimaryKey(User1Entity record);
}