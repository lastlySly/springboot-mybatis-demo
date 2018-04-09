package cn.lastlysly.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-03-31 17:24
 **/

/*@RestCiontroller是包含@Controller和@ResponseBody组成*/
/*@Controller
@ResponseBody*/
@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

}
