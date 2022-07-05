package com.example.demo.Mail;

import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.internet.MimeMessage;
import java.util.Random;

@Service
public class MailService {

    private JavaMailSender javaMailSender;

    private MailService(JavaMailSender javaMailSender){
        this.javaMailSender = javaMailSender;
    }

    private static int confirmNum ;

    private MimeMessage createMessage(String id) throws Exception {
        createNum();
        System.out.println("보내는 대상 " + id);
        System.out.println("인증 번호 " + confirmNum);

        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        mimeMessage.addRecipients(Message.RecipientType.TO, id);
        mimeMessage.setSubject("이메일 인증 TEST");

        String msg = "";
        msg += "안녕하세요. 요청하신 인증 번호입니다.";
        msg += "<br>";
        msg += "인증 번호 : ";
        msg += confirmNum + " 입니다.";
        msg += "<br>";

        mimeMessage.setText(msg, "UTF-8", "html");
        return mimeMessage;
    }

    private static void createNum(){

        Random random = new Random();

        int i = random.nextInt(9999);

        confirmNum = i;
    }

    public void sendSimpleMessage(String id) throws Exception {
        MimeMessage mimeMessage = createMessage(id);
        try{
            javaMailSender.send(mimeMessage);
        }catch(MailException e){
            e.printStackTrace();
        }
    }
}
