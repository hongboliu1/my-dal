package com.bohaisoft.dal.model;

import java.io.Serializable;

/**
 * Created by liuhb on 2017/1/18.
 */
public class Stock implements Serializable {

    private static final long serialVersionUID = -5587124237300034076L;

    private Long id;
    private Long merchantId;
    private Long productId;
    private Long stockNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getStockNum() {
        return stockNum;
    }

    public void setStockNum(Long stockNum) {
        this.stockNum = stockNum;
    }
}
