package api.server.curriculum_table;

import api.dao.Curriculum_tableDAO;
import api.pojo.Curriculum;
import api.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Curriculum_tableMpl implements curriculum_tableServer {
    @Autowired
    Curriculum_tableDAO homePage;
    @Override
    public List<Curriculum> curriculum(int limit) {
        return homePage.curriculum(limit);
    }
}
