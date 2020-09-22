package com.lianfu.gasserversys.service;


import com.lianfu.gasserversys.mapper.Gas_mernameMapper;
import com.lianfu.gasserversys.mode.Gas_mername;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Gas_mernameService {
    private final Logger logger = LoggerFactory.getLogger(Gas_mernameService.class);
    @Autowired
    Gas_mernameMapper mer;

    public Gas_mername GetMer(String mername){
        Gas_mername resut =null;
        try {
            resut= mer.GetMer(mername);
        } catch (Exception e) {
            logger.info("查询公司名结果："+resut);
        }

         return resut;
    }


    public String SetMer(String mername){
        try {
            Gas_mername  gasMername= GetMer(mername);
            if(gasMername!=null){
                return "该公司名已存在";
            }else {
                int i=mer.SetMer(mername);
                if(i>0){
                    return "添加公司名成功";
                }
            }
        } catch (Exception e) {
            logger.info("Gas_mernameService/SetMer报错"+e.getMessage()+"||参数："+mername);
           return "";
        }

       return "";

    }

    public List<Gas_mername> GetMerAll(){
        List<Gas_mername> list=new ArrayList<>();
        try {
            list=mer.GetMerAll();
            return list;
        } catch (Exception e) {
            logger.info("Gas_mernameService/GetMerAll报错"+e.getMessage());
            return list;
        }
    }









}
