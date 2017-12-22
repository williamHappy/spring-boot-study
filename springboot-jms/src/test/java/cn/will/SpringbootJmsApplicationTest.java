package cn.will;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * Desc:
 * Author: will
 * Date: 16:29 2017/12/12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJmsApplicationTest {

    @Test
    public void contextLoads(){}

    @Autowired
    private JavaMailSenderImpl mailSender;

    /**
     * 发送包含简单文本的邮件
     */
    @Test
    public void sendTxMail(){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        //设置收件人，寄件人
        simpleMailMessage.setTo(new String[]{"abc@163.com"});
        simpleMailMessage.setFrom("abc@163.com");
        simpleMailMessage.setSubject("Spring Boot Mail 邮件测试【文本】");
        simpleMailMessage.setText("z这里是一段简单文本");
        //发送邮件
        mailSender.send(simpleMailMessage);
        System.out.println("邮件已发送");
    }

    /**
     * 发送包含html文本的邮件
     * @throws Exception
     */
    @Test
    public void sendHtmlMail() throws Exception{
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
        mimeMessageHelper.setTo("abc@163.com");
        mimeMessageHelper.setFrom("abc@163.com");
        mimeMessageHelper.setSubject("Spring Boot Mail 邮件测试【Html】");

        StringBuilder sb = new StringBuilder();
        sb.append("<html><head></head>");
        sb.append("<body><h1>Spring Boot 邮件测试</h1><p>Hello, this is spring mail test</p></body>");
        sb.append("</html>");

        //启用html
        mimeMessageHelper.setText(sb.toString(), true);
        //发送邮件
        mailSender.send(mimeMessage);

        System.out.println("邮件已发送！");
    }

    /**
     * 发送包含内嵌图片的邮件
     * @throws Exception
     */
    @Test
    public void sendAttachedImgMail() throws Exception {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        //multipart模式
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
        mimeMessageHelper.setTo("abc@163.com");
        mimeMessageHelper.setFrom("abc@163.com");
        mimeMessageHelper.setSubject("Spring Boot Mail 邮件测试【图片】");

        StringBuilder sb = new StringBuilder();
        sb.append("<html><head></head>");
        sb.append("<body><h1>spring 邮件测试</h1><p>hello!this is spring mail test。</p>");
        // cid为固定写法，imageId指定一个标识
        sb.append("<img src=\"cid:imageId\"/></body>");
        sb.append("</html>");

        // 启用html
        mimeMessageHelper.setText(sb.toString(), true);

        // 设置imageId
        FileSystemResource img = new FileSystemResource(new File("E:/1.jpg"));
        mimeMessageHelper.addInline("imageId", img);

        // 发送邮件
        mailSender.send(mimeMessage);

        System.out.println("邮件已发送");
    }

    /**
     * 发送包含附件的邮件
     * @throws Exception
     */
    @Test
    public void sendAttendedFileMail() throws Exception {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        // multipart模式
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true, "utf-8");
        mimeMessageHelper.setTo("abc@163.com");
        mimeMessageHelper.setFrom("abc@163.com");
        mimeMessageHelper.setSubject("Spring Boot Mail 邮件测试【附件】");

        StringBuilder sb = new StringBuilder();
        sb.append("<html><head></head>");
        sb.append("<body><h1>spring 邮件测试</h1><p>hello!this is spring mail test。</p></body>");
        sb.append("</html>");

        // 启用html
        mimeMessageHelper.setText(sb.toString(), true);
        // 设置附件
        FileSystemResource img = new FileSystemResource(new File("E:/1.jpg"));
        mimeMessageHelper.addAttachment("image.jpg", img);

        // 发送邮件
        mailSender.send(mimeMessage);

        System.out.println("邮件已发送");
    }

}
