package api.server.Img;

import api.dao.ImgDAO;
import api.pojo.Img;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImgMpl implements Imgserver
{
    @Autowired
    ImgDAO imgDAO;
    @Override
    public List<Img> Img(int type,int id) {
        return imgDAO.Img(type, id);
    }
}
