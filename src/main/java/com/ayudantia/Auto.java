package com.ayudantia;
class Auto extends Vehiculo {
    private int ventanas;

    public Auto(String marca, String modelo, int ventanas) {
        super(marca, modelo);
        this.ventanas = ventanas;
    }

    public String toString() {
        return super.toString() + ", Ventanas: " + ventanas;
    }
}