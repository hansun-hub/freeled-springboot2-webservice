package com.jojoldu.book.springboot.web;

import org.junit.Test;
//import org.springframework.boot.test.web.client.TestResetTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


public class IndexControllerTest {
    @Autowired
    //private TestResetTemplate resetTemplate;

    @Test
    public void 메인페이지_로딩(){
        //when
        //String body = this.resTemplate.getForObject("/",String,class);

        //then
       // assertThat(body).contains("스프링 부트로 시작하는 웹 서비스");
    }
}
