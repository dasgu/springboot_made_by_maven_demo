package com.dasgu.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class HelloController {

    @RequestMapping(value = "/hi/{msg}", method = RequestMethod.GET)
    Object hi(@PathVariable String msg) {
        HashMap<String, Object> mp = new HashMap<>();
        mp.put(msg, "hi~~");
        return mp;
    }
}
