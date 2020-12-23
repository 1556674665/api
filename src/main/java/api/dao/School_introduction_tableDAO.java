package api.dao;

import api.pojo.School_introduction_table;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface School_introduction_tableDAO
{
    List<School_introduction_table> Select();
}
