package hw4;

public enum phoneoremail {
    instance;

    public boolean isnum(String s) { // if all number return true, else false
        try {
            long b = Long.parseLong(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
