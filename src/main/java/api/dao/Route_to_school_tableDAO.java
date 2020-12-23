package api.dao;


import api.pojo.Route_to_school_table;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Route_to_school_tableDAO
{
    List<Route_to_school_table> Select();
}
