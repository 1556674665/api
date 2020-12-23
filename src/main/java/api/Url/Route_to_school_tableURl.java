package api.Url;

import api.pojo.Route_to_school_table;
import api.server.Route_to_school_table.Route_to_school_tableMpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Route_to_school_tableURl//来校路线
{
    @Autowired
    Route_to_school_tableMpl route_to_school_tableMpl;

    /**
     * 来校路线
     * 路径：/Route_to_school_table
     * @return：list
     */
    @RequestMapping("/Route_to_school_table")
    @ResponseBody
    public List<Route_to_school_table> route_to_school_tables(){
     return route_to_school_tableMpl.Select();
    }
}
