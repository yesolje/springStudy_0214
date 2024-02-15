package hello.springmvc.basic.requestmapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class MappingController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping(value="/hello-basic",method = RequestMethod.GET)
    public String helloBasic(){
        log.info("hello basic");
        return "ok";
    }
    @GetMapping(value="/mapping-get-v2")
    public String mappingGetV2(){
        log.info("hello basic");
        return "ok";
    }

    @GetMapping("/mapping/{userId}") //Parth variable (경로 변수)
    public String mappingPath(@PathVariable("userId")String data){
        log.info("mappingPath userId={}", data);
        return "ok";
    }
}
