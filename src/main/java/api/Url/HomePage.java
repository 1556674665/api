package api.Url;

import api.pojo.homePage.College_News;
import api.pojo.homePage.Curriculum;
import api.pojo.Img;
import api.pojo.homePage.Teacher;
import api.server.HomePageMpl;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Homepage")
public class HomePage {
    @Autowired
    HomePageMpl homePageMpl;
    @RequestMapping("/Homepage")
    @ResponseBody
    public JSON Homepage()
    {
        Map map =new HashMap();
        map.put("rotation",Rotation());
        map.put("curriculum",curriculum());
        map.put("college_News",college_News());
        map.put("teacher",teacher());
        map.put("environment",environment());
        JSON json= JSONArray.fromObject(map);
        return  json;
    }

    public List<Img> Rotation()//获取轮播图
    {
        return homePageMpl.Img(1);
    }

    public List curriculum()//获取课程信息
    {
        List<Curriculum> curriculumList=homePageMpl.curriculum();//获取课程信息
        List<Img> imgList=homePageMpl.Img(2);//获取课程图片
        if (imgList==null || imgList.size()==0){
            return curriculumList;
        }
        List data=new ArrayList();

        for (int i = 0; i <curriculumList.size() ; i++) {
            for (int j = 0; j <imgList.size() ; j++) {
                if(imgList.get(j).getforeign_id()==curriculumList.get(i).getId()){
                    List list=new ArrayList();
                    list.add(curriculumList.get(i));
                    list.add(imgList.get(j));
                    data.add(list);
                    break;
                }
                if(j==imgList.size()-1){
                    List list=new ArrayList();
                    list.add(curriculumList.get(i));
                    data.add(list);
                }
            }
        }
        return data;
    }
    public List college_News()//获取学院新闻
    {
        List data=new ArrayList();
        List<College_News> college_news=homePageMpl.College_News();
        List<Img> college_img=homePageMpl.Img(3);
        if (college_img==null || college_img.size()==0){
                return college_news;
        }
        for (int i = 0; i <college_news.size() ; i++) {
            for (int j = 0; j <college_img.size() ; j++) {
                if (college_news.get(i).getId()==college_img.get(j).getforeign_id()){
                    List list=new ArrayList();
                    list.add(college_news.get(i));
                    list.add(college_img.get(j));
                    data.add(list);
                    break;
                }else if(j==college_img.size()-1){
                    data.add(college_news.get(i));
                }
            }
        }
        return data;
    }
    public List teacher()//获取老师
    {
        List data=new ArrayList();
        List<Teacher> teacher=homePageMpl.teacher();
        List<Img> imgList=homePageMpl.Img(4);
        if (imgList==null || imgList.size()==0){
            return teacher;
        }
        for (int i = 0; i <teacher.size() ; i++) {
            for (int j = 0; j <imgList.size() ; j++) {
                if (teacher.get(i).getId()==imgList.get(j).getforeign_id()){
                    List list=new ArrayList();
                    list.add(teacher.get(i));
                    list.add(imgList.get(j));
                    data.add(list);
                    break;
                }else if(j==imgList.size()-1){
                    data.add(teacher.get(i));
                }
            }
        }
        return data;
    }
    public List<Img> environment()//环境
    {
        return  homePageMpl.Img(7);
    }

}
