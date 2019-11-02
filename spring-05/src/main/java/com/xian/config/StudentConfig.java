package com.xian.config;


import com.xian.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xian")
@Configuration
public class StudentConfig {

    @Bean
    public Student student(){
        return new Student();
    }
}
