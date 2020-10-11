package com.example.hstudent;

public class UserHelperClass {
    String  name,username,address,cont,orgname,crime;

    public UserHelperClass(String name, String username, String address, String cont, String orgname, String crime) {
    }


    public UserHelperClass(String orgname) {
        this.orgname = orgname;
        this.name=name;
        this.username=username;
        this.cont=cont;
        this.address=address;
        this.crime=crime;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }
}

