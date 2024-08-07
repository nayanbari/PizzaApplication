package com.pizza.view;

import java.util.Scanner;

import com.pizza.factory.PizzaStoreFactory;
import com.pizza.model.Pizza;
import com.pizza.model.PizzaSize;
import com.pizza.service.PizzaServiceImpl;
import com.pizza.store.PizzaStore;
import com.pizza.utils.Helper;

public class PizzaUI {
    private static PizzaServiceImpl service = null;

    static { service = new PizzaServiceImpl(); }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Helper helper = new Helper();

        System.out.println("Select the storage option\n1. Array\n2. List\n3. Sorted\n4. Map");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        PizzaStore store = PizzaStoreFactory.getInstance().createPizzaStore(choice);
        service.setPizzaStore(store);

        int option = -1;
        do {
            System.out.println("Select the operation\n1. Add Pizza\n2. Find Pizza by ID\n3. Edit Pizza\n4. Remove Pizza\n5. Find All Pizza by Size\n6. Find All Pizzas\n7. Exit");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    Pizza pizza = helper.getNewPizzaFromUser();
                    try {
                        service.addNewPizza(pizza);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter the pizza name: ");
                    String pizzaName = sc.next();
                    try {
                        service.getPizzaByName(pizzaName);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    pizza = helper.getNewPizzaFromUser();
                    try {
                        service.editPizza(pizza);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter the pizza ID: ");
                    String pizzaId = sc.next();
                    try {
                        service.removePizza(pizzaId);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        PizzaSize size = helper.getPizzaSize();
                        Pizza[] pizzas = service.getPizzasBySize(size);
                        for(Pizza p : pizzas) {
                            System.out.println(p);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        Pizza[] pizzas = service.getAllPizzas();
                        for(Pizza p : pizzas) {
                            System.out.println(p);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (option != 7);


        sc.close();
    }
}
