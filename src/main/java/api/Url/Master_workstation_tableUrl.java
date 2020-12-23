package api.Url;

import api.pojo.Master_workstation_table;
import api.server.Master_workstation_table.Master_workstation_tableMpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Master_workstation_tableUrl {//工作站
    @Autowired
    Master_workstation_tableMpl master_workstation_tableMpl;

    /**
     *工作站
     * @param limit:数量
     * @return：List<>类型
     */
    @RequestMapping("/Master_workstation_table")
    @ResponseBody
    public List<Master_workstation_table> master_workstation_table(@RequestParam(value="limit",defaultValue = "0") int limit){
        return master_workstation_tableMpl.Select(limit);
    }
}
