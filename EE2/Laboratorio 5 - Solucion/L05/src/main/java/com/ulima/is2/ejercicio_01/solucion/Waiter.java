package com.ulima.is2.ejercicio_01.solucion;

public class Waiter {
private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    // El mesero solo "presiona el botón" de ejecutar
    public void executeOrder() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No hay ninguna orden asignada.");
        }
    }
}
