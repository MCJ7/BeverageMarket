package com.mcj.beverage;

import java.util.List;

/**
 *
 * @author maxco
 */
public class BeverageRack{
    
    /**
     *
     */
    private Beverage[][] beverages;

    /**
     *
     * @param row
     * @param column
     */
    public BeverageRack(Integer row, Integer column) {
        this.beverages =  new Beverage [row][column];
    }

    /**
     *
     * @return
     */
    public Beverage[][] getBeverages() {
        return beverages;
    }

    /**
     *
     * @param beverages
     */
    public void setBeverages(Beverage[][] beverages) {
        this.beverages = beverages;
    }
    
    /**
     *
     * @return
     */
    public double totalBeveragePrice() {
        double total = 0;
        for (int i = 0; i < beverages.length; i++) {
            for (int j = 0; j < beverages.length; j++) {
                total += beverages[i][j].getPrice();
            }
        }
        return total;
    }

    /**
     *
     * @param brand
     * @return
     */
    public double priceByBrand(String brand) {
        double total = 0;
        for (int i = 0; i < beverages.length; i++) {
            for (int j = 0; j < beverages.length; j++) {
                if (beverages[i][j].getBrand().equalsIgnoreCase(brand)) {
                    total = total + beverages[i][j].getPrice();
                }
            }
        }

        return total;
    }

    /**
     *
     * @param rack
     * @return
     */
    public double priceByRack( int rack) {
        double total = 0;
        for (int i = 0; i < beverages.length; i++) {
            for (int j = 0; j < beverages.length; j++) {
                if (j == rack) {
                    total += beverages[i][j].getPrice();
                }
            }
        }
        return total;
    }

    /**
     *
     * @param beverage
     */
    public void addProduct( Beverage beverage) {
        for (int i = 0; i < beverages.length; i++) {
            for (int j = 0; j < beverages.length; j++) {
                if (beverages[i][j] == null) {
                    beverages[i][j] = beverage;
                }
            }
        }
    }

    /**
     *
     * @param beverage
     * @param row
     * @param column
     */
    public void addProductByPlace( Beverage beverage,Integer row, Integer column) {
        beverages[row][column] = beverage;
    }

    /**
     *
     * @param id
     */
    public void deleteProduct( int id) {
        for (int i = 0; i < beverages.length; i++) {
            for (int j = 0; j < beverages.length; j++) {

                if (id == beverages[i][j].getId()) {
                    beverages[i][j] = null;
                }
            }
        }
    }

    /**
     *
     * @param id
     */
    public void showStock(int id) {
        
        for (int i = 0; i < beverages.length; i++) {
            for (int j = 0; j < beverages.length; j++) {
                if (beverages[i][j].getId()==id) {
                    System.out.println(beverages[i][j].toString());
                }
            }
        }
    }

}
