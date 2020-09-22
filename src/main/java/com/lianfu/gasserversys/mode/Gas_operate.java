package com.lianfu.gasserversys.mode;

import org.springframework.stereotype.Component;

@Component
public class Gas_operate {

    private int uid;
    private String job;
    private String appid;

    private  String Inputdate;//录入时间
    private  String update;//修改时间


    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getInputdate() {
        return Inputdate;
    }

    public void setInputdate(String inputdate) {
        Inputdate = inputdate;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    @Override
    public String toString() {
        return "Gas_operate{" +
                "uid=" + uid +
                ", job='" + job + '\'' +
                ", appid='" + appid + '\'' +
                ", Inputdate='" + Inputdate + '\'' +
                ", update='" + update + '\'' +
                '}';
    }
}
