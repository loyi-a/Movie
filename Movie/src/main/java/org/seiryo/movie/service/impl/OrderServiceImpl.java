package org.seiryo.movie.service.impl;

import org.seiryo.movie.dao.OrderMapper;
import org.seiryo.movie.pojo.MY_ORDER;
import org.seiryo.movie.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/** 订单服务层接口实现类
 * @Description
 * @Author 罗伊
 * @Date 14/1/2025
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    /* 获取全部订单
     * @param myOrder
     * @return List<MY_ORDER>
     * @author 罗伊
     * @date 14/1/2025
     **/
    @Override
    public List<MY_ORDER> queryAllOrder(MY_ORDER myOrder) {
        return orderMapper.queryAllOrder(myOrder);
    }


}