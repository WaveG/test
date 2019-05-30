package com.wave.test.unbind.model;

import lombok.Data;

@Data
public class UnbindOriginInfo {

    private static final long serialVersionUID = 1589458053685959349L;

    private String account;
    private String store;
    private String storeRegion;
    private String wishGrantInfo;
    private String wishRealNameInfo;
    private String kycAccountStatus;
}
