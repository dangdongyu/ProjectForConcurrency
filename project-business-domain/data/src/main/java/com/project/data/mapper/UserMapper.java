package com.project.data.mapper;

import com.project.data.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User findByName(String name);
}
