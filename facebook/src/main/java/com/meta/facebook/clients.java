package com.meta.facebook;

import jakarta.persistence.*;

@Entity
@Table(name="userskhan12")
public class clients {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String username;
   public clients(String username, String pass)
    {
        this.username=username;
        this.pass=pass;
    }
   public clients()
    {

    }
    private String pass;

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }
public String getUsername()
{
    return this.username;
}
    public clients(String pass) {
        this.pass = pass;
    }
}
