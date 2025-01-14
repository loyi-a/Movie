package org.seiryo.movie.dao;

import org.apache.ibatis.annotations.Mapper;
import org.seiryo.movie.pojo.DY_INFO;
import java.util.List;

/** 电影数据层
 * @Description
 * @Author 罗伊
 * @Date 13/1/2025
 */
@Mapper
public interface DyMapper {

    //获取所有电影
    List<DY_INFO> queryAllDy(DY_INFO dyInfo);

    //根据电影名称获取电影详情
    DY_INFO getDyByName(DY_INFO dyInfo);

}

