package api.server.School_introduction_table;

import api.dao.School_introduction_tableDAO;
import api.pojo.School_introduction_table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class School_introduction_tableMpl implements School_introduction_tableServer
{
    @Autowired
    School_introduction_tableDAO school_introduction_tableDAO;
    @Override
    public List<School_introduction_table> Select() {
        return school_introduction_tableDAO.Select();
    }
}
