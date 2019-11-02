package com.xian.BeanLife;

import com.xian.config.StudentConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanLifeTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext=  new AnnotationConfigApplicationContext(StudentConfig.class);

        annotationConfigApplicationContext.close();
    }
}
