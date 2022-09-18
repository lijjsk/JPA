package com.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//Persistence 通过它的静态方法CreateEntityManagerFactory获取EntityManagerFactory
public class JPAUtil {
    public static EntityManagerFactory factory;     //获取EntityManager实例对象
    static{
        factory = Persistence.createEntityManagerFactory("default");
    }
    public static EntityManager getEntityManager(){
        return factory.createEntityManager() ;
    }
}
