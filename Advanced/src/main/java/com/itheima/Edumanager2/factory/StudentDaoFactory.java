package com.itheima.Edumanager2.factory;

import com.itheima.Edumanager2.dao.BaseStudentDao;
import com.itheima.Edumanager2.dao.OtherStudentDao;

public class StudentDaoFactory {
    public static BaseStudentDao getStudentDao(){
        return new OtherStudentDao();
    }
}
