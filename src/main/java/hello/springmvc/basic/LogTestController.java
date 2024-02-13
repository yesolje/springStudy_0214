package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController //restController는 반환하는 값이 페이지 명이 아니라 데이터 그 자체이다.
public class LogTestController {

    //private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "spring";

        //log에 연산자 + 를 사용하게 되면 java는 log 레벨에 상관없이 일단 메모리를 사용하여 계산을 하고 봄
        //메모리 낭비가 생긴다.
        log.trace("trace log={}",name);
        log.debug("debug log={}",name);
        log.info("info log={}",name);
        log.warn("warn log={}",name);
        log.error("error log={}",name);


        return "ok";
    }
}
