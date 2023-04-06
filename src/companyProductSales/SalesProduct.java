package companyProductSales;

import sales.Product;

public class SalesProduct {
    private final int  salesPersonNumber;
    private Product product;
    private final int totalValueOfProductSoldPerDay;
    private final int totalSales;
    int[][] sales = new int[4][5];


    public SalesProduct(int salesPersonNumber, Product product, int totalValueOfProductSoldPerDay, int totalSales) {
        this.salesPersonNumber = salesPersonNumber;
        this.product = product;
        this.totalValueOfProductSoldPerDay = totalValueOfProductSoldPerDay;
        this.totalSales = totalSales;
    }

    public int getSalesPersonNumber() {
        return salesPersonNumber;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getTotalValueOfProductSoldPerDay() {
        return totalValueOfProductSoldPerDay;
    }

    public int getTotalSales() {
        return totalSales;
    }
}