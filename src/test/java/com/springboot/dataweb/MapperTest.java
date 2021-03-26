package com.springboot.dataweb;

import com.springboot.dao.VgMapper;
import com.springboot.entity.UserInterestGenre;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class MapperTest {
    @Autowired(required=true)
    private VgMapper vgMapper;
    @Test
    public void findById(){
        Integer id  = 1;
        UserInterestGenre result = vgMapper.findById(id);
        System.out.println(result);
    }

}
