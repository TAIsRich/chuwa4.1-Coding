package hw4;

import java.util.List;
import java.util.ArrayList;

public class checktype {
    private checktype() {
    }

    private static checktype instance;

    public static checktype getinstance() {
        if (instance == null) {
            synchronized (checktype.class) {
                if (instance == null) {
                    instance = new checktype();
                }
            }
        }
        return instance;
    }

    public ArrayList<iviewer> check(List<iviewer> smsList) {
        if (smsList == null) {
            synchronized (checktype.class) {
                if (smsList == null) {
                    return new ArrayList<iviewer>();
                }
            }
        }
        return null;
    }
}
