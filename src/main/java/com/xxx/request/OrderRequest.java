package com.xxx.request;

import java.math.BigDecimal;

public class OrderRequest {

    private Integer productId;

    private Integer num;

    private String remarks;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "productId=" + productId +
                ", num=" + num +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
