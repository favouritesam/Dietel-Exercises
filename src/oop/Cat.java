package oop;

public class Cat extends Animals{
    private String whiskers;

    public void bites(){
        System.out.println("cat can bite !!!!!");
    }

    @Override
    public String makeSound() {
        return "meow meow meow!!!!!!";
    }
}


