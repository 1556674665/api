package api.server.Enrollment_and_employment_table;

import api.dao.Enrollment_and_employment_tableDAO;
import api.pojo.Enrollment_and_employment_table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Enrollment_and_employment_tableMpl implements Enrollment_and_employment_tableServer{
    @Autowired
    Enrollment_and_employment_tableDAO enrollment_and_employment_tableDAO;
    @Override
    public List<Enrollment_and_employment_table> Select(int limit) {
        return enrollment_and_employment_tableDAO.Select(limit);
    }
}
