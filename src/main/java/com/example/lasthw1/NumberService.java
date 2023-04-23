package com.example.lasthw1;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NumberService {
    private final NumberRepository numberRepository;

    public NumberService(NumberRepository numberRepository) {
        this.numberRepository = numberRepository;
    }

    @Transactional
    public int addNum(Number number){
        int sum = number.getX() +number.getY();
        number.setResult(sum);
        return sum;
    }
    @Transactional
    public long multiply(Number number){
        int multiply = number.getX() * number.getY();
        number.setResult(multiply);
        return multiply;
    }
}
