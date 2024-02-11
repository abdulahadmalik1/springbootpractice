package com.meta.facebook;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.List;
@RestController
public class restapi {
    Map<Integer,String> userdata = new HashMap<Integer, String>();

    @PostMapping("/id/{value}")
    String putVal(@PathVariable int value) {
        userdata.put(value,UUID.randomUUID().toString());
        return "INSERTED ID";
    }

    @GetMapping("/id/{value}")
    String val(@PathVariable int value) {
 return userdata.get(value);
    }
}
