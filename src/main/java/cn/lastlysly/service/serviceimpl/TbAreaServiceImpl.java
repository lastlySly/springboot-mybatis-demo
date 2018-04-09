package cn.lastlysly.service.serviceimpl;

import cn.lastlysly.mapper.TbAreaMapper;
import cn.lastlysly.pojo.TbArea;
import cn.lastlysly.pojo.TbAreaExample;
import cn.lastlysly.service.TbAriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-04-09 15:58
 **/
@Service
public class TbAreaServiceImpl implements TbAriaService {

    @Autowired
    private TbAreaMapper tbAreaMapper;

    @Override
    public List<TbArea> getAreaList() {
        int a = 1/0;
        return tbAreaMapper.selectByExample(null);
    }


//    @Transactional  事务控制   默认回滚RuntimeException这个异常，并不是所有异常都会滚
//    @Transactional(rollbackFor = Exception.class) 设置回滚Exception这个异常

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean addArea(TbArea tbArea) {

        if (tbArea.getAreaName() != null && !"".equals(tbArea.getAreaName())){
            tbArea.setCreateTime(new Date());
            tbArea.setLastEditTime(new Date());
            try{
                int row = tbAreaMapper.insert(tbArea);
                if (row > 0){
                    return true;
                }else{
                    throw new RuntimeException("插入区域信息失败");
                }
            }catch (Exception e){
                throw new RuntimeException("插入区域信息失败" + e.getMessage());
            }

        }else{
            throw  new RuntimeException("区域信息不能为空：");
        }
    }


    @Override
    public TbArea getAreaById(int areaId) {
        TbAreaExample tbAreaExample = new TbAreaExample();
        TbAreaExample.Criteria criteria = tbAreaExample.createCriteria();
        criteria.andAreaIdEqualTo(areaId);
        TbArea tbArea = (tbAreaMapper.selectByExample(tbAreaExample)).get(0);
        return tbArea;
    }

    @Override
    public boolean deleteArea(int areaId) {
        return false;
    }
}
