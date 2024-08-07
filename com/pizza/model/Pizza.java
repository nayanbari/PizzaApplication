package com.pizza.model;

import java.util.Date;

public class Pizza implements Comparable<Pizza> {
    private String pizzaId;
    private String pizzaName;
    private String pizzaDescription;
    private PizzaSize pizzaSize;
    private String[] pizzaIngredients;
    private double pizzaWeight;
    private double pizzaPrice;
    private Date insertionDate;

    private static int pizzaCount = 0;

    public Pizza(){}
    public Pizza(String pizzaName, String pizzaDescription, PizzaSize pizzaSize, String[] pizzaIngredients, double pizzaWeight, double pizzaPrice) {
        this.pizzaId = "100" + (char) (97 + pizzaCount % 10) + ++pizzaCount;
        this.pizzaName = pizzaName;
        this.pizzaDescription = pizzaDescription;
        this.pizzaSize = pizzaSize;
        this.pizzaIngredients = pizzaIngredients;
        this.pizzaWeight = pizzaWeight;
        this.pizzaPrice = pizzaPrice;
        this.insertionDate = new Date();
    }
    public Pizza(String pizzaId, String pizzaName, String pizzaDescription, PizzaSize pizzaSize, String[] pizzaIngredients, double pizzaWeight, double pizzaPrice) {
        this.pizzaName = pizzaName;
        this.pizzaDescription = pizzaDescription;
        this.pizzaSize = pizzaSize;
        this.pizzaIngredients = pizzaIngredients;
        this.pizzaWeight = pizzaWeight;
        this.pizzaPrice = pizzaPrice;
    }
    
    // Getter and Setter methods
    public String getPizzaId() {
        return pizzaId;
    }
    public void setPizzaId(String pizzaId) {
        this.pizzaId = pizzaId;
    }
    public String getPizzaName() {
        return pizzaName;
    }
    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }
    public String getPizzaDescription() {
        return pizzaDescription;
    }
    public void setPizzaDescription(String pizzaDescription) {
        this.pizzaDescription = pizzaDescription;
    }
    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }
    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }
    public String[] getPizzaIngredients() {
        return pizzaIngredients;
    }
    public void setPizzaIngredients(String[] pizzaIngredients) {
        this.pizzaIngredients = pizzaIngredients;
    }
    public double getPizzaWeight() {
        return pizzaWeight;
    }
    public void setPizzaWeight(double pizzaWeight) {
        this.pizzaWeight = pizzaWeight;
    }
    public double getPizzaPrice() {
        return pizzaPrice;
    }
    public void setPizzaPrice(double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }
    public Date getInsertionDate() {
        return insertionDate;
    }

    // for internal use
    public static int getPizzaCount() {
        return pizzaCount;
    }
    public static void setPizzaCount(int pizzaCount) {
        Pizza.pizzaCount = pizzaCount;
    }

    // toString method
    @Override
    public String toString() {
        return "Pizza {pizzaId=" + pizzaId + ", pizzaName=" + pizzaName + ", pizzaDescription=" + pizzaDescription
                + ", pizzaSize=" + pizzaSize + ", pizzaIngredients=" + pizzaIngredients + ", pizzaWeight=" + pizzaWeight
                + ", pizzaPrice=" + pizzaPrice + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pizzaId == null) ? 0 : pizzaId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pizza other = (Pizza) obj;
        if (pizzaId == null) {
            if (other.pizzaId != null)
                return false;
        } else if (!pizzaId.equals(other.pizzaId))
            return false;
        return true;
    }

    @Override
    public int compareTo(Pizza o) {
        return this.pizzaName.compareTo(o.pizzaName);
    }
}
