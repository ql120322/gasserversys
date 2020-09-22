package com.lianfu.gasserversys.service;


import com.lianfu.gasserversys.mapper.Gas_locMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Gas_locService {
    private final Logger logger = LoggerFactory.getLogger(Gas_locService.class);
    @Autowired
    Gas_locMapper gas_locMapper;

    public String  GetLoc(){
          String loc="";
        try {
            loc= gas_locMapper.GetLoc();
            return loc;
        } catch (Exception e) {
           logger.info("Gas_locService/GetLoc查询省市区地址报错"+e.getMessage());
           return loc;
        }
    }




}
