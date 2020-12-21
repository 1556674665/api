package api.server.HomePage;

import api.pojo.homePage.College_News;
import api.pojo.homePage.Curriculum;
import api.pojo.Img;
import api.pojo.homePage.Teacher;

import java.util.List;

public interface HomePageServer {
    List<Img> Img(int type);//获取图片
    List<Curriculum> curriculum();//获取课程
//    List<Img>  curriculumImg();//获取课程图片
    List<College_News> College_News();//赛杰新闻
    List<Teacher> teacher();//老师

}
