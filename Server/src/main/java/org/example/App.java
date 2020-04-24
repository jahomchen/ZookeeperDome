package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("serve.xml");
        classPathXmlApplicationContext.start();
        System.out.println("服务已启动...");

        System.in.read();
    }
}
