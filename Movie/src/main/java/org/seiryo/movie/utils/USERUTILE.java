package org.seiryo.movie.utils;
import org.seiryo.movie.pojo.ADMIN_INFO;
import org.seiryo.movie.pojo.MY_USER;
/**
 * @Description 用户工具类
 * @Author 罗伊
 * @Date 10/1/2025
 */
public class USERUTILE {

    //储存用户信息
    public static MY_USER  MY_USER  = null;

    //储存管理员信息
    public static ADMIN_INFO ADMIN_INFO  = null;

    //保存用户登录失败次数
    private static Integer userLoginErrorNum = 0;

    //获取登录失败次数
    public static Integer getUserLoginErrorNum() {
        return userLoginErrorNum;
    }

    //设置失败登录次数
    public static void setUserLoginErrorNum(Integer userLoginErrorNum) {
        USERUTILE.userLoginErrorNum = userLoginErrorNum;
    }


}
