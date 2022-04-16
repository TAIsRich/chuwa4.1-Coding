package com.qiyun.notif.view;

import com.qiyun.notif.domain.*;
import com.qiyun.notif.service.*;

public class UserView {
//    UserView --- Singleton
    private UserView(){}
    private static UserView instance = new UserView();
    public static UserView getInstance(){
        return instance;
    }


    private UserListService listSvc = new UserListService();
    private Notification notif = new Notification();

    public void enterMainMenu() {
        boolean loopFlag = true;
        char key = 0;

        do {
            if (key != '1') {
                listAllUsers();
            }
            System.out.print("1-Current users 2-Send email to id 3-Exit   choose(1-3)：");
            key = com.qiyun.notif.view.TSUtility.readMenuSelection();
            System.out.println();
            switch (key) {
                case '1':
                    listAllUsers();
                    break;
                case '2':
                    sendEmail();
                    break;
                case '3':
                    System.out.print("Exit(Y/N)：");
                    char yn = com.qiyun.notif.view.TSUtility.readConfirmSelection();
                    if (yn == 'Y')
                        loopFlag = false;
                    break;
            }
        } while (loopFlag);
    }

    // 显示所有的员工成员
    private void listAllUsers() {
        System.out
                .println("\n---------------------------------------------------------------\n");
        User[] emps = listSvc.getAllUsers();
        if (emps.length == 0) {
            System.out.println("User not found");
        } else {
            System.out.println("ID\tfirstName\temail\tloginName");
        }

        for (User e : emps) {
            System.out.println(" " + e);
        }
        System.out
                .println("-------------------------------------------------------------------------------");
    }

    private void sendEmail() {
        System.out.println("---------------------send message---------------------");
        System.out.print("Please enter ID to send message：");
        int id = com.qiyun.notif.view.TSUtility.readInt();

        try {
            User e = listSvc.getUser(id);
            notif.sendEmail(e);
            System.out.println("message sent");
        } catch (UserException e) {
            System.out.println("Cannot send message: " + e.getMessage());
        }
        // 按回车键继续...
        com.qiyun.notif.view.TSUtility.readReturn();
    }

    public static void main(String[] args) {
        UserView view = UserView.getInstance();
        view.enterMainMenu();
    }
}
