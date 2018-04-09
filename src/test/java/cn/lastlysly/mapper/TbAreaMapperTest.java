package cn.lastlysly.mapper;

import cn.lastlysly.pojo.TbArea;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TbAreaMapperTest {
    @Autowired
    private TbAreaMapper tbAreaMapper;

    @Test
    @Ignore
    public void countByExample() throws Exception {
    }

    @Test
    @Ignore
    public void deleteByExample() throws Exception {
    }

    @Test
    public void insert() throws Exception {
        TbArea tbArea = new TbArea();
        tbArea.setAreaName("极乐净土");
        tbArea.setPriority("12");
        System.out.print("我在添加数据\n");
        tbAreaMapper.insert(tbArea);
    }

    @Test
    @Ignore
    public void insertSelective() throws Exception {
    }

    @Test
    public void selectByExample() throws Exception {
        List<TbArea> arealist = tbAreaMapper.selectByExample(null);
        System.out.print("数据表有"+ arealist.size() +"条数据。\n");
    }

    @Test
    @Ignore
    public void updateByExampleSelective() throws Exception {
    }

    @Test
    @Ignore
    public void updateByExample() throws Exception {
    }

}