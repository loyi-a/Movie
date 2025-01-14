package org.seiryo.movie.dao;

import org.apache.ibatis.annotations.Mapper;
import org.seiryo.movie.pojo.ADMIN_INFO;
import org.seiryo.movie.pojo.LOG_INFO;

import java.util.List;

/** 管理员数据层接口
 * @Description
 * @Author 罗伊
 * @Date 13/1/2025
 */
@Mapper
public interface AdminMapper {

    //获取数据库中所有管理员信息
    List<ADMIN_INFO> queryAllAdmin(ADMIN_INFO adminInfo);

    //获取数据库中所有日志信息
    List<LOG_INFO> queryAllLog(LOG_INFO logInfo);


}

