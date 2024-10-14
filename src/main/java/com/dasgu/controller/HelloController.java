package com.dasgu.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class HelloController {

    @RequestMapping(value = "/hi/msg={msg}&a={a}", method = RequestMethod.GET)
    Object hi(@PathVariable String msg, @PathVariable Integer a) {
        HashMap<Object, Object> mp = new HashMap<>();
        mp.put(msg, "hi~~");
        mp.put(a, "int");
        return mp;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    Object hello(@RequestParam String msg, @RequestParam String a) {
        HashMap<Object, Object> mp = new HashMap<>();
        mp.put(msg, "hi~~");
        mp.put(a, "int");
        return mp;
    }
}
