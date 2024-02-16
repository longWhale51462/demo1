package com.bdqn.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */
public class AlipayConf {
    //↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "9021000134662259";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCCbl4NWZDTPgKlTXOFpCIkxQ9c8lYGXVKYeilB4/NscHC18zvPBqLdG4ydUYeGs5gfKMghriDYk4LtXhyZuDjMRAgZ2ZJx++OOqIOIovEDwAmBM0uupes9RVof7kwd3vCEEOCQFxXOTKIBWmn3Zyh8C7r2AguIabF/m6bxaB6yY8v+B714k2lStQ4DJQrxjPfqY+H9S9E0SJDKvhL0a02CD+sC0wT3qtHezkqZRO5lt+/xYV6bUpxJ0NHfoNX9Z4CL4uem24L4S58S+BIEB+ijTWKIR5E/0F069J8a29Md8jUjb38Ozv+Kv/pXK/N0kSaidrjOia2bgIKbKo4pJ5y7AgMBAAECggEAB1V3Wl7P4uDYuzy4oyoQdWrTK1HA/oiezU4JJdhQZqeH3uM3WLOx0qbq6CmeajeM9SuQ3TvyQttAgGJLT2VpZCrrHbD7KAeWyv20r6khziktH6OnvME9ketlXuhCRWe0tGhSiCeUJU5vyY2w6aVWRGtQbua8iUYQIfG5mFdXaoZWna7FORaKFARh1703XsJbw7Zybpsr9z+XJn7W9r0Pj7RCOcQRHbbfmdNVYSUX4aRkYWEj1p8grMtp+SU6H/GqYrbdhZOY603sXTmL+QA/FmMxxOJYssjlh3cmG7yR9+5wpjdG5Q2OmacTqfLPNy4X7pLPWrjnv6RKyV3Obb+iaQKBgQDy7VmZyXpCX+NVmHGVzEP4Z3OJh2a2MrxlSnbx9pi6RncilI0IlWT/diS4CbBubQEXyoCTr9YhhMltnaBhLTRtb61cq2rUlvDJiGjETICA0i02WBYOg3w+REbmxj2XuY1EGSzVfsLcbDL8evOA/6VWLWQlIVf+8p+Ctv1OUwX7zQKBgQCJczuE4i0CXkI0EQKTyLMLLXmcHxV8pyCZ9CfnkYQNYPwPxozsfYGLgAJXjAEUuhod2NOCM1JKSM8RIcDfKUaSs6NcIM6kCTUQppAN1c2QnygU1zF4YBl3PGFU7P1tch8DeUeoFLSO/jMk1OSnZOvgQBWRscLX9PJWZ/2+3CvCpwKBgG+tDXPVW48H5cqDujPTI6weYs7moCFCUbl+8g9p/ewkWMBc6jj39OY7ucWhLqqVEduODG3Yd+gQ00jBHemOjnuAy4G+i+4PNcJwIzmasbiG5qIE/J7Pc15spOuSVt5ZPsf/isza6VnLo+TN4QN8gtWLKG6pVXqurwW4edp38FhBAoGAEL0MuYEFtC0gaNDNfIvLaggOsDmE11pO+RCnr2akKzDtYUpvrPkXxpI/NsQg+ZI0TgAyub9gPRWiydZPc53GL2Va9oQ0RfutD6sJDfZEg2Euc2NFbgBd+YxL2hjGQAbOyhCB7nEfD+7a8ZhPhCchJn0HY2e/b6cvv+AIIa8UUS8CgYEAz4ih2Zlyv0jEwU7NKx+U3WB95j8r7HFIpW0wr+zqRKXpdh+W6AlmwBUji0Xzlcj7n2baXgEszHJ2NTYlRVmM1AnHK8i6+sJlPOIdx30caDdPouyisaMgWrVfotb08VilUz2Pe5WewMNNmnSpE/wc5KUp5aGBwsHuuwfdcWjMKEU=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgm5eDVmQ0z4CpU1zhaQiJMUPXPJWBl1SmHopQePzbHBwtfM7zwai3RuMnVGHhrOYHyjIIa4g2JOC7V4cmbg4zEQIGdmScfvjjqiDiKLxA8AJgTNLrqXrPUVaH+5MHd7whBDgkBcVzkyiAVpp92cofAu69gILiGmxf5um8WgesmPL/ge9eJNpUrUOAyUK8Yz36mPh/UvRNEiQyr4S9GtNgg/rAtME96rR3s5KmUTuZbfv8WFem1KcSdDR36DV/WeAi+LnptuC+EufEvgSBAfoo01iiEeRP9BdOvSfGtvTHfI1I29/Ds7/ir/6VyvzdJEmona4zomtm4CCmyqOKSecuwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi-sandbox.dl.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
