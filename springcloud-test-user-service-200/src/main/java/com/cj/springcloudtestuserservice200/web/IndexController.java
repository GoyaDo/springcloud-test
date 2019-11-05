package com.cj.springcloudtestuserservice200.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @author cj
 * @date 2019-11-05 - 22:22
 */
@Controller
public class IndexController {

    //访问远程接口
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("indexClient.do")
    @ResponseBody
    public String index(){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://microservice-100-order/index.do", String.class);

        return responseEntity.getBody();
    }

}
