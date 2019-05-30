package com.wave.test.unbind.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by Wave on 2019/3/18.
 */
@Data
public class AmazonSeller {
    
    private Integer id;
    private String clientId;
    private String sellerUid;
    private String storeName;
    private String alias;
    private String applyType;
    private String region;
    private String sellerId;
    private String accessKey;
    private String secretKey;
    private String source;
    private String authType;
    private String mwsAuthToken;
    private String tokenStatus;
    private String processType;
    private String apiStatus;
    private String apiRemark;
    private String apiPassedTime;
    private String lastApiUpdateTime;
    private String productCategories;
    private Date lastSubmitTime;
    private String moveStatus;
    private Date created;
    private Date modified;
    private Integer flag;
}
