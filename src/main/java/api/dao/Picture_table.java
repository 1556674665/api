package api.dao;

import api.pojo.Img;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Picture_table {//对图片表进行操作
        List<Img> RotationImg();//获取轮播图片
}
