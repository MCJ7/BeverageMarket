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
public class Soda extends Beverage {

    /**
     *
     */
    private double sugar;

    /**
     *
     */
    private boolean discount;

    /**
     *
     */
    public Soda() {
    }

    /**
     *
     * @param azucar
     * @param discount
     */
    public Soda(double azucar, boolean discount) {
        this.sugar = azucar;
        this.discount = discount;
    }

    /**
     *
     * @param liter
     * @param price
     * @param discount
     * @param sugar
     * @param brand
     */
    public Soda(double liter, double price, boolean discount, double sugar, String brand) {
        super(liter, price, brand);
        this.sugar = sugar;
        this.discount = discount;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Soda{sugar=").append(sugar);
        sb.append(", discount=").append(discount);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }



}
