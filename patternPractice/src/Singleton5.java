
/*
 *懒汉式：与饿汉式区别。再首次使用该对象才创建
 **/

public class Singleton5 {
    //私有构造方法
    private Singleton5() {
    }
    //声明singleton 类型的变量
    private static Singleton5 instance;  //这里没有赋值null

    public static Singleton5 getInstance() {
        //第一次判断
        if(instance == null){
            synchronized (Singleton5.class){
                //第二次判断
                if(instance == null){
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
