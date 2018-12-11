package com.tongudn.microservicsimpleprovideruser.dao;


import com.tongudn.microservicsimpleprovideruser.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Vee
 */
@Mapper
public interface UserMapper {

    User findById(@Param("id")Long id);
}
