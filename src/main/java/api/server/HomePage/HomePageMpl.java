package api.server.HomePage;

import api.dao.HomePageDAO;
import api.pojo.homePage.College_News;
import api.pojo.homePage.Curriculum;
import api.pojo.Img;
import api.pojo.homePage.Teacher;
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
    public List<Img> Img(int type) {
        return homePage.Img(type);
    }

    @Override
    public List<Teacher> teacher() {
        return homePage.teacher();
    }
}
