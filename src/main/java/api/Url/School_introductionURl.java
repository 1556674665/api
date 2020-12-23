package api.Url;

import api.dao.School_introduction_tableDAO;
import api.pojo.School_introduction_table;
import net.sf.json.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/School_introduction")
public class School_introductionURl//学校介绍
{
    @Autowired
    School_introduction_tableDAO school_introduction_tableDAO;

    /**
     * 学校介绍
     * 路径：/School_introduction
     * @return：list
     */
    @RequestMapping("/School_introduction")
    @ResponseBody
    public List<School_introduction_table> school_introduction(){
        return school_introduction_tableDAO.Select();
    }
}
