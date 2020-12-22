package api.dao;

import api.pojo.College_News;
import api.pojo.Curriculum;
import api.pojo.Img;
import api.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HomePageDAO {//首页
    List<Img> Img(int type,String priture_name);//获取图片
    List<Curriculum> curriculum();//获取课程
//    List<Img>  curriculumImg();//获取课程图片
    List<College_News> College_News();//赛杰新闻
    List<Teacher> teacher();//老师
}
