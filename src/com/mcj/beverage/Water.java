/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcj.beverage;

/**
 *
 * @author maxco
 */
public class Water extends Beverage{
    
    /**
     *
     */
    private String origin;

    /**
     *
     * @param origin
     * @param liter
     * @param price
     * @param brand
     */
    public Water( String origin, double liter ,double price, String brand) {
        super( liter, price, brand);
        this.origin = origin;
    }

    /**
     *
     */
    public Water() {
    }

    /**
     *
     * @return
     */
    public String getOrigin() {
        return origin;
    }

    /**
     *
     * @param origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
  }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Water{origin=").append(origin);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
