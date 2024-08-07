package com.pizza.factory;

import com.pizza.store.PizzaStore;
import com.pizza.store.PizzaStoreImpl;
import com.pizza.store.PizzaStoreListImpl;
import com.pizza.store.PizzaStoreMapImpl;
import com.pizza.store.PizzaStoreSortedImpl;

public class PizzaStoreFactory {
    
    private static PizzaStore pizzaStore = null;

    private static PizzaStoreFactory instance = null;

    public PizzaStoreFactory() {}

    public static PizzaStoreFactory getInstance() {
        if (instance == null) {
            instance = new PizzaStoreFactory();
        }
        return instance;
    }

    public PizzaStore createPizzaStore(int storeType) {
        if(storeType == 1) pizzaStore = new PizzaStoreImpl();
        else if(storeType == 2) pizzaStore = new PizzaStoreListImpl();
        else if(storeType == 3) pizzaStore = new PizzaStoreSortedImpl();
        else if(storeType == 4) pizzaStore = new PizzaStoreMapImpl();
        return pizzaStore;
    }
}
