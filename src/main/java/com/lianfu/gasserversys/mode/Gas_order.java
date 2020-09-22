package com.lianfu.gasserversys.mode;

public class Gas_order {
    private int id ;
    private String order_number;
    private String appid;
    private String order_date;
    private String Gun_number;
    private String license;
    private String carColor;
    private String receivable;
    private String net_receipts;
    private String Discount;
    private String Payment_method;
    private String Operator;
    private String state;
    private String photo;
    private String Insensibility;
    private String ip;
    private String trade_date;
    private String total_disc_amt;
    private String total_amt;

    private String order_endtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getGun_number() {
        return Gun_number;
    }

    public void setGun_number(String gun_number) {
        Gun_number = gun_number;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getReceivable() {
        return receivable;
    }

    public void setReceivable(String receivable) {
        this.receivable = receivable;
    }

    public String getNet_receipts() {
        return net_receipts;
    }

    public void setNet_receipts(String net_receipts) {
        this.net_receipts = net_receipts;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }

    public String getPayment_method() {
        return Payment_method;
    }

    public void setPayment_method(String payment_method) {
        Payment_method = payment_method;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String operator) {
        Operator = operator;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getInsensibility() {
        return Insensibility;
    }

    public void setInsensibility(String insensibility) {
        Insensibility = insensibility;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTrade_date() {
        return trade_date;
    }

    public void setTrade_date(String trade_date) {
        this.trade_date = trade_date;
    }

    public String getTotal_disc_amt() {
        return total_disc_amt;
    }

    public void setTotal_disc_amt(String total_disc_amt) {
        this.total_disc_amt = total_disc_amt;
    }

    public String getTotal_amt() {
        return total_amt;
    }

    public void setTotal_amt(String total_amt) {
        this.total_amt = total_amt;
    }

    public String getOrder_endtime() {
        return order_endtime;
    }

    public void setOrder_endtime(String order_endtime) {
        this.order_endtime = order_endtime;
    }

    @Override
    public String toString() {
        return "Gas_order{" +
                "id=" + id +
                ", order_number='" + order_number + '\'' +
                ", appid='" + appid + '\'' +
                ", order_date='" + order_date + '\'' +
                ", Gun_number='" + Gun_number + '\'' +
                ", license='" + license + '\'' +
                ", carColor='" + carColor + '\'' +
                ", receivable='" + receivable + '\'' +
                ", net_receipts='" + net_receipts + '\'' +
                ", Discount='" + Discount + '\'' +
                ", Payment_method='" + Payment_method + '\'' +
                ", Operator='" + Operator + '\'' +
                ", state='" + state + '\'' +
                ", photo='" + photo + '\'' +
                ", Insensibility='" + Insensibility + '\'' +
                ", ip='" + ip + '\'' +
                ", trade_date='" + trade_date + '\'' +
                ", total_disc_amt='" + total_disc_amt + '\'' +
                ", total_amt='" + total_amt + '\'' +
                ", order_endtime='" + order_endtime + '\'' +
                '}';
    }
}
