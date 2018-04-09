package cn.lastlysly.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-04-09 16:40
 **/

//@ControllerAdvice 标识这是一个异常处理类

@ControllerAdvice
public class GlobalExceptionHandler {
//    @ExceptionHandler(value = Exception.class)  处理指定的异常

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    private Map<String,Object> exceptionHandler(HttpServletRequest request,Exception e){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code","0");
        map.put("tip",e.getMessage()+"该方法已被故意写出异常，用于测试异常处理类");
        return map;
    }
}
