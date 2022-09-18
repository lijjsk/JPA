package com.ynu;

import com.Dao.impl.StuDao;
import com.Entity.Student;
import org.junit.Test;

public class StudentDaoTest {
    StuDao sDao = new StuDao() ;
    @Test
    public void createStu(){
        Student s = new Student() ;
        s.setName("测试");
        s.setSex(false );
        s.setPassword("123456");
        s.setAge(19);
        sDao.save(s) ;
    }
    @Test
    public void UpdateStuInfo(){
        Student one = sDao.getOne(1L);
        one.setAge(25);
        sDao.update(one);
    }
    @Test
    public void findOne(){
        Student one = sDao.getOne(1L);
        System.out.println(one.getAge());
    }
    @Test
    public void Login(){
        String name = "新用户";
        String password = "123456";
        System.out.println(sDao.Login(name,password ));
    }
    @Test
    public void reflectTest(){
        //StuDao sDao = new StuDao() ;
    }

}
