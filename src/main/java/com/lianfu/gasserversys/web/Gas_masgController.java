package com.lianfu.gasserversys.web;


import com.alibaba.fastjson.JSONObject;
import com.lianfu.gasserversys.mode.Gas_masg;
import com.lianfu.gasserversys.mode.Gas_mername;
import com.lianfu.gasserversys.service.Gas_appidService;
import com.lianfu.gasserversys.service.Gas_locService;
import com.lianfu.gasserversys.service.Gas_masgService;
import com.lianfu.gasserversys.service.Gas_mernameService;
import com.lianfu.gasserversys.util.dateUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("gasmsg")
public class Gas_masgController {


    @Autowired
    Gas_masgService gas_masgService;
    @Autowired
    Gas_mernameService gas_mernameService;
    @Autowired
    Gas_locService gas_locService;






    @RequestMapping( value = "GetLocAndMer",method = RequestMethod.GET)
    public  String GetLocAndMer(){
      List<Gas_mername> list=  gas_mernameService.GetMerAll();
      String loc= gas_locService.GetLoc();
      JSONObject js=new JSONObject();
         if(list==null){
             js.put("code","-1");
             js.put("msg","公司名数据为空");
             return js.toJSONString();
         }
         if(StringUtils.isEmpty(loc)){
             js.put("code","-1");
             js.put("msg","地址数据为空");
             return js.toJSONString();
         }
         if(!StringUtils.isEmpty(loc) && list!=null){
             js.put("code","200");
             js.put("msg","查询成功");
             js.put("mer",list);
             js.put("loc",loc);
             return js.toJSONString();
         }
      return "";
    }

     @ApiOperation("录入加油站")
     @RequestMapping(value = "setgasmsg",method = RequestMethod.GET )
    public  String SetGas_Masg(Gas_masg gas_masg){
         JSONObject js=new JSONObject();
        if(gas_masg.getGas_mername_id()<=0){
            js.put("code","-1");
            js.put("msg","公司id数据为空");
            return js.toJSONString();
        }

         gas_masg.setInputdate(dateUtil.getDate());
       String resut=  gas_masgService.SetGas_Msg(gas_masg);





        return resut;
    }

    @RequestMapping("setgasmsgmername")
    public  String SetMer(String mername){
         String resut=gas_mernameService.SetMer(mername);
         return resut;
    }

   /* @RequestMapping("getparentAll")
    public String getParentAll(Model model){
        List<Gas_loc> list=gas_locService.GetParentAll();
        System.out.println(list.toString());
        model.addAttribute("list",list);
        return "a.html";

    }

    @RequestMapping("getregion")
    public  String getParentWhere(String name,Model model){
        int id=gas_locService.GetCity_id(name);
        List<Gas_loc> list=gas_locService.GetRegionWhereParent_id(id);
        System.out.println(list.toString());
        model.addAttribute("list",list);
        return "a.html";
    }*/






















}
