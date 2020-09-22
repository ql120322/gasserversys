package com.lianfu.gasserversys.web;


import com.lianfu.gasserversys.mode.GasUser;
import com.lianfu.gasserversys.service.GasUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("setgasuser")
public class GasUserController {
    @Autowired
    GasUserService gasUserService;


   /* @RequestMapping("setuser")
    @ResponseBody
    public  String SetGasUser(GasUser gasUser){
       boolean boo= gasUserService.GetUser(gasUser.getUsername());
        String resut="";
        if(boo){
             resut=  gasUserService.SetUser(gasUser);
        }else {
            resut="账户已存在";
        }



        return resut;
    }
*/



}
