package cn.lastlysly.service;

import cn.lastlysly.pojo.TbArea;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-04-03 17:44
 **/
public interface TbAriaService {

    /**
     * 获取全部列表
     * @return
     */
    List<TbArea> getAreaList();

    /**
     * 添加地区
     * @param tbArea
     * @return
     */
    boolean addArea(TbArea tbArea);

    /**
     * 通过主键ID查询地区
     * @return
     */
    TbArea getAreaById(int areaId);

    /**
     * 通过主键ID删除
     * @return
     */
    boolean deleteArea(int areaId);
}
