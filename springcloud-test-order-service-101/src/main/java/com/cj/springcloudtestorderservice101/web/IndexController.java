package com.cj.springcloudtestorderservice101.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cj
 * @date 2019-11-05 - 22:14
 */
@Controller
public class IndexController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("index.do")
    public @ResponseBody
    List<Map<String,String>> index(){
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        map.put("key","port:1001");
        list.add(map);
        return list;
    }
}
