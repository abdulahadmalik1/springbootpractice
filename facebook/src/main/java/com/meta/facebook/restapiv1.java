package com.meta.facebook;

import org.springframework.web.bind.annotation.*;

@RestController
public class restapiv1 {
    private clientsrepo User;

    public restapiv1(clientsrepo user) {
        User = user;
    }

    @PostMapping("/register")
    clients addUser(@RequestBody clients user)
    {
    return User.save(user);
    }

}
