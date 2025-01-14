package org.seiryo.movie.service;


import org.seiryo.movie.pojo.MY_USER;
import org.seiryo.movie.pojo.MY_USER_INFO;

/** 用户服务层接口
 * @Description
 * @Author 罗伊
 * @Date 10/1/2025
 */
public interface UserService {

    //验证账号密码是否正确
    boolean  pdNameAndPass(MY_USER myUser);

    //插入用户表
    boolean insertUser(MY_USER myUser);

    //插入用户详情表
    boolean insertUserInfo(MY_USER_INFO myUserInfo);

    //判断账号是否重复
    boolean pdName(MY_USER myUser);


}

