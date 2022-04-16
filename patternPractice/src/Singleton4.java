
/*
 *懒汉式：与饿汉式区别。再首次使用该对象才创建
 **/

public class Singleton4 {
    //私有构造方法
    private Singleton4() {
    }
    //声明singleton 类型的变量
    private static Singleton4 instance;  //这里没有赋值null

    public static synchronized Singleton4 getInstance() {
        if(instance == null){
            //线程1等待，线程2获取到CPU执行权
            instance = new Singleton4();  //区别这里
        }
        return instance;
    }
}
