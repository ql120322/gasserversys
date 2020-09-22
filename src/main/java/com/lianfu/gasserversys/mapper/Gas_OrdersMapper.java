package com.lianfu.gasserversys.mapper;



import com.lianfu.gasserversys.mode.Gas_CountResponse;
import com.lianfu.gasserversys.mode.Gas_order;

import java.util.List;
import java.util.Map;

public interface Gas_OrdersMapper {
    List<Gas_order> findGasOrders(List list, Gas_order gasOrder);
    Map<String,Object> findOrdersCount(List list, Gas_order gasOrder);
    Gas_CountResponse findAmountCount(List list, Gas_order gasOrder);


}
