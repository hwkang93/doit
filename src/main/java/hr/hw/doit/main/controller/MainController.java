package hr.hw.doit.main.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


//없어도 될 것 같음
//디폴트 페이지 설정하면 될 듯..
@Slf4j
@RequestMapping("/main")
@Controller
public class MainController {

    @GetMapping
    public String main() {
        log.info("main");
        return "main";
    }
}
