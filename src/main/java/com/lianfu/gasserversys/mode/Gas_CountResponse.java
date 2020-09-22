package com.lianfu.gasserversys.mode;

public class Gas_CountResponse {
    private String receivable;
    private String net_receipts;
    private String Discount;

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

    @Override
    public String toString() {
        return "Gas_CountResponse{" +
                "receivable='" + receivable + '\'' +
                ", net_receipts='" + net_receipts + '\'' +
                ", Discount='" + Discount + '\'' +
                '}';
    }
}
