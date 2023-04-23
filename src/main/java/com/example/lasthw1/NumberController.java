package com.example.lasthw1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class NumberController {
    @Autowired
    private final NumberService numberService;

    public NumberController(NumberService numberService) {
        this.numberService = numberService;
    }


    @GetMapping("/calc")
    public Map<String, Integer> calc(@RequestParam String type, @RequestParam int x, @RequestParam int y) {
        var result = new Number();
        result.setX(x);
        result.setY(y);
        result.setType(type);
        switch (type) {
            case "sum":
                result.setResult(numberService.addNum(result));
                break;
            case "mult":
                result.setResult((int) numberService.multiply(result));
                break;
            default:
                throw new IllegalArgumentException("Invalid calculation type: " + type);
        }


        return Collections.singletonMap("result", result.getResult());
    }
}
