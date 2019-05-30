package com.wave.test.unbind.recover;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wave.test.unbind.model.AmazonSeller;
import com.wave.test.unbind.model.AmazonStore;
import com.wave.test.unbind.model.EUAccount;
import com.wave.test.unbind.model.UnbindOriginInfo;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Created by Wave on 2019/3/18.
 */
public class EUUnbindRecover {

    @Test
    public void recoverAmazonStore() throws Exception {
        String originInfoStr = "{\"account\":\"{\\\"accId\\\":\\\"110010758550187\\\",\\\"accountNo\\\":\\\"70730882\\\",\\\"active\\\":\\\"1\\\",\\\"assignDate\\\":1552461304000,\\\"assignUser\\\":\\\"System\\\",\\\"availableBalance\\\":0.00,\\\"balance\\\":0.00,\\\"bankLocation\\\":\\\"United Kingdom\\\",\\\"bankName\\\":\\\"Citibank\\\",\\\"clientId\\\":\\\"190308104537873\\\",\\\"closeDate\\\":1552557475000,\\\"closeUser\\\":\\\"suyb@pingpongx.com\\\",\\\"created\\\":1552461304000,\\\"currency\\\":\\\"GBP\\\",\\\"entityAccountNo\\\":\\\"18439257\\\",\\\"flag\\\":1,\\\"frozen\\\":0.00,\\\"iban\\\":\\\"GB10CITI18500870730882\\\",\\\"id\\\":90633,\\\"lastUpdateDate\\\":1552557475000,\\\"modified\\\":1552557475000,\\\"platform\\\":\\\"AMAZON_EU\\\",\\\"preInbound\\\":0.00,\\\"sortCode\\\":\\\"18-50-08\\\",\\\"status\\\":\\\"Closed\\\"}\",\"storeRegion\":\"{\\\"accId\\\":\\\"110010758550187\\\",\\\"clientId\\\":\\\"190308104537873\\\",\\\"created\\\":1552461056000,\\\"expectedSales\\\":\\\"499999\\\",\\\"expectedSalesOperator\\\":\\\"\\\",\\\"failureReason\\\":\\\"\\\",\\\"flag\\\":1,\\\"id\\\":50090376,\\\"modified\\\":1552461055000,\\\"nation\\\":\\\"UK\\\",\\\"operateRemark\\\":\\\"\\\",\\\"operator\\\":\\\"\\\",\\\"productCategories\\\":\\\"Beauty & Health\\\",\\\"sellerUid\\\":\\\"sr201903131510556569\\\",\\\"status\\\":\\\"Pending\\\",\\\"storeName\\\":\\\"S-POWER\\\",\\\"storeNameOperator\\\":\\\"\\\"}\"}";
        UnbindOriginInfo originInfo = JSON.parseObject(originInfoStr, UnbindOriginInfo.class);
        AmazonStore store = JSONObject.parseObject(originInfo.getStoreRegion(), AmazonStore.class);
        EUAccount account = JSONObject.parseObject(originInfo.getAccount(), EUAccount.class);

        System.out.println(printSql("insert into amazon_store", store));
        System.out.println(printSql("insert into eu_account", account));
    }

    @Test
    public void recoverAmazonSeller() throws Exception {
        String originInfoStr = "{\"store\":\"{\\\"accessKey\\\":\\\"\\\",\\\"alias\\\":\\\"\\\",\\\"apiRemark\\\":\\\"\\\",\\\"apiStatus\\\":\\\"Pending\\\",\\\"applyType\\\":\\\"Advanced\\\",\\\"clientId\\\":\\\"190308104537873\\\",\\\"created\\\":1552461056000,\\\"flag\\\":1,\\\"id\\\":50024235,\\\"lastSubmitTime\\\":1552461056000,\\\"modified\\\":1552461055000,\\\"moveStatus\\\":\\\"Normal\\\",\\\"productCategories\\\":\\\"\\\",\\\"region\\\":\\\"EU\\\",\\\"secretKey\\\":\\\"\\\",\\\"sellerUid\\\":\\\"sr201903131510556569\\\",\\\"storeName\\\":\\\"S-POWER\\\"}\"}";
        UnbindOriginInfo originInfo = JSON.parseObject(originInfoStr, UnbindOriginInfo.class);
        AmazonSeller seller = JSONObject.parseObject(originInfo.getStore(), AmazonSeller.class);
        System.out.println(printSql("insert into amazon_seller", seller));
    }

    private String printSql(String prefix, Object obj) throws Exception {

        StringBuilder sql = new StringBuilder(prefix + "(");
        Class clz = obj.getClass();
        Field[] fields = clz.getDeclaredFields();

        StringBuilder values = new StringBuilder("(");
        for (int i = 0; i < fields.length; i++) {
            Field f = fields[i];
            String value = BeanUtils.getProperty(obj, f.getName());
            if (StringUtils.isNotBlank(value)) {
                sql.append(f.getName());
                values.append("'").append(value).append("'");
                if (i != (fields.length - 1)) {
                    sql.append(", ");
                    values.append(", ");
                }
            }
        }

        sql.append(") values").append(values).append(");");
        return sql.toString();
    }
}
