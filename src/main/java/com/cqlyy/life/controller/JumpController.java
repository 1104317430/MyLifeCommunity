package com.cqlyy.life.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: cqlyy
 * @Date: 2019/08/01 22:05
 * @Version 1.0
 */
@Controller
public class JumpController {
    /**
     * Jump homepage 跳转主页
     * @return
     */
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
