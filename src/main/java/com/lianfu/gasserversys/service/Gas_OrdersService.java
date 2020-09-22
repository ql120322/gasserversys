package com.lianfu.gasserversys.service;


import com.lianfu.gasserversys.mapper.Gas_OrdersMapper;
import com.lianfu.gasserversys.mode.Gas_CountResponse;
import com.lianfu.gasserversys.mode.Gas_order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.*;

@Service
public class Gas_OrdersService {
    @Autowired
    public Gas_OrdersMapper ordersMapper;

    public Map<String,Object> findGasOrders(List gasnames, Gas_order gasOrder) {
        HashMap<String, Object> messageResult = new HashMap<>();
        List<Gas_order> gasOrders = ordersMapper.findGasOrders(gasnames, gasOrder);
        messageResult.put("gasOrders",gasOrders);

        //封装订单统计
        try {
            Map<String, Object> ordersCount = ordersMapper.findOrdersCount(gasnames, gasOrder);
            Object paysuccess = ordersCount.get("paysuccess");
            Object paywait = ordersCount.get("paywait");
            Object payfailed = ordersCount.get("payfailed");
            messageResult.put("paysuccess",paysuccess);
            messageResult.put("paywait",paywait);
            messageResult.put("payfailed",payfailed);
        }catch (NullPointerException e){
            System.out.println("部分没有值==已经截取封装订单统计的空指针异常");
        }

        //封装金额统计
        Gas_CountResponse findAmountCount = ordersMapper.findAmountCount(gasnames, gasOrder);
        try {
        if (findAmountCount==null){
            messageResult.put("receivable","0");
            messageResult.put("net_receipts","0");
            messageResult.put("Discount","0");
        }else {
            messageResult.put("receivable",findAmountCount.getReceivable());
            messageResult.put("net_receipts",findAmountCount.getNet_receipts());
            messageResult.put("Discount",findAmountCount.getDiscount());
        }
        }catch (NullPointerException e){
             System.out.println("部分没有值==已经截取封装金额统计的空指针异常");
        }
          return messageResult;
    }


    public String findGasMsg(String province,String city,String area){
        return null;
    }
}
