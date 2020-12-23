package api.Url;

import api.pojo.Curriculum;
import api.server.curriculum_table.Curriculum_tableMpl;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Curriculum_tableURl {//课程
    @Autowired
    Curriculum_tableMpl curriculumtableMpl;

    /**
     * 课程
     * 路径：/Curriculumtable
     * @param limit:数量
     * @return：list
     */
    @RequestMapping("/Curriculumtable")
    @ResponseBody
    public List<Curriculum> curriculum(@RequestParam(value = "limit",defaultValue = "0") int limit)//获取课程信息
    {
        return curriculumtableMpl.curriculum(limit);
    }

}
