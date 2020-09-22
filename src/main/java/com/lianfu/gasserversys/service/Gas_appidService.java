package com.lianfu.gasserversys.service;


import com.lianfu.gasserversys.mapper.Gas_appidMapper;
import com.lianfu.gasserversys.mode.Gas_appid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Gas_appidService {
    private final Logger logger = LoggerFactory.getLogger(Gas_appidService.class);

    @Autowired
    Gas_appidMapper gas_appidMapper;

    public  boolean SetGas_appid(int uid, String appid){
        boolean boo=false;
        try {
            int i= gas_appidMapper.SetGas_appid(uid,appid);
            if(i>0){
                boo=true;
            }
            return  boo;
        } catch (Exception e) {
            logger.info("Gas_appidMapper错误信息"+e.getMessage());
            return  boo;
        }

    }



}
