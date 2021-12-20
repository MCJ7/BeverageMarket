/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcj.services;

import com.mcj.beverage.*;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author maxco
 */
public class Service {

    /**
     *
     */
    private Scanner sc;
   
    /**
     *
     */
    private BeverageRack store;

    /**
     *
     */
    public Service() {
       sc = new Scanner(System.in).useLocale(Locale.US);
       store = new BeverageRack(3,3);
    }

    /**
     *
     * @return
     */
    public int menu() {
        int option = 0;
        System.out.println("------------------------------------------------------------");

        System.out.println("Menu"
                + "\n1.Total price"
                + "\n2.Total price by beverage"
                + "\n3.Total price by rack"
                + "\n4.Add product"
                + "\n5.Delete product"
                + "\n6.Show information"
                + "\n7.Exit");
       boolean capture=false;
        do { 
            System.out.println("Choose a option:");
        
            if (sc.hasNextInt()) {
                 option = sc.nextInt(); 
                capture=true;
            }else {
                sc.next();
               System.out.println("The option is not a number");
                
            }
        } while (!capture);
        System.out.println("------------------------------------------------------------");

        return option;
    }

    /**
     *
     */
    public void fillRack() {

        store.addProduct(new Soda(2.0, 150.20, true, 20.5, "Fanta"));
        store.addProduct(new Soda(2.0, 150.20, true, 20.5, "Fanta"));
        store.addProduct(new Water("Manantial", 1.5, 70, "Villavicencio"));
        store.addProduct(new Water("Montaña", 2.25, 70, "Eco de los Andes"));
        store.addProduct(new Soda(3.2, 150.20, false, 20.5, "Coca Cola"));
        store.addProduct(new Water("Surgente", 1.5, 70, "Sierra de los Padres"));
        store.addProduct(new Soda(1.5, 150.20, true, 20.5, "Pepsi"));
        store.addProduct(new Soda(2.0, 150.20, false, 20.5, "Mirinda"));
        store.addProduct(new Water("Manantial", 1.5, 70, "Glaciar"));
        
    }

    /**
     *
     */
    public void totalPrice() {
        System.out.println(store.totalBeveragePrice());
    }

    /**
     *
     */
    public void rackPrice() {
        System.out.println("Number of the rack: ");
        int drink = sc.nextInt();
        System.out.println(store.priceByRack( drink));
    }

    /**
     *
     */
    public void brandPrice() {
        System.out.println("Brand");
        String drink = sc.next();
        System.out.println(store.priceByBrand(drink));
    }

    /**
     *
     */
    public void productDelete() {
        System.out.println("Id of the product to delete");
        int drink = sc.nextInt();
        store.deleteProduct( drink);
    }

    /**
     *
     */
    public void showProduct() {
        System.out.println("Id of the product to need information");
        int drink = sc.nextInt();
        store.showStock( drink);
    }

    /**
     *
     */
    public void addProduct() {
        System.out.println("Select: 1.Water 2.Soda");
        int optionBeverage = sc.nextInt();
        System.out.println("Liters:");
        double liter = sc.nextDouble();
        System.out.println("Price:");
        double price = sc.nextDouble();
        System.out.println("Brand:");
        String brand = sc.next();

        if (optionBeverage == 2) {

            System.out.println("Discount: ");
            boolean discount = sc.nextBoolean();
            System.out.println("sugar: ");
            double sugar = sc.nextDouble();

            store.addProductByPlace(new Soda(liter, price, discount, sugar, brand),0,2);
        } else {
            System.out.println("Origin:");
            String origen = sc.next();
            store.addProductByPlace(new Water(origen, liter, price, brand),0,1);
        }

    }

}
