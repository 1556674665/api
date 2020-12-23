package api.dao;

import api.pojo.Enrollment_and_employment_table;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Enrollment_and_employment_tableDAO
{
    List<Enrollment_and_employment_table> Select(int limit);
}
