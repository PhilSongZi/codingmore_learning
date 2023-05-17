package top.codingmore.codingmorehelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 小子松
 * @version 1.0
 * @description
 * @date 2023/5/12 10:30
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String Hello() {
        return "hello springboot。正在放置蜘蛛洞。。。";
    }
}
