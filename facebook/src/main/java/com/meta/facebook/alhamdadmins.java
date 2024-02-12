package com.meta.facebook;

import jakarta.persistence.*;
import jdk.jfr.Unsigned;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name="alhamd-admins")
public class alhamdadmins {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adminid;
   private String pass;
    private String email;
    public alhamdadmins()
    {

    }
    public alhamdadmins(String email,String pass)
    {
        this.email=email;
        this.pass=pass;
    }
    void setEmail(String email)
    {
        this.email=email;
    }
    String getEmail()
    {
        return this.email;
    }
    String getPass()
    {
        return this.pass;
    }

    public Long getAdminId() {
        return  this.adminid;
    }
}
