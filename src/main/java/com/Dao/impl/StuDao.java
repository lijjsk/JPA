package com.Dao.impl;

import com.Dao.IStudentDao;
import com.Entity.Student;
import com.Util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class StuDao extends BaseDao<Student>implements IStudentDao {
    @Override
    public boolean Login(String name, String password){
        EntityManager manager = JPAUtil .getEntityManager() ;
        String hql = "select s from Student s where s.Name =:username and s.Password =:password";
        Query query = manager.createQuery(hql);
        query.setParameter("username",name);
        query.setParameter("password",password);
        List list = query.getResultList() ;
        manager .close() ;
        return list.size() >= 1;
    }

}
