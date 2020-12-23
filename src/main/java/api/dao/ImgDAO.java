package api.dao;

import api.pojo.Img;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ImgDAO
{
    List<Img> Img(int type, int id);//获取图片
}
