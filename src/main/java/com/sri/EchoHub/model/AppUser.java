package com.sri.EchoHub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class AppUser {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int usno;
    private String name;
    private String mailid;
    private String mobile;

    public AppUser() {
    }

    public AppUser(int usno, String name, String mailid, String mobile) {
        this.usno = usno;
        this.name = name;
        this.mailid = mailid;
        this.mobile = mobile;
    }

    public int getUsno() {
        return usno;
    }

    public String getName() {
        return name;
    }

    public String getMailid() {
        return mailid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setUsno(int usno) {
        this.usno = usno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
