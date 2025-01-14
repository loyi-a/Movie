package org.seiryo.movie.dao;

import org.apache.ibatis.annotations.Mapper;
import org.seiryo.movie.pojo.MY_USER;
import org.seiryo.movie.pojo.MY_USER_INFO;

import java.util.List;

/** 用户数据层接口
 * @Description
 * @Author 罗伊
 * @Date 10/1/2025
 */
@Mapper
public interface UserMapper {

    //获取数据库中所有用户信息
    List<MY_USER> queryAllUser(MY_USER myUser);

    //插入用户表
    boolean insertUser(MY_USER myUser);

    //插入用户详情表
    boolean insertUserInfo(MY_USER_INFO myUserInfo);


}

