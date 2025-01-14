package org.seiryo.movie.service;

import org.seiryo.movie.pojo.ADMIN_INFO;
import org.seiryo.movie.pojo.LOG_INFO;

import java.util.List;

/** 管理员服务层接口
 * @Description
 * @Author 罗伊
 * @Date 13/1/2025
 */
public interface AdminService {

    //判断是否是管理员账号
    boolean pdAdmin(ADMIN_INFO adminInfo);

    //获取数据库中所有日志信息
    List<LOG_INFO> queryAllLog(LOG_INFO logInfo);

}

