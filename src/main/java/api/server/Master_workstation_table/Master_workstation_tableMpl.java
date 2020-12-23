package api.server.Master_workstation_table;

import api.dao.Master_workstation_tableDAO;
import api.pojo.Master_workstation_table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Master_workstation_tableMpl implements Master_workstation_tableServer
{
    @Autowired
    Master_workstation_tableDAO master_workstation_tableDAO;
    @Override
    public List<Master_workstation_table> Select(int limit) {
        return master_workstation_tableDAO.Select(limit);
    }
}
