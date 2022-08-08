package aa.aswe.eww;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class Mycontroller {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {

        return "hello";

    }

}
