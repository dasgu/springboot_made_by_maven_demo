package com.dasgu.controller;

import com.dasgu.bean.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class HelloController {

    @Autowired
    private A a;

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


    @RequestMapping(value = "/cycle", method = RequestMethod.GET)
    Object cycle() {
        HashMap<Object, Object> mp = new HashMap<>();
        if (a == a.getB().getA()) {
            mp.put("isSame", true);
        }
        else {
            mp.put("isSame", false);
        }
        return mp;
    }
}
