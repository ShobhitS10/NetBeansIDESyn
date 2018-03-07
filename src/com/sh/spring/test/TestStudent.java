/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sh.spring.test;

import com.sh.spring.pojo.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author Shobhit.Sachdeva
 */
public class TestStudent {
 
    public static void main(String args[]) {
//        Resource resource = new ClassPathResource("applicationContext.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student student = (Student) factory.getBean("studentBean");
        Student student = (Student) context.getBean("studentBean");
        System.out.println(student.toString());
    }
}