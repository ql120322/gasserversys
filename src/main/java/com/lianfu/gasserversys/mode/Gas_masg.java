package com.lianfu.gasserversys.mode;

import org.springframework.stereotype.Component;

@Component
public class Gas_masg {

    private int gid;
    private String appid;
    private String gasname; //加油站名
    private String gas_mername; //加油公司名
    private int gas_mername_id;//加油公司名id
    private String gas_loc; //地址
    private String phone;//电话
    private String rate;//费率
    private String Inputdate;//录入时间
    private String update;//修改时间
    private int province_id; //省
    private int city_id;//市
    private int area_id;//区
    private String gasstation;
    private String GasLoc;

    public int getGid() {
        return gid;
    }

    public void setGid(int gaid) {
        this.gid = gaid;
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

    public String getGas_mername() {
        return gas_mername;
    }

    public void setGas_mername(String gas_mername) {
        this.gas_mername = gas_mername;
    }

    public int getGas_mername_id() {
        return gas_mername_id;
    }

    public void setGas_mername_id(int gas_mername_id) {
        this.gas_mername_id = gas_mername_id;
    }

    public String getGas_loc() {
        return gas_loc;
    }

    public void setGas_loc(String gas_loc) {
        this.gas_loc = gas_loc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
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

    public int getProvince_id() {
        return province_id;
    }

    public void setProvince_id(int province_id) {
        this.province_id = province_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getArea_id() {
        return area_id;
    }

    public void setArea_id(int area_id) {
        this.area_id = area_id;
    }

    public String getGasstation() {
        return gasstation;
    }

    public void setGasstation(String gasstation) {
        this.gasstation = gasstation;
    }

    public String getGasLoc() {
        return GasLoc;
    }

    public void setGasLoc(String gasLoc) {
        GasLoc = gasLoc;
    }

    @Override
    public String toString() {
        return "Gas_masg{" +
                "gaid=" + gid +
                ", appid='" + appid + '\'' +
                ", gasname='" + gasname + '\'' +
                ", gas_mername='" + gas_mername + '\'' +
                ", gas_mername_id='" + gas_mername_id + '\'' +
                ", gas_loc='" + gas_loc + '\'' +
                ", phone='" + phone + '\'' +
                ", rate='" + rate + '\'' +
                ", Inputdate='" + Inputdate + '\'' +
                ", update='" + update + '\'' +
                ", province_id=" + province_id +
                ", city_id=" + city_id +
                ", area_id=" + area_id +
                ", gasstation='" + gasstation + '\'' +
                ", GasLoc='" + GasLoc + '\'' +
                '}';
    }
}
