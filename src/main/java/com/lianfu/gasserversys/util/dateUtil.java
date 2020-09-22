package com.lianfu.gasserversys.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public  class dateUtil {

    public static String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(new Date());
        return format ;
    }



}
