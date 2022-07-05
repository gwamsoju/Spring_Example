package com.example.demo.Mail;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    private MailService mailService;

    MailController(MailService mailService){
        this.mailService = mailService;
    }

    @PostMapping("/mail")
    public String sendMail(String id) throws Exception{
        mailService.sendSimpleMessage(id);
        return "인증번호 전송 !";
    }
}
