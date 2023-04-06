package chapterThree;

public class PetrolPurchase {
    public static void main(String[] args) {

    }
    private String stationLocation;
    private  String petrolType;
    private  int quantityPurchasePerLiter;
    private double pricePerLiter;
    private  double percentageDiscount;



    public PetrolPurchase(String stationLocation, String petrolType, int quantityPurchasePerLiter, double pricePerLiter, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.quantityPurchasePerLiter = quantityPurchasePerLiter;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantityPurchasePerLiter() {
        return quantityPurchasePerLiter;
    }

    public void setQuantityPurchasePerLiter(int quantityPurchasePerLiter) {
        this.quantityPurchasePerLiter = quantityPurchasePerLiter;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double purchaseAmount(){
//        double netPurchase = (quantity * pricePerLiter) - percentageDiscount;
//        return netPurchase;

        double netPurchase = quantityPurchasePerLiter * pricePerLiter;
        return netPurchase - percentageDiscount;
    }
}







