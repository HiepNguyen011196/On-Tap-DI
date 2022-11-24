package controller;

import model.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MainTest {

    public static void main(String[] args) {
        AbstractApplicationContext context;
        context = new ClassPathXmlApplicationContext("teacher-bean.xml");
        Teacher teacher = (Teacher) context.getBean("teacher");
        System.out.println(teacher);
    }

}
