package com.sgy.feiyue.crms.common.dao;

import com.sgy.feiyue.crms.common.entity.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(String id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    Student selectByIdAndPassword(String uname, String pwd);
}