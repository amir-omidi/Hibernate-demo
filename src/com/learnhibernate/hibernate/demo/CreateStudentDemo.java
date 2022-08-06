package com.learnhibernate.hibernate.demo;

import com.learnhibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

    public static void main(String[] args) {
        //creat session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        //create session
        Session session = factory.getCurrentSession();
        try {
            //save java object in db
            //creat student object
            System.out.println("create new student object ...");
            Student tempstudent = new Student("amir","omidi","amir.ho.omidy@gmail.com");
            //start transaction
            session.beginTransaction();
            //save the student object
            System.out.println("saving the student ...");
            session.save(tempstudent);
            //commit transaction
            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally {
        factory.close();
        }

    }
}
