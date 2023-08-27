package com.example.ayudantia;
class Motocicleta extends Vehiculo {
    private String color;

    public Motocicleta(String marca, String modelo, String color) {
        super(marca, modelo);
        this.color = color;
    }

    public String toString() {
        return super.toString() + ", Color: " + color;
    }
}