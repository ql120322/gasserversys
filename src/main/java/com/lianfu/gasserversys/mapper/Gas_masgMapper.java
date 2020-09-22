package com.lianfu.gasserversys.mapper;



import com.lianfu.gasserversys.mode.Gas_masg;

import java.util.List;

public interface Gas_masgMapper {
    int SetGas_Masg(Gas_masg gas_masg);
    Gas_masg getAppid(String gasname);



}
