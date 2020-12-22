package api.server.Teacher;

import api.dao.TeacherDAO;
import api.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherMpl implements TeacherServer{
    @Autowired
    TeacherDAO teacherDAO;
    @Override
    public List<Teacher> teacher() {
        return teacherDAO.teacher();
    }
}
