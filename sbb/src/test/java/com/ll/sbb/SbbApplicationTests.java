package com.ll.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
class SbbApplicationTests {
    @ResponseBody
    @GetMapping("/name")
    public String index() {

        return "박창규";
    }
}