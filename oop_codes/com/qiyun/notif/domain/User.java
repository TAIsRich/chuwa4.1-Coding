package com.qiyun.notif.domain;

public class User {
    private int id;
    private String firstName;
    private String email;
    private String loginName;
    private int preference;

    public User() {
    }

    public User(int id, String firstName, String email, String loginName, int preference) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.loginName = loginName;
        this.preference = preference;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void sendEmail(){
        if (this.preference== 0){
            System.out.println("sent by phone");

        }else{
            System.out.println("sent by email");
        }
        System.out.println("Hey "+ this.firstName + ", you have successfully " +
                "registered to add and here is your "+ this.loginName +
                ", please use this for future references.\n");
    }

    @Override
    public String toString() {
        return id + "\t" + firstName + "\t" + email+ "\t" +loginName;
    }
}
