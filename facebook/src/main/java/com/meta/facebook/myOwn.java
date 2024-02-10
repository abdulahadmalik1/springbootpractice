package com.meta.facebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

public class myOwn {
    void setHonda(car hond)
   {
       this.honda=hond;
   }
    public myOwn(car honda) {
        this.honda = honda;
    }

    car honda;
    private String myname;
    void output()
    {
        System.out.println("HIIIIIIIII");
    }
}
