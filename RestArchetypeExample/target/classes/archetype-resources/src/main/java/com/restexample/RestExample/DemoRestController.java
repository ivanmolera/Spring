package com.restexample.RestExample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ivanmolera on 13/06/2017.
 */
@RestController
@RequestMapping(value ="/demo")
public class DemoRestController {
    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }
}
