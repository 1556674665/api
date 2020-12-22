package api.server.HomePage;

import api.pojo.College_News;
import api.pojo.Curriculum;
import api.pojo.Img;
import api.pojo.Teacher;

import java.util.List;

public interface HomePageServer {
    List<Curriculum> curriculum();//获取课程
//    List<Img>  curriculumImg();//获取课程图片
    List<Teacher> teacher();//老师

}
