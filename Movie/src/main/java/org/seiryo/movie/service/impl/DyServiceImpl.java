package org.seiryo.movie.service.impl;

import org.seiryo.movie.pojo.DY_INFO;
import org.seiryo.movie.service.DyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.seiryo.movie.dao.DyMapper;
import java.util.List;

/** 电影服务层实现类
 * @Description
 * @Author 罗伊
 * @Date 13/1/2025
 */
@Service
public class DyServiceImpl implements DyService {

    @Autowired
    private DyMapper dyMapper;

    /** 获取所有电影
     * @param dyInfo
     * @return List<DY_INFO>
     * @author 罗伊
     * @date 13/1/2025
     **/
    @Override
    public List<DY_INFO> queryAllDy(DY_INFO dyInfo) {
        return dyMapper.queryAllDy(dyInfo);
    }

    /** 根据电影名称获取电影详情
     * @param dyInfo
     * @return DY_INFO
     * @author 罗伊
     * @date 14/1/2025
     **/
    @Override
    public DY_INFO getDyByName(DY_INFO dyInfo) {
        return dyMapper.getDyByName(dyInfo);
    }


}