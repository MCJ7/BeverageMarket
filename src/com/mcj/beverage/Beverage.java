package com.mcj.beverage;

/**
 *
 * @author maxco
 */
public class Beverage {
    
    /**
     *
     */
    protected int id;

    /**
     *
     */
    protected double liter,

    /**
     *
     */
    price;

    /**
     *
     */
    protected String brand;

    /**
     *
     */
    private static int iD;

    /**
     *
     */
    public Beverage() {
    }

    /**
     *
     * @param liter
     * @param price
     * @param brand
     */
    public Beverage( double liter, double price, String brand) {
        this.id = iD++;
        this.liter = liter;
        this.price = price;
        this.brand = brand;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
   
    /**
     *
     * @return
     */
    public double getLiter() {
        return liter;
    }

    /**
     *
     * @param liter
     */
    public void setLiter(double liter) {
        this.liter = liter;
    }

    /**
     *
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *
     * @return
     */
    public String getBrand() {
        return brand;
    }

    /**
     *
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }   

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Beverage{id=").append(id);
        sb.append(", liter=").append(liter);
        sb.append(", price=").append(price);
        sb.append(", brand=").append(brand);
        sb.append('}');
        return sb.toString();
    }

    
}
