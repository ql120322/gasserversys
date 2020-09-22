package com.lianfu.gasserversys.mapper;


import com.lianfu.gasserversys.mode.Gas_appid;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Gas_appidMapper {

    int SetGas_appid(@Param(value = "uid") int uid,@Param(value = "appid") String appid);


}
