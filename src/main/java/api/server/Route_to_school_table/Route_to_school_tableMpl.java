package api.server.Route_to_school_table;

import api.dao.Route_to_school_tableDAO;
import api.pojo.Route_to_school_table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Route_to_school_tableMpl implements Route_to_school_tableServer
{
    @Autowired
    Route_to_school_tableDAO route_to_school_tableDAO;
    @Override
    public List<Route_to_school_table> Select() {
        return route_to_school_tableDAO.Select();
    }
}
