package api.dao;

import api.pojo.College_News;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface College_NewsDAO //学院新闻
{
    List<College_News> College_News(int limit);//赛杰新闻
}
