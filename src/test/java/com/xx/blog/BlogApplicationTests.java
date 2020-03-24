package com.xx.blog;

import com.xx.blog.util.constant.TypeEnum;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BlogApplicationTests {

    @Test
    void contextLoads() {
        System.out.println();
        List<String> list = TypeEnum.typeEnumsList();
        for (String t: list
             ) {
            System.out.println(t);
        }
    }

}
