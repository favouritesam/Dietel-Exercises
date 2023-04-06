package chapterThree;

public class PetrolPurchaseMain {
    public static void main(String[] args) {
        PetrolPurchase petrolPurchase = new PetrolPurchase("london", "fuel", 5, 50.5, 7.0);
        PetrolPurchase petrolPurchase1 = new PetrolPurchase("Abuja","Diesel",2,20.5,1.0);

        System.out.println("\tLocation\tType\tquantity\tprice\tDiscount");
        System.out.print("\t" + petrolPurchase1.getStationLocation());
        System.out.print("\t"+petrolPurchase1.getPetrolType());
        System.out.print("\t"+petrolPurchase1.getQuantityPurchasePerLiter());
        System.out.println("\t"+petrolPurchase1.getPricePerLiter());
//        System.out.print("\t"+petrolPurchase1.getPercentageDiscount());


        System.out.println("the net purchase is "+ petrolPurchase1.purchaseAmount());

        System.out.println();
        System.out.print("\t"+ petrolPurchase.getStationLocation());
        System.out.print("\t"+ petrolPurchase.getPetrolType());
        System.out.print("\t"+ petrolPurchase.getQuantityPurchasePerLiter());
        System.out.print("\t"+ petrolPurchase.getPricePerLiter());
//        System.out.print("\t"+ petrolPurchase.getPercentageDiscount());


    }
    }
