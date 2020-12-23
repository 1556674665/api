package api.Url;

import api.pojo.Teacher;
import api.server.Teacher.TeacherMpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TeacherURl {//老师
    @Autowired
    TeacherMpl teacherMpl;

    /**
     * 老师
     * 路径：/teacher
     * @Param:limit :数量
     * @return:List
     */
    @RequestMapping("/teacher")
    @ResponseBody
    public List<Teacher> teachers(@RequestParam(value = "limit",defaultValue = "0") int limit){
        return teacherMpl.teacher(limit);
    }
}
