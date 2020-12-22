package api.server.Img;

import api.pojo.Img;

import java.util.List;

public interface Imgserver
{
    List<Img> Img(int type, String priture_name);//获取图片

}
