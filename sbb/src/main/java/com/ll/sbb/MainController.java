package com.ll.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    int count = 0;

    @ResponseBody
    @GetMapping("/plus")
    public int showPlus(int a, int b) {
        return a + b;
    }

    @GetMapping("/minus")
    @ResponseBody
    public int showMinus(int a, int b) {
        return a - b;
    }

    @ResponseBody
    @GetMapping("/increase")
    public int increase() {

        return count++;
    }

    @ResponseBody
    @RequestMapping("/mbti/{name}")
    public String showMbti(@PathVariable String name) {

        return switch (name) {
            case "박창규", "반장" -> {
                char p = 'P';
                yield "INF" + p;
            }
            case "홍길순", "임꺽정" -> "ENFP";
            default -> "모름";
        };
    }
}

