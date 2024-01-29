package org.example.lang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.lang.bean.User;

@Mapper
public interface UserMapper {
    User getUserByName(String username);
}
