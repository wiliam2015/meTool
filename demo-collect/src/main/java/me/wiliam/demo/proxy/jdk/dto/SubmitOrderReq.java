package me.wiliam.demo.proxy.jdk.dto;

/**
 * 下单入参
 */
public class SubmitOrderReq {
    /**购买人*/
    private String buyer;
    /**购买商品编码*/
    private String skuId;
    /**购买商品名称*/
    private String skuName;

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }
}
