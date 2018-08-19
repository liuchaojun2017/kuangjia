package com.yunhe.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class testYun {
    public static void main(String[] args){
        System.out.println("dljfl");

        Configuration configuration=new Configuration().configure();
        SessionFactory factory =configuration.buildSessionFactory();
       Session session=factory.openSession();
       Transaction tr=session.beginTransaction();

        Qy qy=new Qy("城北1");

        Jd jd1=new Jd("南关街1");
        Jd jd2=new Jd("东关街1");
        Jd jd3=new Jd("北关街1");



        Set set = new HashSet<Jd>();
        qy.getJds().add(jd1);
        qy.getJds().add(jd2);
        qy.getJds().add(jd3);


        session.save(qy);
        /*session.save(jd1);
        session.save(jd2);
        session.save(jd3);*/
        tr.commit();
        session.close();

        
       
    }
}
