package api.server.Img;

import api.pojo.Img;

import java.util.List;

public interface Imgserver
{
    List<Img> Img(int type,int id);//获取图片

}
