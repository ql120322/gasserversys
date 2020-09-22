package com.lianfu.gasserversys.mode;

import org.springframework.stereotype.Component;

@Component
public class GasDevice {
    private   int did;
    private  String gas_name;//所属加油站名称
    private  String appid;//所属加油站appid
    private  String Refueling_gun_ip;//加油枪ip
    private  String Refueling_gun_name;//加油枪别名
    private  String Entrytime;//录入时间
    private  String Updata;//修改时间


    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getGas_name() {
        return gas_name;
    }

    public void setGas_name(String gas_name) {
        this.gas_name = gas_name;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getRefueling_gun_ip() {
        return Refueling_gun_ip;
    }

    public void setRefueling_gun_ip(String refueling_gun_ip) {
        Refueling_gun_ip = refueling_gun_ip;
    }

    public String getRefueling_gun_name() {
        return Refueling_gun_name;
    }

    public void setRefueling_gun_name(String refueling_gun_name) {
        Refueling_gun_name = refueling_gun_name;
    }

    public String getEntrytime() {
        return Entrytime;
    }

    public void setEntrytime(String entrytime) {
        Entrytime = entrytime;
    }

    public String getUpdata() {
        return Updata;
    }

    public void setUpdata(String updata) {
        Updata = updata;
    }

    @Override
    public String toString() {
        return "GasDevice{" +
                "did=" + did +
                ", gas_name='" + gas_name + '\'' +
                ", appid='" + appid + '\'' +
                ", Refueling_gun_ip='" + Refueling_gun_ip + '\'' +
                ", Refueling_gun_name='" + Refueling_gun_name + '\'' +
                ", Entrytime='" + Entrytime + '\'' +
                ", Updata='" + Updata + '\'' +
                '}';
    }
}
