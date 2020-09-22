package com.lianfu.gasserversys.service;


import com.lianfu.gasserversys.mapper.Gas_masgMapper;
import com.lianfu.gasserversys.mode.Gas_masg;
import com.lianfu.gasserversys.util.dateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class Gas_masgService {

    private final Logger logger = LoggerFactory.getLogger(Gas_masgService.class);

    @Autowired
    Gas_masgMapper gas_masgMapper;

    public String SetGas_Msg(Gas_masg gas_masg){


        try {
            if(!"".equals(gas_masg) && gas_masg!=null){
              int i=  getAppid(gas_masg.getGasname());
              if(i==0){
                  int j= gas_masgMapper.SetGas_Masg(gas_masg);
                  if(j>0) {
                      return "添加加油站信息成功";
                  } else {
                      return "添加加油站信息失败";
                  }
              }else if(i==-1){
                  return "信息已存在";
              }
            }else {
                return "加油站信息为空";
            }
        } catch (Exception e) {
            logger.info("Gas_masgService/SetGas_Msg报错信息："+e.getMessage()+"||参数："+gas_masg+"||时间："+ dateUtil.getDate());
            return "添加加油站信息出错了";
        }


       return "";
    }


    public int getAppid(String gasname){
        try {
           Gas_masg str= gas_masgMapper.getAppid(gasname);
           if(str!=null){
               return -1;
           }else {
               return 0;
           }

        } catch (Exception e) {
           logger.info("Gas_masgService/getAppid报错信息："+e.getMessage()+"||参数："+gasname+"||时间：");
            return  -2;
        }
    }











}
