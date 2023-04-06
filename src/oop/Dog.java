package oop;

public class Dog extends Animals{
    private String tails;

    public void bites(){
        System.out.println("make noise and 1 bite you!!!!!");
    }

@Override
 public String makeSound() {
   return "bark bark bark!!!!!!";
}
}
