package org.seiryo.movie.service.impl;

import org.seiryo.movie.dao.UserMapper;
import org.seiryo.movie.pojo.MY_USER;
import org.seiryo.movie.pojo.MY_USER_INFO;
import org.seiryo.movie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.seiryo.movie.utils.USERUTILE;
import java.util.List;

/** 用户服务层接口实现类
 * @Description
 * @Author 罗伊
 * @Date 10/1/2025
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

  /** 验证账号密码是否正确
   * @param myUser
   * @return boolean
   * @author 罗伊
   * @date 13/1/2025
   **/
    @Override
    public boolean pdNameAndPass(MY_USER myUser) {

        //获取数据库中所有用户信息
        List<MY_USER> userList = userMapper.queryAllUser(myUser);

        //验证账号密码是否正确
        for(MY_USER user: userList) {
            if(user.getUSER_NAME().equals(myUser.getUSER_NAME())) {
                if(user.getUSER_PASS().equals(myUser.getUSER_PASS())) {
                    //储存用户登录信息
                    USERUTILE.MY_USER = user;
                    return true;
                }
            }
        }
        return false;
    }

    /** 插入用户表
     * @param myUser
     * @return boolean
     * @author 罗伊
     * @date 13/1/2025
     **/
    @Override
    public boolean insertUser(MY_USER myUser) {
        return userMapper.insertUser(myUser);
    }

    /** 插入用户详情表
     * @param myUserInfo
     * @return boolean
     * @author 罗伊
     * @date 13/1/2025
     **/
    @Override
    public boolean insertUserInfo(MY_USER_INFO myUserInfo) {
        return userMapper.insertUserInfo(myUserInfo);
    }

   /** 判断账号是否重复
    * @param myUser
    * @return boolean
    * @author 罗伊
    * @date 13/1/2025
    **/
    @Override
    public boolean pdName(MY_USER myUser) {

        //获取数据库中所有用户信息
        List<MY_USER> userList = userMapper.queryAllUser(myUser);

        //用户存在
        if(userList.size() > 0){
            for(MY_USER user: userList) {
                //账号重复
                if(user.getUSER_NAME().equals(myUser.getUSER_NAME())) {
                    return false;
                }
            }
        }
        //账号不重复
        return true;

    }
}