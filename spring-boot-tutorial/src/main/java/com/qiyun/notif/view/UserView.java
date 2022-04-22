package com.qiyun.notif.view;

import com.qiyun.notif.view.TSUtility;

public class UserView {
    //    UserView --- Singleton
    private UserView() {
    }

    private static UserView instance = new UserView();

    public static UserView getInstance() {
        return instance;
    }


    private com.qiyun.notif.service.UserListService listSvc = new com.qiyun.notif.service.UserListService();
    private com.qiyun.notif.service.Notification notif = new com.qiyun.notif.service.Notification();

    public void enterMainMenu() {
        boolean loopFlag = true;
        char key = 0;

        do {
            if (key != '1') {
                listAllUsers();
            }
            System.out.print("1-Current users 2-Send email to id 3-Exit   choose(1-3)：");
            key = TSUtility.readMenuSelection();
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
                    char yn = TSUtility.readConfirmSelection();
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
        com.qiyun.notif.domain.User[] emps = listSvc.getAllUsers();
        if (emps.length == 0) {
            System.out.println("User not found");
        } else {
            System.out.println("ID\tfirstName\temail\tloginName");
        }

        for (com.qiyun.notif.domain.User e : emps) {
            System.out.println(" " + e);
        }
        System.out
                .println("-------------------------------------------------------------------------------");
    }

    private void sendEmail() {
        System.out.println("---------------------send message---------------------");
        System.out.print("Please enter ID to send message：");
        int id = TSUtility.readInt();

        try {
            com.qiyun.notif.domain.User e = listSvc.getUser(id);
            notif.sendEmail(e);
            System.out.println("message sent");
        } catch (com.qiyun.notif.service.UserException e) {
            System.out.println("Cannot send message: " + e.getMessage());
        }
        // 按回车键继续...
        TSUtility.readReturn();
    }

    public static void main(String[] args) {
        UserView view = UserView.getInstance();
        view.enterMainMenu();
    }
}
