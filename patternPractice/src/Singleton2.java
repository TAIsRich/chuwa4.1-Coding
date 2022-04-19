
/*
 *饿汉式:静态代码块
 **/

public class Singleton2 {
    //私有构造方法
    private Singleton2() {
    }
    //声明singleton 类型的变量
    private static Singleton2 instance;  //null

    static {
        instance = new Singleton2();
    }


    public static Singleton2 getInstance() {
        return instance;
    }
}
