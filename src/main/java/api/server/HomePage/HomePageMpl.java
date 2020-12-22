package api.server.HomePage;

import api.dao.HomePageDAO;
import api.pojo.College_News;
import api.pojo.Curriculum;
import api.pojo.Img;
import api.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HomePageMpl implements HomePageServer {
    @Autowired
    HomePageDAO homePage;
    @Override
    public List<Curriculum> curriculum() {
        return homePage.curriculum();
    }
    @Override
    public List<College_News> College_News() {
        return homePage.College_News();
    }

    @Override
    public List<Img> Img(int type,String priture_name) {
        return homePage.Img(type,priture_name);
    }

    @Override
    public List<Teacher> teacher() {
        return homePage.teacher();
    }
}
