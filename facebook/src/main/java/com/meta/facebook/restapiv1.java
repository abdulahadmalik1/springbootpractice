package com.meta.facebook;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class restapiv1 {
    private List<userdb> userdbList= new ArrayList<>();
    @GetMapping("/message1")
    String getMessage1() {
        return "HI WELCOME ABDULAHAD Welcommee FROM MESSAGE1";
    }

    @GetMapping("/message2")
    String getMessage2() {
        return "HI WELCOME ABDULAHAD FOR MESSAGE2";
    }


    @PostMapping("/apiv2")
    public String post(@RequestBody userdb a1) {
        String userid = a1.userid();
        String orderid = a1.orderid();
        userdb a11 = new userdb(userid, orderid);
        userdbList.add(a11);
        for(userdb check:userdbList)
        {
            check.display();
        }
        return "ORDER ADDED SUCCESSFULLY: ORDER ID:" + orderid + " USER ID:" + userid;

    }


}
