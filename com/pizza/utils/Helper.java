package com.pizza.utils;

import java.util.Scanner;

import com.pizza.model.Pizza;
import com.pizza.model.PizzaSize;

public class Helper {
    private final Scanner sc;

    public Helper() {
        sc = new Scanner(System.in);
    }

    public String getPizzaId(){
        System.out.print("Enter the ID of the pizza: ");
        return sc.next();
    }

    public String getPizzaName(){
        System.out.print("Enter the name of the pizza: ");
        return sc.next();
    }
    public String getPizzaDescription(){
        System.out.print("Enter the description of the pizza: ");
        return sc.next();
    }
    public PizzaSize getPizzaSize(){
        System.out.print("Select pizza size: \n1. Small 16cm\n2. Medium 18cm\n3. Large 20cm\nEnter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                return PizzaSize.SMALL_16CM;
            case 2:
                return PizzaSize.MEDIUM_18CM;
            case 3:
                return PizzaSize.LARGE_20CM;
            default:
                return null;
        }
    }
    public String[] getPizzaIngredients(){
        System.out.print("Enter the ingredients of the pizza (enter comma seprated values): ");
        String ingredients = sc.next();
        return ingredients.split(",");
    }
    public double getPizzaWeight(){
        System.out.print("Enter the weight of the pizza: ");
        return sc.nextDouble();
    }
    public double getPizzaPrice(){
        System.out.print("Enter the price of the pizza: ");
        return sc.nextDouble();
    }
    public Pizza getNewPizzaFromUser(){
        return new Pizza(getPizzaName(), getPizzaDescription(), getPizzaSize(), getPizzaIngredients(), getPizzaWeight(), getPizzaPrice());
    }

    @Override
    protected void finalize() throws Throwable {
        sc.close();
    }
}