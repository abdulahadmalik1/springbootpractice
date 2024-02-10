package com.meta.facebook;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class check {
   @Value("${server.port}")
    String prop;
   check()
   {
       System.out.print("PROPORTIES: "+prop);

   }
}
