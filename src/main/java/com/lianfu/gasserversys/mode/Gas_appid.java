package com.lianfu.gasserversys.mode;

import org.springframework.stereotype.Component;

@Component
public class Gas_appid {

    private  int uid;
    private  String appid;
    private  String gasname;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getGasname() {
        return gasname;
    }

    public void setGasname(String gasname) {
        this.gasname = gasname;
    }

    @Override
    public String toString() {
        return "Gas_appid{" +
                "uid=" + uid +
                ", appid='" + appid + '\'' +
                ", gasname='" + gasname + '\'' +
                '}';
    }
}
