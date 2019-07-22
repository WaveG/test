package com.wave.test.business;

import com.pingpongx.workflow.integration.api.constant.EventTypeEnum;
import com.pingpongx.workflow.integration.pusher.WorkflowOnsPusher;
import com.wave.test.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by Wave on 2019/7/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class MessageTest {

    @Autowired
    private WorkflowOnsPusher workflowOnsPusher;

    @Test
    public void test() {
        workflowOnsPusher.push("aaa", new Date(), "Register", EventTypeEnum.SINGLE.name(), new HashMap<>());
    }
}
