package org.seiryo.movie.ctrl;

import org.seiryo.movie.dao.UserMapper;
import org.seiryo.movie.pojo.ADMIN_INFO;
import org.seiryo.movie.pojo.LOG_INFO;
import org.seiryo.movie.pojo.MY_USER;
import org.seiryo.movie.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;
import java.util.List;

/** 管理员控制层
 * @Description
 * @Author 罗伊
 * @Date 13/1/2025
 */
@Controller
@RequestMapping("/adminCtrl")
public class AdminCtrl {

    @Autowired
    private AdminService adminService;

    @Autowired
    private UserMapper userMapper;

    /** 获取所有日志信息
     * @param mv
     * @return ModelAndView
     * @author 罗伊
     * @date 13/1/2025
     **/
    @RequestMapping("/queryAllLog")
    public ModelAndView queryAllLog(ModelAndView mv, HttpSession session) {

        //获取管理员信息
        ADMIN_INFO admin = (ADMIN_INFO) session.getAttribute("admin");
        //获取管理员权限
        Integer level = admin.getADMIN_QX();

        //获取数据库中所有日志信息
        List<LOG_INFO> logList = adminService.queryAllLog(new LOG_INFO(null,null,null,null));

        //添加模型数据
        mv.addObject("logList", logList);
        mv.addObject("level", level);
        //返回到日志页
        mv.setViewName("LogInfo");
        return mv;

    }

    /** 获取所有用户信息
     * @param mv
     * @return ModelAndView
     * @author 罗伊
     * @date 13/1/2025
     **/
    @RequestMapping("/queryAllUser")
    public ModelAndView queryAllUser(ModelAndView mv, HttpSession session) {

        //获取管理员信息
        ADMIN_INFO admin = (ADMIN_INFO) session.getAttribute("admin");
        //获取管理员权限
        Integer level = admin.getADMIN_QX();

        //获取数据库中所有用户信息
        List<MY_USER> userList = userMapper.queryAllUser(new MY_USER(null,null,null));

        //添加模型数据
        mv.addObject("userList", userList);
        mv.addObject("level", level);

        //返回到日志页
        mv.setViewName("UserInfo");
        return mv;

    }

}