package api.server.Enrollment_and_employment_table;

import api.dao.Enrollment_and_employment_tableDAO;
import api.pojo.Enrollment_and_employment_table;

import java.util.List;

public interface Enrollment_and_employment_tableServer
{
    List<Enrollment_and_employment_table> Select(int limit);

}
