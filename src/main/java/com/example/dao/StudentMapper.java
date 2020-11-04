package com.example.dao;

import com.example.model.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {

    int save(Student student);

    Student selectByNumber(String number);

    int update(Student student);

    int delete(long id);
}
