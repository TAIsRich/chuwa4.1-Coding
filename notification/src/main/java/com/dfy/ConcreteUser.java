package com.dfy;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/16/22 10:16 PM
 */
public class ConcreteUser implements Subscriber {

    private String name;
    private String loginName;
    private String passWord;
    private String email;

    public ConcreteUser(String name, String loginName, String passWord) {
        this.name = name;
        this.loginName = loginName;
        this.passWord = passWord;
        System.out.println("Hey " + this.name + ", you have successfully registered to add " +
                "and here is your login Name: " + this.loginName + ", please use this for future references.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public void update(String message) {
        System.out.println(name + message);


    }
}
