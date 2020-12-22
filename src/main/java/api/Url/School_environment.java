package api.Url;

import api.dao.HomePageDAO;
import api.pojo.Img;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller

public class School_environment
{
    @Autowired
    HomePageDAO homePageDAO;
    @RequestMapping("/environment")
    @ResponseBody
    public List<Img> environment(){
        return homePageDAO.Img(7,"");
    }
}
