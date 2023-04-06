package oopTwo;

public class MainClass {
    public static void main(String[] args) {
//        Human human = new Human();
//        human.eat();
//        human.sleep();
//        human.walk();
        NativeFavour nativeFavour = new NativeFavour();
        nativeFavour.learnJava();
        nativeFavour.learnPython();
        nativeFavour.walk();

        Human human1 = new NativeFavour();
        human1.eat();
        human1.sleep();
        human1.walk();


    }
}
