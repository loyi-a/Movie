package org.seiryo.movie.dao;

import org.apache.ibatis.annotations.Mapper;
import org.seiryo.movie.pojo.MY_ORDER;

import java.util.List;

/** 订单数据层
 * @Description
 * @Author 罗伊
 * @Date 14/1/2025
 */
@Mapper
public interface OrderMapper {

    //获取数据库中所有订单信息
    List<MY_ORDER> queryAllOrder(MY_ORDER myOrder);
}

