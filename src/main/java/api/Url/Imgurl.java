package api.Url;

import api.pojo.Img;
import api.server.Img.Imgserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Imgurl {
    @Autowired
    Imgserver imgserver;

    /**
     *
     * @param type :图片类型
     * @param id：对象id
     * @return ：List<Img>
     */
    @RequestMapping("/img")
    @ResponseBody
    public List<Img> Img(@RequestParam int  type, @RequestParam String id)
    {
        return imgserver.Img(type, id);
    }
}
