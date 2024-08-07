package com.pizza.store;

import java.util.ArrayList;
import java.util.Collection;

import com.pizza.model.Pizza;
import com.pizza.model.PizzaSize;

public class PizzaStoreListImpl implements PizzaStore {
    private Collection<Pizza> pizzas = new ArrayList<>();
    private static int pizzaCount;

    static {
        pizzaCount = 0;
    }

    public PizzaStoreListImpl() {}

    @Override
    public void createPizza(Pizza pizza) throws IllegalArgumentException {
        pizzas.add(pizza);
    }

    @Override
    public Pizza readPizzaByName(String pizzaName) throws IllegalArgumentException {
        for (Pizza pizza : pizzas) {
            if (pizza.getPizzaName().equals(pizzaName)) {
                return pizza;
            }
        }
        throw new IllegalArgumentException("Pizza not found");
    }

    @Override
    public void updatePizza(Pizza pizza) throws IllegalArgumentException {
        for (Pizza p : pizzas) {
            if (p.getPizzaId().equals(pizza.getPizzaId())) {
                p = pizza;
                return;
            }
        }
        throw new IllegalArgumentException("Pizza not found");
    }

    @Override
    public void deletePizza(String pizzaId) throws IllegalArgumentException {
        for (Pizza p : pizzas) {
            if (p.getPizzaId().equals(pizzaId)) {
                pizzas.remove(p);
                return;
            }
        }
        throw new IllegalArgumentException("Pizza not found");
    }

    @Override
    public Pizza[] readAllPizzas() throws IllegalArgumentException {
        return pizzas.toArray(new Pizza[0]);
    }

    @Override
    public Pizza[] readPizzasCountBySize(PizzaSize pizzaSize) throws IllegalArgumentException {
        Collection<Pizza> pizzasBySize = new ArrayList<>();
        for (Pizza pizza : pizzas) {
            if (pizza.getPizzaSize().equals(pizzaSize)) {
                pizzasBySize.add(pizza);
            }
        }
        return pizzasBySize.toArray(new Pizza[0]);
    }
}
