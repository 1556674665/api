package api.server.Teacher;

import api.pojo.Teacher;

import java.util.List;

public interface TeacherServer
{
    List<Teacher> teacher(int limit);//老师
}
