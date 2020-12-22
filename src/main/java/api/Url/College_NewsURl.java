package api.Url;

import api.pojo.College_News;
import api.server.College_News.College_NewsMpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class College_NewsURl //学院新闻
{
    @Autowired
    College_NewsMpl college_newsMpl;

    /**
     *
     * @param limit:数量
     * @return：List<College_News>
     */
    @RequestMapping("/College_News")
    @ResponseBody
    public List<College_News> college_news(@RequestParam int limit)
    {
        return college_newsMpl.College_News(limit);
    }
}
