package api.Url;

import net.sf.json.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/School_introduction")
public class School_introduction
{
    @RequestMapping("/School_introduction")
    @ResponseBody
    public String school_introduction(){
        return "";
    }
}
