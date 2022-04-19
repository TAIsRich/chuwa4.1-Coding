package model;

public class User {

    private String loginName;
    private String firstName;
    private String notifyMethod;

    public static class Builder {

        private final User instance;

        Builder() {
            instance = new User();
        }

        public User.Builder loginName(String loginName) {
            instance.setLoginName(loginName);
            return this;
        }

        public User.Builder firstName(String firstName) {
            instance.setFirstName(firstName);
            return this;
        }

        public User.Builder notifyMethod(String notifyMethod) {
            instance.setNotifyMethod(notifyMethod);
            return this;
        }

        public User build() {
            return instance;
        }

    }

    public static User.Builder builder() {
        return new User.Builder();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNotifyMethod() {
        return notifyMethod;
    }

    public void setNotifyMethod(String notifyMethod) {
        this.notifyMethod = notifyMethod;
    }

    @Override
    public String toString() {
        return String.format("User loginName %s, firstName %s, notification method %s",
                loginName, firstName, notifyMethod);
    }
}
