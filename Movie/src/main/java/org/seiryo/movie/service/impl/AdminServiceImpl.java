package org.seiryo.movie.service.impl;

import org.seiryo.movie.pojo.ADMIN_INFO;
import org.seiryo.movie.pojo.LOG_INFO;
import org.seiryo.movie.service.AdminService;
import org.seiryo.movie.utils.USERUTILE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.seiryo.movie.dao.AdminMapper;
import java.util.List;

/** 管理员服务层实现类
 * @Description
 * @Author 罗伊
 * @Date 13/1/2025
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    /**
     * @param adminInfo
     * @return boolean
     * @author 罗伊
     * @date 13/1/2025
     **/
    @Override
    public boolean pdAdmin(ADMIN_INFO adminInfo) {

        //获取数据库中所有管理员信息
        List<ADMIN_INFO> adminList = adminMapper.queryAllAdmin(adminInfo);

        //管理员存在
        if(adminList.size() > 0){
            for(ADMIN_INFO admin: adminList) {
                //账号密码正确
                if(admin.getADMIN_NAME().equals(adminInfo.getADMIN_NAME())) {
                    if(admin.getADMIN_PASS().equals(adminInfo.getADMIN_PASS())){
                        //储存管理员登录信息
                        USERUTILE.ADMIN_INFO = admin;
                        return true;
                    }

                }
            }
        }
        //不是管理员
        return false;

    }

    /** 获取数据库中所有日志信息
     * @param logInfo
     * @return List<LOG_INFO>
     * @author 罗伊
     * @date 13/1/2025
     **/
    @Override
    public List<LOG_INFO> queryAllLog(LOG_INFO logInfo) {
        return adminMapper.queryAllLog(logInfo);
    }

}
