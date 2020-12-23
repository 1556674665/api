package api.server.Master_workstation_table;

import api.pojo.Master_workstation_table;

import java.util.List;

public interface Master_workstation_tableServer
{
    List<Master_workstation_table> Select(int limit);

}
