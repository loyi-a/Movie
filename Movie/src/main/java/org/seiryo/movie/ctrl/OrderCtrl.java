package org.seiryo.movie.ctrl;

import org.seiryo.movie.pojo.ADMIN_INFO;
import org.seiryo.movie.pojo.MY_ORDER;
import org.seiryo.movie.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;
import java.util.List;

/** 订单控制层
 * @Description
 * @Author 罗伊
 * @Date 14/1/2025
 */
@Controller
@RequestMapping("/orderCtrl")
public class OrderCtrl {

    @Autowired
    private OrderService orderService ;

    /** 获取所有订单信息
     * @param mv
     * @return ModelAndView
     * @author 罗伊
     * @date 13/1/2025
     **/
    @RequestMapping("/queryAllOrder")
    public ModelAndView queryAllOrder(ModelAndView mv, HttpSession session) {

        //获取管理员信息
        ADMIN_INFO admin = (ADMIN_INFO) session.getAttribute("admin");
        //获取管理员权限
        Integer level = admin.getADMIN_QX();

        //获取数据库中所有订单信息
        List<MY_ORDER> orderList = orderService.queryAllOrder(new MY_ORDER(null,null,null));

        //添加模型数据
        mv.addObject("orderList", orderList);
        mv.addObject("level", level);

        //返回到日志页
        mv.setViewName("order");
        return mv;

    }

}