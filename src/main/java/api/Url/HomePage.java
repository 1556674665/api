package api.Url;

import api.pojo.College_News;
import api.pojo.Curriculum;
import api.pojo.Img;
import api.pojo.Teacher;
import api.server.HomePage.HomePageMpl;
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
public class HomePage {//首页
    @Autowired
    HomePageMpl homePageMpl;
    @RequestMapping("/Homepage")
    @ResponseBody
    public JSON Homepage()
    {
        Map map =new HashMap();
        map.put("curriculum",curriculum());
        JSON json= JSONArray.fromObject(map);
        return  json;
    }

    public List<Curriculum> curriculum()//获取课程信息
    {
        List<Curriculum> curriculumList=homePageMpl.curriculum();//获取课程信息
        return curriculumList;
    }

}
