`

```
package com.chuwa;

public abstract class laptop {
    private String brand;
    private int SerNumber;
    private String memory;
    private String username;
    private String password;

    public abstract void setPin();


   public void login(){
       System.out.println("login successfully");
   }
   //overload
   public void login(String username,String password){
       System.out.println("login in with parameters");
   }

    public void listenMusic(){
        System.out.println("this song is very popular");
    }

    public void playGame(){
        System.out.println("let's play lol");
    }
}
````

---

`

```
package com.chuwa;

public interface computer {

    public abstract void setPin();

    int findLaptopByserNum(int SerNumber);


}
````

---

`

```
package com.chuwa;

public class macPro extends laptop implements computer{

    public void wifiConnected(){
        System.out.println("wifi has been connected");
    }

    @Override
    public void setPin() {
        System.out.println("pin is 123456");
    }

    @Override
    public int findLaptopByserNum(int SerNumber) {
        return 0;
    }


    @Override
    public void listenMusic() {
        System.out.println("I love this song");
    }

    @Override
    public void playGame() {
        super.playGame();
    }
}
````

`

```
package com.chuwa;

public class test {
    public static void main(String[] args) {
        //polymorphism
        laptop mac1 = new macPro();//向上转型
        mac1.listenMusic();//output:i love this song

       //  macPro temp = new macPro();
        macPro temp = (macPro) mac1;//向下转型
        temp.wifiConnected();//output:wifi has been connected
        int laptopByserNum1 = temp.findLaptopByserNum(123);
        System.out.println("laptopByserNum1 = " + laptopByserNum1);





    }
}
````

