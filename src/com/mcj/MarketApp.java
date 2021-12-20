/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcj;

import com.mcj.services.Service;

/**
 *
 * @author maxco
 */
public class MarketApp {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Service servicio = new Service();
        int option;
        servicio.fillRack();
        do {
            option = servicio.menu();

            switch (option) {
                case 1:
                    servicio.totalPrice();
                    break;
                case 2:
                    servicio.brandPrice();
                    break;
                case 3:
                    servicio.rackPrice();
                    break;
                case 4:
                    servicio.addProduct();
                    break;
                case 5:
                    servicio.productDelete();
                    break;
                case 6:
                    servicio.showProduct();
                    break;
                case 7:
                    System.out.println("See you");
                    break;
                default:
                    System.out.println("The option is not avilable");
                    break;
            }
        } while (option != 7);

    }
}
