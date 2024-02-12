package com.meta.facebook;

public record userdb(
        String userid,String orderid
) {
    void display()
    {
        System.out.println("USER-ID: "+userid + " ORDER-ID: "+orderid);
    }
}
