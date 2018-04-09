package cn.lastlysly.controller;

import cn.lastlysly.pojo.TbArea;
import cn.lastlysly.service.TbAriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-04-09 16:15
 **/

@RestController
@RequestMapping("/superadmin")
public class AreaController {

    @Autowired
    private TbAriaService tbAriaService;

    @RequestMapping(value = "/listarea",method = RequestMethod.GET)
    private Map<String,Object> listArea(){
        Map<String,Object> map = new HashMap<String,Object>();
        List<TbArea> list = tbAriaService.getAreaList();
        map.put("arealist",list);
        return map;
    }

    @RequestMapping(value = "/addarea",method = RequestMethod.POST)
    private Map<String,Object> addArea(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> map = new HashMap<String,Object>();
        TbArea tbArea = new TbArea();
        tbArea.setAreaName("东方");
        tbArea.setPriority("13");
        boolean flag = tbAriaService.addArea(tbArea);
        if (flag){
            map.put("tip","添加成功");
        }else{
            map.put("tip","添加失败");
        }
        return map;
    }


    @RequestMapping(value = "/getareabyid/{id}",method = RequestMethod.GET)
    private Map<String,Object> getAreaById(@PathVariable("id") int areaId){
        System.out.print("测试"+areaId);
        Map<String,Object> map = new HashMap<String,Object>();
        TbArea tbArea = tbAriaService.getAreaById(areaId);
        map.put("areabyid",tbArea);
        return map;
    }


}
