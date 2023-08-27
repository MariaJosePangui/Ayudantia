package com.example.ayudantia;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Programa {
    private List<Vehiculo> vehiculos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. Crear vehículo");
        System.out.println("2. Ver vehículos");
        System.out.println("3. Salir");
    }

    public void ejecutar() {
        int opcion;

        while (true) {
            mostrarMenu();
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después del número

            switch (opcion) {
                case 1:
                    crearVehiculo();
                    break;
                case 2:
                    verVehiculos();
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    return; // Salir del bucle y finalizar el programa
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private void crearVehiculo() {
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese la cantidad de ruedas del vehículo: ");
        int ruedas = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después del número

        Vehiculo nuevoVehiculo;
        if (ruedas == 2) {
            System.out.print("Ingrese el color de la motocicleta: ");
            String color = scanner.nextLine();
            nuevoVehiculo = new Motocicleta(marca, modelo, color);
        } else if (ruedas == 4) {
            System.out.print("Ingrese la cantidad de ventanas del auto: ");
            int ventanas = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después del número
            nuevoVehiculo = new Auto(marca, modelo, ventanas);
        } else {
            System.out.println("Cantidad de ruedas no válida.");
            return;
        }

        vehiculos.add(nuevoVehiculo);
        System.out.println("Vehículo creado con éxito.");
    }

    private void verVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
            return;
        }

        System.out.println("Lista de vehículos:");
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo vehiculo = vehiculos.get(i);
            if (vehiculo instanceof Motocicleta) {
                System.out.println("Vehículo " + (i + 1) + ": Tipo: Motocicleta, " + vehiculo);
            } else if (vehiculo instanceof Auto) {
                System.out.println("Vehículo " + (i + 1) + ": Tipo: Auto, " + vehiculo);
            }
        }
    }
}