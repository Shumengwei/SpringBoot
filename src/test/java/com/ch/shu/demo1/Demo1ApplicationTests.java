package com.ch.shu.demo1;

import com.ch.shu.demo1.pojo.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo1ApplicationTests {
@Autowired
private Dog dog;
    @Test
    void contextLoads() {
        System.out.println(dog);
    }

}
