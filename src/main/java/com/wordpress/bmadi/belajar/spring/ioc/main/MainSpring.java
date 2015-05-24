package com.wordpress.bmadi.belajar.spring.ioc.main;

import com.wordpress.bmadi.belajar.spring.ioc.domain.Address;
import com.wordpress.bmadi.belajar.spring.ioc.domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

    public static void main(String[] args) {
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:ioc.xml");
        Person p = (Person) ctx.getBean("andi");

        // tampilkan identitas dan address andi
        System.out.println("firstName : " + p.getFirstName());
        System.out.println("lastName : " + p.getLastName());
        System.out.println("address : " + p.getAddress().getJalan());
    }

}
