
/*
 *懒汉式：与饿汉式区别。再首次使用该对象才创建
 **/

public class Singleton3 {
    //私有构造方法
    private Singleton3() {
    }
    //声明singleton 类型的变量
    private static Singleton3 instance;  //这里没有赋值null

    public static Singleton3 getInstance() {
        if(instance == null){
            instance = new Singleton3();  //区别这里
        }
        return instance;
    }
}
