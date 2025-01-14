package org.seiryo.movie.service;

import org.seiryo.movie.pojo.MY_ORDER;

import java.util.List;

/** 订单服务层
 * @Description
 * @Author 罗伊
 * @Date 14/1/2025
 */
public interface OrderService {

    //获取数据库中所有订单信息
    List<MY_ORDER> queryAllOrder(MY_ORDER myOrder);


}

