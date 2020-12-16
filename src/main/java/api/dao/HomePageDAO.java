package api.dao;

import api.pojo.homePage.College_News;
import api.pojo.homePage.Curriculum;
import api.pojo.Img;
import api.pojo.homePage.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HomePageDAO {//首页
    List<Img> Img(int type);//获取图片
    List<Curriculum> curriculum();//获取课程
//    List<Img>  curriculumImg();//获取课程图片
    List<College_News> College_News();//赛杰新闻
    List<Teacher> teacher();//老师
}
