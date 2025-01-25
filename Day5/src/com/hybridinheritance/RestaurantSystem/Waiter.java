package com.hybridinheritance.RestaurantSystem;

class Waiter extends Person implements Worker {
    String section;

    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    public void performDuties() {
        System.out.println(name + " is serving food in the " + section + " section.");
    }
}
