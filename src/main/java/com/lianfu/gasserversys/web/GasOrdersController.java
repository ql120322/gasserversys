package com.lianfu.gasserversys.web;

import com.alibaba.fastjson.JSON;
import com.lianfu.gasserversys.mode.Gas_order;
import com.lianfu.gasserversys.service.Gas_OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("order")
public class GasOrdersController {

    //1.根据uid查询所有加油站
    //2.根据地理位置 查询加油站


    //uid  省 市 区  加油站    起始日期 终止日期

    //uid ====查油站
    //省市区===查油站
    @Autowired
    public Gas_OrdersService ordersService;
    @RequestMapping("findGasOrders")
    public String findGasOrders(){
        //设置查询加油站名称
        ArrayList<String> gasnames = new ArrayList<>();
        gasnames.add("testID3");

        //设置查询时间区间
        Gas_order gasOrder = new Gas_order();
/*      gasOrder.setOrder_date("2020-09-20 18:35:21");
        gasOrder.setOrder_endtime("2020-09-20 18:46:39");*/
        Map<String, Object> gasOrders = ordersService.findGasOrders(gasnames, gasOrder);
        gasOrders.put("code","200");
        gasOrders.put("msg","查询成功");
        return  JSON.toJSONString(gasOrders);
    }
}
