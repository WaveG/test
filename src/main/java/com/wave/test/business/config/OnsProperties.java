package com.wave.test.business.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Wave on 2019/7/9.
 */
@ConfigurationProperties("pingpongx.mq")
@Data
@Component
public class OnsProperties {

    private String nameSrv;
    private String accessKey;
    private String secretKey;
    private String groupId = "GID_TEST";
}
