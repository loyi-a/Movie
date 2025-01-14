package org.seiryo.movie.ctrl;

import org.seiryo.movie.pojo.ADMIN_INFO;
import org.seiryo.movie.pojo.MY_USER;
import org.seiryo.movie.pojo.MY_USER_INFO;
import org.seiryo.movie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.seiryo.movie.utils.AJAX_UTIL;
import org.seiryo.movie.utils.USERUTILE;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.seiryo.movie.service.AdminService;
import org.springframework.web.bind.annotation.RestController;

/** 用户控制层
 * @Description
 * @Author 罗伊
 * @Date 13/1/2025
 */
@RestController
@RequestMapping("/userCtrl")
public class UserCtrl {

    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;

    /** 用户登录
     * @param userName
     * @param userPass
     * @return String
     * @author 罗伊
     * @date 10/1/2025
     **/
    @RequestMapping("/userLogin")
    @ResponseBody
    public String userLogin(@RequestParam("userName") String userName, @RequestParam("userPass") String userPass, HttpSession session) {

        //判断是否是管理员账号
        boolean pd = adminService.pdAdmin(new ADMIN_INFO(null,userName,userPass,null,null));

        if(pd){

            //保存管理员信息
            session.setAttribute("admin", USERUTILE.ADMIN_INFO);
            //是管理员
            return AJAX_UTIL.ADMIN_LOGIN_SUCCESS;

        }else{
            //不是管理员
            //验证账号密码是否正确
            boolean bo = userService.pdNameAndPass(new MY_USER(null, userName, userPass));

            if (bo) {
                //保存用户信息
                session.setAttribute("user", USERUTILE.MY_USER);
                //登陆成功
                return AJAX_UTIL.USER_LOGIN_SUCCESS;
            } else {
                //登陆失败
                return AJAX_UTIL.USER_LOGIN_ERROR;
            }
        }


    }

    /** 用户注册
     * @param userName
     * @param userPass
     * @param userPhone
     * @return String
     * @author 罗伊
     * @date 13/1/2025
     **/
    @RequestMapping("/userRegister")
    @ResponseBody
    public String userRegister(@RequestParam("userName") String userName, @RequestParam("userPass") String userPass, @RequestParam("userPhone") String userPhone) {

        //判断账号是否重复
        boolean pd = userService.pdName(new MY_USER(null, userName, null));

        if(pd){
            //创建用户注册的信息，插入用户表和用户详情表
            MY_USER myUser = new MY_USER(null, userName, userPass);
            MY_USER_INFO myUserInfo = new MY_USER_INFO(null, null, 0.0, 0, "无", userPhone, 1);

            //插入用户表
            boolean bo1 = userService.insertUser(myUser);

            //插入用户详情表
            if (bo1) {
                myUserInfo.setUSER_ID(myUser.getUSER_ID());
                boolean bo2 = userService.insertUserInfo(myUserInfo);

                if (bo2) {
                    //注册成功
                    return AJAX_UTIL.USER_REGIST_SUCCESS;
                } else {
                    //用户详情插入失败
                    return AJAX_UTIL.USER_REGIST_ERROR;
                }
            } else {
                //用户表插入失败
                return AJAX_UTIL.USER_REGIST_ERROR;
            }
        }else{

            //账号重复
            return AJAX_UTIL.USER_REGIST_SAME;
        }

    }



    /** 退出登录
     * @param req
     * @return String
     * @author 罗伊
     * @date 10/1/2025
     **/
    @RequestMapping("logout")
    public String logout(HttpServletRequest req){
        //获取之前的session
        HttpSession session = req.getSession(false);
        if (session != null) {
            //让当前session失效
            session.invalidate();
        }
        //返回到登陆页
        return "login";
    }



}