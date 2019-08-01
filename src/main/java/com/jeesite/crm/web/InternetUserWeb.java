package com.jeesite.crm.web;

import com.jeesite.crm.producer.MsgProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class InternetUserWeb {

    @Autowired
    private MsgProducer producer;

    @RequestMapping("")
    @ResponseBody
    public String index() {
        return "请求成功";
    }


    /**
     * 互联网引流客户
     * @param data
     * @return
     */
    @RequestMapping("internet")
    @ResponseBody
    public String sendMsg(@RequestParam String data) {
        producer.sendMsg(data);
        return data;
    }
}
