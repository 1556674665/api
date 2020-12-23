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
public interface Curriculum_tableDAO {//首页

    List<Curriculum> curriculum(int limit);//获取课程
//    List<Img>  curriculumImg();//获取课程图片


}
