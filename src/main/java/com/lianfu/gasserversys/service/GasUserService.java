package com.lianfu.gasserversys.service;


import com.lianfu.gasserversys.mapper.GasUserMapper;
import com.lianfu.gasserversys.mapper.Gas_masgMapper;
import com.lianfu.gasserversys.mode.GasUser;
import com.lianfu.gasserversys.mode.Gas_appid;
import com.lianfu.gasserversys.mode.Gas_masg;
import com.lianfu.gasserversys.mode.Gas_mername;
import com.lianfu.gasserversys.util.dateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class GasUserService {

    private final Logger logger = LoggerFactory.getLogger(GasUserService.class);

    @Autowired
    GasUserMapper gasUserMapper;
    @Autowired
    Gas_mernameService mer;
    @Autowired
    Gas_appidService gas_appidService;
    @Autowired
    Gas_masgMapper gas_masgMapper;



  /* public List<GasUser> GetUserAll(){
       return gasUserMapper.GetUserAll();
   }*/

   public  boolean GetUser(String username){
       String resut="";
       try {
           resut=gasUserMapper.GetUserWherUsername(username);
           if(!StringUtils.isEmpty(resut)){
               return false;
           }else {
               return true;
           }

       } catch (Exception e) {
        logger.info("GasUserService/GetUser错误信息："+e.getMessage());

       }
      return false;
   }


/*   public   String  SetUser(GasUser gasUser){
       try {
           Gas_mername gasmer= mer.GetMer(gasUser.getMername());
           if(!"".equals(gasmer) && gasmer!=null){
               boolean boo=false;
               gasUser.setCid(gasmer.getCid());
               gasUser.setInputdate(dateUtil.getDate());
               int i=gasUserMapper.SetUser(gasUser);
               int uid=GetUserUid(gasUser.getUsername());
               logger.info("查询出来的uid:"+uid+"查询出来的公司id:"+gasmer.getCid());
               String Appid[]=new String[gasUser.getGasname().length];
               for (int j=0;j<=gasUser.getGasname().length-1;j++){
                   Gas_masg gas_masg= gas_masgMapper.getAppid(gasUser.getGasname()[j]);
                     if (gas_masg!=null){
                         Appid[j]=gas_masg.getAppid();
                     }else {
                         return gasUser.getGasname()[j]+"不存在";
                     }
               }
               System.out.println(Appid.toString());
               gasUser.setAppid(Appid);

               for (int j=0;j<=gasUser.getAppid().length-1;j++){
                   Gas_appid gas=new Gas_appid();
                   gas.setUid(uid);
                   gas.setAppid(gasUser.getAppid()[j]);
                   gas.setGasname(gasUser.getGasname()[j]);
                   boo=  gas_appidService.SetGas_appid(gas);
               }

               if(i>0){
                   if(boo){
                       return "录入成功";
                   }
               }else {
                   return "录入失败";
               }

           }

       } catch (Exception e) {
           logger.info("GasUserService/SetUser错误信息："+e.getMessage());
             return "录入失败";
       }
       return "";
   }*/

   public int GetUserUid(String username){
       int i=0;
       try {
            i= gasUserMapper.GetUserUid(username);
       } catch (Exception e) {
           logger.info("查询用户uid错误信息:"+e.getMessage());
       }
       return i;
   }





   /*public String GetUser(String username,String password){
       logger.info("账户："+username+"|密码："+password);
       try {
           GasUser gasUser= gasUserMapper.GetUser(username,password);

           if(gasUser==null || "".equals(gasUser) ){
               if (!username.equals(gasUser.getUsername()) && !password.equals(gasUser.getPassword())){
                   return "账户不存在";
               }
               if (!username.equals(gasUser.getUsername()) && password.equals(gasUser.getPassword())){
                   return "账户不正确";
               }else  if (username.equals(gasUser.getUsername()) && !password.equals(gasUser.getPassword())){
                   return "密码不正确";
               }
             return "";
           }else {
               return "登录成功";
           }
       } catch (Exception e) {
           logger.info("错误信息："+e.getMessage());
           return "登录失败";
       }


   }*/









}
