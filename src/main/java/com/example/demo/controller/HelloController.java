package com.example.demo.controller;

import com.example.demo.entity.MailInfoDo;
import com.example.demo.entity.ResultData;
import com.example.demo.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private MailService mailService;

    @PostMapping("sendMail")
    public ResultData<String> sendMail(@RequestBody MailInfoDo mailInfo) {
        mailService.sendMail(mailInfo);
        return ResultData.ok("发送成功", null);
    }


}
