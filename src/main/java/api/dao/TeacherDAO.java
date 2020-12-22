package api.dao;

import api.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherDAO
{
    List<Teacher> teacher();//老师
}

