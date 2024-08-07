package com.pizza.store;

import com.pizza.model.Pizza;
import com.pizza.model.PizzaSize;

public class PizzaStoreImpl implements PizzaStore {
    private static Pizza[] pizzas;
    private static int pizzaCount;

    static {
        PizzaStoreImpl.pizzas = new Pizza[10];
        PizzaStoreImpl.pizzaCount = 0;
    }

    public PizzaStoreImpl() {}

    @Override
    public void createPizza(Pizza pizza) throws IllegalArgumentException {
        if (pizzaCount < pizzas.length) {
            pizzas[pizzaCount++] = pizza;
        } else {
            throw new IllegalArgumentException("Pizza store is full");
        }
    }

    @Override
    public Pizza readPizzaByName(String pizzaName) throws IllegalArgumentException {
        for (int i = 0; i < pizzaCount; i++) {
            if (pizzas[i].getPizzaId().equals(pizzaName)) {
                return pizzas[i];
            }
        }
        throw new IllegalArgumentException("Pizza not found");
    }

    @Override
    public void updatePizza(Pizza pizza) throws IllegalArgumentException {
        for (int i = 0; i < pizzaCount; i++) {
            if (pizzas[i].getPizzaId().equals(pizza.getPizzaId())) {
                pizzas[i] = pizza;
                return;
            }
        }
        throw new IllegalArgumentException("Pizza not found");
    }

    @Override
    public void deletePizza(String pizzaId) throws IllegalArgumentException {
        for (int i = 0; i < pizzaCount; i++) {
            if (pizzas[i].getPizzaId().equals(pizzaId)) {
                for (int j = i; j < pizzaCount - 1; j++) {
                    pizzas[j] = pizzas[j + 1];
                }
                pizzas[--pizzaCount] = null;
                return;
            }
        }
        throw new IllegalArgumentException("Pizza not found");
    }

    @Override
    public Pizza[] readAllPizzas() throws IllegalArgumentException {
        Pizza[] allPizzas = new Pizza[pizzaCount];
        for (int i = 0; i < pizzaCount; i++) {
            allPizzas[i] = pizzas[i];
        }
        return allPizzas;
    }

    @Override
    public Pizza[] readPizzasCountBySize(PizzaSize pizzaSize) throws IllegalArgumentException {
        int count = 0;
        for (int i = 0; i < pizzaCount; i++) {
            if (pizzas[i].getPizzaSize().equals(pizzaSize)) {
                count++;
            }
        }
        Pizza[] pizzasBySize = new Pizza[count];
        for (int i = 0, j = 0; i < pizzaCount; i++) {
            if (pizzas[i].getPizzaSize().equals(pizzaSize)) {
                pizzasBySize[j++] = pizzas[i];
            }
        }
        return pizzasBySize;
    }
    
}
