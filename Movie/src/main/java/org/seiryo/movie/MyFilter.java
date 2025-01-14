package org.seiryo.movie;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** 自定义过滤器
 * @Description
 * @Author 罗伊
 * @Date 9/1/2025
 */
public class MyFilter implements HandlerInterceptor {

   /** 设置拦截器
    * @param request
    * @param response
    * @param handler
    * @return boolean
    * @author 罗伊
    * @date 9/1/2025
    **/
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //通过
        return true;
    }

}