package com.lianfu.gasserversys.mode;

import org.springframework.stereotype.Component;

@Component
public class Gas_mername {

    private  int cid;
    private  String mername;//公司名

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getMername() {
        return mername;
    }

    public void setMername(String mername) {
        this.mername = mername;
    }

    @Override
    public String toString() {
        return "Gas_mername{" +
                "cid=" + cid +
                ", mername='" + mername + '\'' +
                '}';
    }



}
