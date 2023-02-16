package com.deady.loan_calculator.controller;

import com.deady.loan_calculator.model.EquivalentRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @author 吴文哲
 * @date 2023/2/16 21:17
 **/
@RestController
@RequestMapping("/calculate")
public class CalculateController {


    @PostMapping("/test")
    @ResponseBody
    public String test(@RequestBody EquivalentRequest request) {
        return "hello";
    }
}
