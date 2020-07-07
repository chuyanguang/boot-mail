package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class MailInfoDo implements Serializable {

    private static final long serialVersionUID = -4845739128433667618L;

    // 标题
    private String subJect;

    // 接收邮箱
    private String mail;

    // 发送内容，支持html
    private String content;

}
