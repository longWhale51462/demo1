package com.bdqn.controller;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.bdqn.config.AlipayConf;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlipayController {
    @PostMapping("/alipay")

    public String pay() throws AlipayApiException {
        //支付宝客户端对象
        //    String serverUrl, String appId, String privateKey, String format, String charset, String alipayPublicKey, String signType
        DefaultAlipayClient defaultAlipayClient = new DefaultAlipayClient(
                AlipayConf.gatewayUrl,AlipayConf.app_id,AlipayConf.merchant_private_key,"JSON",
                AlipayConf.charset,AlipayConf.alipay_public_key,AlipayConf.sign_type
        );
        //支付宝请求对象
        AlipayTradePagePayRequest payRequest = new AlipayTradePagePayRequest();
        JSONObject json = new JSONObject();
        json.put("out_trade_no",10088);
        json.put("total_amount",100000);
        json.put("subject","MyOrder");
        json.put("product_code","FAST_INSTANT_TRADE_PAY");
        payRequest.setBizContent(json.toString());
        payRequest.setReturnUrl("https://www.baidu.com");
        System.out.println("支付成功3");
        System.out.println("支付成功3");
        System.out.println("支付成功3");
        return defaultAlipayClient.pageExecute(payRequest).getBody();

    }
}
