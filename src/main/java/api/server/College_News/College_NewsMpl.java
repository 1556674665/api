package api.server.College_News;

import api.dao.College_NewsDAO;
import api.pojo.College_News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class College_NewsMpl implements College_NewsServer {
    @Autowired
    College_NewsDAO college_newsDAO;
    @Override
    public List<College_News> College_News(int limit) {
        return college_newsDAO.College_News(limit);
    }
}
