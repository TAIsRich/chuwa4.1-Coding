import model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NotificationApplication {

    private static final String REGISTER = "register";
    private static final String NOTIFY = "notify";
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final List<String> NOTIFICATION_METHODS = List.of("SMS", "EMAIL", "email");
    private static final Map<String, User> USER_LIST = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please choose function. Type 'register' to register new user, " +
                    "'notify' to send notification");
            if (SCANNER.hasNextLine()) {
                String function = SCANNER.nextLine();
                if (function.equalsIgnoreCase(REGISTER)) {
                    register();
                } else if (function.equalsIgnoreCase(NOTIFY)) {
                    notifyUser();
                } else {
                    System.out.printf("Function type %s is not allowed.%n", function);
                }
                printUserList();
            }
        }
    }

    private static void register() {
        System.out.println("Please input your loginName, firstName and Notification Method (SMS or email). " +
                "In format loginName;firstName;notification method");
        while (SCANNER.hasNextLine()) {
            String userInput = SCANNER.nextLine();
            String[] userInfo = userInput.split(";");
            if (userInfo.length !=3 || !NOTIFICATION_METHODS.contains(userInfo[2])) {
                System.out.println("Your input is in wrong format, pls input again");
            } else {
                User user = User.builder()
                        .loginName(userInfo[0])
                        .firstName(userInfo[1])
                        .notifyMethod(userInfo[2])
                        .build();
                USER_LIST.put(user.getLoginName(), user);
                break;
            }
        }
    }

    private static void notifyUser() {
        System.out.println("Please provide notify user and his method in format loginName;notifyMethod");
        while (SCANNER.hasNextLine()) {
            String userInput = SCANNER.nextLine();
            String[] userInfo = userInput.split(";");
            if (userInfo.length !=2 || !USER_LIST.containsKey(userInfo[0]) || !NOTIFICATION_METHODS.contains(userInfo[1])) {
                System.out.println("Your input is in wrong format, pls input again");
            } else {
                User user = USER_LIST.get(userInfo[0]);
                try {
                    if (!user.getNotifyMethod().equalsIgnoreCase(userInfo[1])) {
                        throw new RuntimeException("Input notification method does not match the user registered method.");
                    } else {
                        System.out.printf("Hey %s, you have successfully registered to add and here is your " +
                                "<%s>, please use this for future references.\n", user.getFirstName(), user.getLoginName());
                        break;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage() + " Please try again.");
                }
            }
        }
    }

    public static void printUserList() {
        System.out.println("-------------------Existing User List---------------------");
        for (Map.Entry<String, User> entry : USER_LIST.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
        System.out.println("----------------------------------------------------------");
    }
}

