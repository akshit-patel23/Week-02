package com.hybridinheritance.RestaurantSystem;

class Chef extends Person implements Worker {
    String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println(name + " is cooking dishes specializing in " + specialty);
    }
}
