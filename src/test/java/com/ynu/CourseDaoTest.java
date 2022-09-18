package com.ynu;

import com.Dao.impl.CouDao;
import com.Entity.Course;
import org.junit.Test;

public class CourseDaoTest {
    CouDao cDao = new CouDao();
    @Test
    public void createCou(){
        Course c = new Course();
        c.setCourseId(1000002l);
        c.setCourseName("编程能力提升");
        c.setCredit(2.0);
        cDao.save(c);
    }

}
