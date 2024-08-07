package com.pizza.service;

import com.pizza.exceptions.NoPizzaFoundException;
import com.pizza.exceptions.PizzaAlreadyExistException;
import com.pizza.model.Pizza;
import com.pizza.model.PizzaSize;
import com.pizza.store.PizzaStore;

public class PizzaServiceImpl implements PizzaService {

    private static PizzaStore pizzaStore = null;

    public void setPizzaStore(PizzaStore pizzaStore) {
        this.pizzaStore = pizzaStore;
    }

    @Override
    public void addNewPizza(Pizza pizza) throws PizzaAlreadyExistException {
        try {
            pizzaStore.createPizza(pizza);
        } catch (IllegalArgumentException e) {
            throw new PizzaAlreadyExistException("Pizza already exists", e);
        }
    }

    @Override
    public Pizza getPizzaByName(String pizzaName) throws NoPizzaFoundException {
        try {
            return pizzaStore.readPizzaByName(pizzaName);
        } catch (IllegalArgumentException e) {
            throw new NoPizzaFoundException("Pizza not found", e);
        }
    }

    @Override
    public void editPizza(Pizza pizza) throws NoPizzaFoundException {
        try {
            pizzaStore.updatePizza(pizza);
        } catch (IllegalArgumentException e) {
            throw new NoPizzaFoundException("Pizza not found", e);
        }
    }

    @Override
    public void removePizza(String pizzaId) throws NoPizzaFoundException {
        try {
            pizzaStore.deletePizza(pizzaId);
        } catch (IllegalArgumentException e) {
            throw new NoPizzaFoundException("Pizza not found", e);
        }
    }

    @Override
    public Pizza[] getAllPizzas() throws NoPizzaFoundException {
        try {
            return pizzaStore.readAllPizzas();
        } catch (IllegalArgumentException e) {
            throw new NoPizzaFoundException("No pizzas found", e);
        }
    }

    @Override
    public Pizza[] getPizzasBySize(PizzaSize pizzaSize) throws NoPizzaFoundException {
        try {
            return pizzaStore.readPizzasCountBySize(pizzaSize);
        } catch (IllegalArgumentException e) {
            throw new NoPizzaFoundException("No pizzas found", e);
        }
    }
}
