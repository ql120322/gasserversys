package com.lianfu.gasserversys.mode;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class GasUser {
    private  int uid;
    private  String mername; //公司名
    private  int cid;//公司id
    private  String phone;// 联系方式
    private  String duty_name;// 负责人
    private  String username;// 账户
    private  String password;//密码
    private  String role_code;//权限
    private  String[] appid;//加油站标识
    private  String Inputdate;//录入时间
    private  String update;//修改时间
    private  String[] gasname;//加油站名

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getMername() {
        return mername;
    }

    public void setMername(String mername) {
        this.mername = mername;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDuty_name() {
        return duty_name;
    }

    public void setDuty_name(String duty_name) {
        this.duty_name = duty_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole_code() {
        return role_code;
    }

    public void setRole_code(String role_code) {
        this.role_code = role_code;
    }

    public String[] getAppid() {
        return appid;
    }

    public void setAppid(String[] appid) {
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

    public String[] getGasname() {
        return gasname;
    }

    public void setGasname(String[] gasname) {
        this.gasname = gasname;
    }

    @Override
    public String toString() {
        return "GasUser{" +
                "uid=" + uid +
                ", mername='" + mername + '\'' +
                ", cid=" + cid +
                ", phone='" + phone + '\'' +
                ", duty_name='" + duty_name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role_code='" + role_code + '\'' +
                ", appid=" + Arrays.toString(appid) +
                ", Inputdate='" + Inputdate + '\'' +
                ", update='" + update + '\'' +
                ", gasname=" + Arrays.toString(gasname) +
                '}';
    }
}
