package com.pizza.store;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.pizza.model.Pizza;
import com.pizza.model.PizzaSize;

public class PizzaStoreMapImpl implements PizzaStore {
    private Map<String, Pizza> pizzas = new HashMap();
    private static int pizzaCount;

    static {
        pizzaCount = 0;
    }

    public PizzaStoreMapImpl() {}

    @Override
    public void createPizza(Pizza pizza) throws IllegalArgumentException {
        pizzas.put(pizza.getPizzaId(), pizza);
    }

    @Override
    public Pizza readPizzaByName(String pizzaName) throws IllegalArgumentException {
        Pizza pizza = pizzas.values().stream().filter(p -> p.getPizzaName().equals(pizzaName)).findFirst().orElse(null);
        if (pizza != null) {
            return pizza;
        }
        throw new IllegalArgumentException("Pizza not found");
    }

    @Override
    public void updatePizza(Pizza pizza) throws IllegalArgumentException {
        if (pizzas.containsKey(pizza.getPizzaId())) {
            pizzas.put(pizza.getPizzaId(), pizza);
            return;
        }
        throw new IllegalArgumentException("Pizza not found");
    }

    @Override
    public void deletePizza(String pizzaId) throws IllegalArgumentException {
        if (pizzas.containsKey(pizzaId)) {
            pizzas.remove(pizzaId);
            return;
        }
        throw new IllegalArgumentException("Pizza not found");
    }

    @Override
    public Pizza[] readAllPizzas() throws IllegalArgumentException {
        return pizzas.values().toArray(new Pizza[0]);
    }

    @Override
    public Pizza[] readPizzasCountBySize(PizzaSize pizzaSize) throws IllegalArgumentException {
        Collection<Pizza> pizzasBySize = new ArrayList<>();
        for (Pizza pizza : pizzas.values()) {
            if (pizza.getPizzaSize().equals(pizzaSize)) {
                pizzasBySize.add(pizza);
            }
        }
        return pizzasBySize.toArray(new Pizza[0]);
    }
}
