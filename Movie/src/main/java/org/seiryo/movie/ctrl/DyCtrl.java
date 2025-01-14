package org.seiryo.movie.ctrl;

import org.seiryo.movie.pojo.ADMIN_INFO;
import org.seiryo.movie.pojo.DY_INFO;
import org.seiryo.movie.pojo.MY_USER;
import org.seiryo.movie.service.AdminService;
import org.seiryo.movie.service.DyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/** 电影控制层
 * @Description
 * @Author 罗伊
 * @Date 13/1/2025
 */
@Controller
@RequestMapping("/dyCtrl")
public class DyCtrl {

    @Autowired
    private DyService dyService;

    /** 获取所有电影信息
     * @param mv
     * @return ModelAndView
     * @author 罗伊
     * @date 13/1/2025
     **/
    @RequestMapping("/queryAllDy")
    public ModelAndView queryAllDy(ModelAndView mv, HttpSession session) {

        //获取管理员信息
        ADMIN_INFO admin = (ADMIN_INFO) session.getAttribute("admin");
        //获取管理员权限
        Integer level = admin.getADMIN_QX();

        //获取所有电影
        List<DY_INFO> dyList = dyService.queryAllDy(new DY_INFO(null,null,null,null,null,null,null));

        //添加模型数据
        mv.addObject("dyList", dyList);
        mv.addObject("level", level);

        //返回到日志页
        mv.setViewName("movie");
        return mv;

    }

    /** 获取所有电影详情信息
     * @param mv
     * @return ModelAndView
     * @author 罗伊
     * @date 13/1/2025
     **/
    @RequestMapping("/queryAllDyInfo")
    public ModelAndView queryAllDyInfo(ModelAndView mv, HttpSession session) {

        //获取用户信息
        MY_USER user = (MY_USER) session.getAttribute("user");

        //获取所有电影
        List<DY_INFO> dyList = dyService.queryAllDy(new DY_INFO(null,null,null,null,null,null,null));

        //添加模型数据
        mv.addObject("dyList", dyList);
        mv.addObject("user", user);

        //返回到电影页面
        mv.setViewName("index");
        return mv;

    }
    /** 获取所有电影详情信息
     * @param mv
     * @return ModelAndView
     * @author 罗伊
     * @date 13/1/2025
     **/
    @RequestMapping("/getDyByName")
    public ModelAndView getDyByName(@RequestParam("movieName") String movieName, ModelAndView mv) {

        //根据电影名称获取电影详情
        DY_INFO dy = dyService.getDyByName(new DY_INFO(null,movieName,null,null,null,null,null));

        //添加模型数据
        mv.addObject("dy", dy);

        //返回到电影详情页面
        mv.setViewName("single");
        return mv;

    }


}