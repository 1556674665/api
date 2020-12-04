package api.Url;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/homepage")
public class HomePage {
    @RequestMapping("/Homepage")
    @ResponseBody
    public String Homepage(){

        return  "1";
    }
}
