package api.dao;

import api.pojo.Picture_Table;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HomePage {
    List<Picture_Table> RotationImg();//获取轮播图片
}
