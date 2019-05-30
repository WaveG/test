package com.wave.test.unbind.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by Wave on 2019/3/18.
 */
@Data
public class AmazonStore {

    private Integer id;
    private String clientId;
    private String sellerUid;
    private String accId;
    private String storeName;
    private String storeNameOperator;
    private Date storeNameOperateTime;
    private String expectedSales;
    private String expectedSalesOperator;
    private String expectedSalesOperateTime;
    private String productCategories;
    private String nation;
    private String status;
    private String failureReason;
    private String operator;
    private Date lastOperateTime;
    private String operateRemark;
    private Date created;
    private Date modified;
    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSellerUid() {
        return sellerUid;
    }

    public void setSellerUid(String sellerUid) {
        this.sellerUid = sellerUid;
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreNameOperator() {
        return storeNameOperator;
    }

    public void setStoreNameOperator(String storeNameOperator) {
        this.storeNameOperator = storeNameOperator;
    }

    public Date getStoreNameOperateTime() {
        return storeNameOperateTime;
    }

    public void setStoreNameOperateTime(Date storeNameOperateTime) {
        this.storeNameOperateTime = storeNameOperateTime;
    }

    public String getExpectedSales() {
        return expectedSales;
    }

    public void setExpectedSales(String expectedSales) {
        this.expectedSales = expectedSales;
    }

    public String getExpectedSalesOperator() {
        return expectedSalesOperator;
    }

    public void setExpectedSalesOperator(String expectedSalesOperator) {
        this.expectedSalesOperator = expectedSalesOperator;
    }

    public String getExpectedSalesOperateTime() {
        return expectedSalesOperateTime;
    }

    public void setExpectedSalesOperateTime(String expectedSalesOperateTime) {
        this.expectedSalesOperateTime = expectedSalesOperateTime;
    }

    public String getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(String productCategories) {
        this.productCategories = productCategories;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getLastOperateTime() {
        return lastOperateTime;
    }

    public void setLastOperateTime(Date lastOperateTime) {
        this.lastOperateTime = lastOperateTime;
    }

    public String getOperateRemark() {
        return operateRemark;
    }

    public void setOperateRemark(String operateRemark) {
        this.operateRemark = operateRemark;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
