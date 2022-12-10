package hr.hw.doit.main.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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
