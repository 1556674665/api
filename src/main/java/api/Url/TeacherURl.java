package api.Url;

import api.pojo.Teacher;
import api.server.Teacher.TeacherMpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TeacherURl {
    @Autowired
    TeacherMpl teacherMpl;

    /**
     *
     * @return
     */
    @RequestMapping("/teacher")
    @ResponseBody
    public List<Teacher> teachers(){
        return teacherMpl.teacher();
    }
}
