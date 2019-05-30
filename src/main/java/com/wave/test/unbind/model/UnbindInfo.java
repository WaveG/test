package com.wave.test.unbind.model;

import lombok.Data;

import java.util.Date;

@Data
public class UnbindInfo {

    private static final long serialVersionUID = -5014521726382396741L;

    private String clientId;
    private String accId;
    private String storeId;
    private String nation;
    private String platform;
    private String sellerId;
    private String type;
    private String storeName;
    private String accountStatus;
    private String merchantStatus;
    private String operator;
    private Date operateDate;
    private String remark;
    private String originInfo;
}
