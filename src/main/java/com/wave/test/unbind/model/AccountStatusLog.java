package com.wave.test.unbind.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by Wave on 2019/3/18.
 */
@Data
public class AccountStatusLog {

    private String clientId;
    private String accId;
    private String accountNo;
    private String originAccountStatus;
    private String operator;
    private Date operateTime;
    private String operatorComments;
    private String curAccountStatus;

}
