package com.meta.facebook;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class restapiv2 {
    private final admindsrepo adminlist;

    public restapiv2(admindsrepo admi) {
        this.adminlist = admi;
    }
    @PostMapping("/addadmin")
    String addAdmin(@RequestBody  alhamdadmins obj){

        // Check if a user with the same ID already exists
       adminlist.save(obj);
                System.out.print("USER EMAIL"+obj.getEmail());
            return  obj.getEmail();
    }

}
