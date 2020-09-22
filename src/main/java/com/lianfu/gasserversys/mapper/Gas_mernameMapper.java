package com.lianfu.gasserversys.mapper;



import com.lianfu.gasserversys.mode.Gas_mername;

import java.util.List;

public interface Gas_mernameMapper {

    Gas_mername GetMer(String mername);

    int SetMer(String mername);


    List<Gas_mername> GetMerAll();






}
