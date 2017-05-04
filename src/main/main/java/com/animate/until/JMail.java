package com.animate.until;

import java.util.Properties;

/**
 *
 * Created by Administrator on 2017/1/17.
 */
public class JMail {

    public static void sendTextMail1st() {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.163.com"); //smtp服务器地址

        props.put("mail.smtp.auth", true);  //是否需要认证

        /**实例化一个验证里，继承abstract Authenticator
         * 实现
         *   protected PasswordAuthentication getPasswordAuthentication(){
         *       return new PasswordAuthentication(userName,password);
         *   }
         */
        /*MyAuthenticator myauth = new MyAuthenticator("账号","密码");
        //获得一个带有authenticator的session实例
        Session session = Session.getInstance(props,myauth);
        session.setDebug(true);//打开debug模式，会打印发送细节到console
        Message message = new MimeMessage(session); //实例化一个MimeMessage集成自abstract Message 。参数为session
        try
        {
            message.setFrom(new InternetAddress("83378122@163.com")); //设置发出方,使用setXXX设置单用户，使用addXXX添加InternetAddress[]

            message.setText("只是一个简简单单的文本内容哟！"); //设置文本内容 单一文本使用setText,Multipart复杂对象使用setContent

            message.setSubject("只是简简单单的文本标题哟！"); //设置标题

            message.setRecipient(Message.RecipientType.TO, new InternetAddress("dxt02880466@qq.com")); //设置接收方

            Transport.send(message); //使用Transport静态方法发送邮件

        }catch(AddressException e)
        {
            //此处处理AddressException异常  [The exception thrown when a wrongly formatted address is encountered.]

        }catch(MessagingException e)
        {
            //此处处理MessagingException异常 [The base class for all exceptions thrown by the Messaging classes ]
        }*/
    }

    public static void sendTextMail2nd() {
        /*Properties props = new Properties();

        Session session = Session.getInstance(props,null);
        session.setDebug(true);//打开debug模式，会打印发送细节到console
        Message message = new MimeMessage(session); //实例化一个MimeMessage集成自abstract Message 。参数为session
        try
        {
            message.setFrom(new InternetAddress("83378122@163.com")); //设置发出方,使用setXXX设置单用户，使用addXXX添加InternetAddress[]

            message.setText("只是一个简简单单的文本内容哟！"); //设置文本内容 单一文本使用setText,Multipart复杂对象使用setContent

            message.setSubject("只是简简单单的文本标题哟！"); //设置标题

            message.setRecipient(Message.RecipientType.TO, new InternetAddress("dxt02880466@qq.com")); //设置接收方

            *//**
             *使用静态方法每次发送需要建立一个到smtp服务器的链接，你可以手动控制连接状态 ，通过session获得tansport，连接到mailserver，而session就可以使用Session.getDefaultInstance(props,null);获得     *//*
            Transport transport = session.getTransport("smtp");
            transport.connect(("smtp.163.com","账号", "密码");
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }catch(AddressException e)
        {
            //此处处理AddressException异常  [The exception thrown when a wrongly formatted address is encountered.]

        }catch(MessagingException e)
        {
            //此处处理MessagingException异常 [The base class for all exceptions thrown by the Messaging classes ]
        }*/
    }

    public static void sendMailWithAttachment(){
        /*Properties props = new Properties();
        Session session = Session .getDefaultInstance(props);
        Message message = new MimeMessage(session);
        try
        {
            message.setSubject("这个是带有附件的标题");
            message.setFrom(new InternetAddress("83378122@163.com"));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress("dxt02880466@qq.com"));
            Multipart multipart = new MimeMultipart();
            //实例化一个bodypart用于封装内容
            BodyPart bodyPart = new MimeBodyPart();
            bodyPart.setContent("<font color='red'>这个是带有附件的HTML内容</font>","text/html;charset=utf8");
            //添加bodypart到multipart
            multipart.addBodyPart(bodyPart);
            //每一个部分实例化一个bodypart，故每个附件也需要实例化一个bodypart
            bodyPart = new MimeBodyPart();
            //实例化DataSource(来自jaf)，参数为文件的地址
            DataSource dataSource = new FileDataSource(file.getAbsolutePath());
            //使用datasource实例化datahandler
            DataHandler dataHandler = new DataHandler(dataSource);
            bodyPart.setDataHandler(dataHandler);
            //设置附件标题，使用MimeUtility进行名字转码，否则接收到的是乱码
            bodyPart.setFileName(javax.mail.internet.MimeUtility.encodeText(file.getName()));
            multipart.addBodyPart(bodyPart);
            message.setContent(multipart);
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.163.com","账号" , "密码");
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }catch(MessagingException  e) {

        }catch(UnsupportedEncodingException e){

        }*/

    }
}
