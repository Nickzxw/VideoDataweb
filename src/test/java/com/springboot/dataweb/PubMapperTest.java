package com.springboot.dataweb;

import com.springboot.dao.PublisherMapper;
import com.springboot.dao.VgMapper;
import com.springboot.entity.UserInterestGenre;
import com.springboot.entity.UserInterestPublisher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
public class PubMapperTest {
    @Autowired(required=true)
    private PublisherMapper publisherMapper;
    @Test
    public void Pub(){
        List<UserInterestPublisher> result2 = publisherMapper.selectPublisherValue();
        System.out.println(result2);
    }

}
