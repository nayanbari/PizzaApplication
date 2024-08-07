package com.pizza.service;

import com.pizza.exceptions.NoPizzaFoundException;
import com.pizza.exceptions.PizzaAlreadyExistException;
import com.pizza.model.Pizza;
import com.pizza.model.PizzaSize;

public interface PizzaService {
    public void addNewPizza(Pizza pizza) throws PizzaAlreadyExistException;
    public Pizza getPizzaByName(String pizzaName) throws NoPizzaFoundException;
    public void editPizza(Pizza pizza) throws NoPizzaFoundException;
    public void removePizza(String pizzaId) throws NoPizzaFoundException;
    public Pizza[] getAllPizzas() throws NoPizzaFoundException;
    public Pizza[] getPizzasBySize(PizzaSize pizzaSize) throws NoPizzaFoundException;
}