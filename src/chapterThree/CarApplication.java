package chapterThree;

public class CarApplication {

    public static void main(String[] args) {
        Car car = new Car("sensive Kia","2030",500.00);
        Car car1 = new Car("slove V","2035",200.00);

        System.out.print("\t"+car.getModel()+"\t"+car.getYear()+"\t"+car.getPrice()+"\n");
        System.out.println("\t"+car1.getModel()+"\t"+car1.getYear()+"\t"+car1.getPrice());


        System.out.println("The 7% discount for car1 is "+car.discount(0.07));
        System.out.println("The 10% discount for car2 is "+car1.discount(0.10));
    }
    }

