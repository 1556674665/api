package api.dao;

import api.pojo.Master_workstation_table;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Master_workstation_tableDAO //工作站
{
    List<Master_workstation_table> Select(int limit);
}

