package api.Url;

import api.pojo.Enrollment_and_employment_table;
import api.server.Enrollment_and_employment_table.Enrollment_and_employment_tableMpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class Enrollment_and_employment_tableURL//招生就业
{
    @Autowired
    Enrollment_and_employment_tableMpl enrollment_and_employment_tableMpl;

    /**
     * 招生就业
     * 路径:/Enrollment_and_employment_tableMpl
     * @param limit：数量
     * @return：list
     */
    @RequestMapping("/Enrollment_and_employment_tableMpl")
    @ResponseBody
    public List<Enrollment_and_employment_table> enrollment_and_employment_tables(@RequestParam(value = "limit",defaultValue = "0") int limit){
        return enrollment_and_employment_tableMpl.Select(limit);
    }
}
