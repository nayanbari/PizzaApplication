package com.pizza.store;

import com.pizza.model.Pizza;
import com.pizza.model.PizzaSize;

public interface PizzaStore {
    // CRUD operations
    public void createPizza(Pizza pizza) throws IllegalArgumentException;
    public Pizza readPizzaByName(String pizzaName) throws IllegalArgumentException;
    public void updatePizza(Pizza pizza) throws IllegalArgumentException;
    public void deletePizza(String pizzaId) throws IllegalArgumentException;
    public Pizza[] readAllPizzas() throws IllegalArgumentException;
    public Pizza[] readPizzasCountBySize(PizzaSize pizzaSize) throws IllegalArgumentException;
}