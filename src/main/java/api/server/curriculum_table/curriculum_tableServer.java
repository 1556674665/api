package api.server.curriculum_table;

import api.pojo.Curriculum;
import api.pojo.Teacher;

import java.util.List;

public interface curriculum_tableServer {
    List<Curriculum> curriculum(int limit);//获取课程

}
