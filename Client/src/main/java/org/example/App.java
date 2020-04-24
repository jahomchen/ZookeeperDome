package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Client.xml");
        classPathXmlApplicationContext.start();
        IUserService userService = (IUserService) classPathXmlApplicationContext.getBean("UserService");
        User user = userService.GetUserById(2);

        System.out.println(user.toString());
    }
}
