package com.qiyun.notif.service;

import com.qiyun.notif.domain.User;

public class UserListService {
    private User[] users;

//  construct userList according to UserData
    public UserListService(){
        users = new User[UserData.USERS.length];
//        get user info from UserData

        for (int i = 0; i < users.length; i++){
            int id = Integer.parseInt(UserData.USERS[i][0]);
            String firstName = UserData.USERS[i][1];
            String email = UserData.USERS[i][3];
            String loginName = UserData.USERS[i][2];
            int preference = Integer.parseInt(UserData.USERS[i][4]);


            users[i] = new User(id, firstName, email, loginName, preference);
        }
    }

    public User[] getAllUsers() {
        return users;
    }

    public User getUser(int id) throws UserException {
        for (int i = 0; i < users.length; i++){
            if (users[i].getId() == id){
                return users[i];
            }
        }
        throw new UserException("Cannot find user");
    }
}
