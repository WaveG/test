package com.wave.test.business.config;

import com.aliyun.openservices.ons.api.bean.ProducerBean;
import com.pingpongx.workflow.integration.pusher.WorkflowOnsPusher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Wave on 2019/7/9.
 */
@Configuration
public class OnsConfig {

    @Autowired
    private ProducerBean producerBean;

//    @Autowired
//    private OnsProperties onsProperties;
//
//    @Bean(initMethod = "start", destroyMethod = "shutdown")
//    public ProducerBean producer() {
//        Properties prop = new Properties();
//        prop.put(PropertyKeyConst.NAMESRV_ADDR, onsProperties.getNameSrv());
//        prop.put(PropertyKeyConst.GROUP_ID, onsProperties.getGroupId());
//        prop.put(PropertyKeyConst.AccessKey, onsProperties.getAccessKey());
//        prop.put(PropertyKeyConst.SecretKey, onsProperties.getSecretKey());
//
//        ProducerBean producer = new ProducerBean();
//        producer.setProperties(prop);
//        return producer;
//    }

    @Bean
    public WorkflowOnsPusher onsPusher() {
        WorkflowOnsPusher pusher = new WorkflowOnsPusher();
        pusher.setProducer(producerBean);
        return pusher;
    }

}
