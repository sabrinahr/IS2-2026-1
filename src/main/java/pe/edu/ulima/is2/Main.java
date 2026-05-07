package pe.edu.ulima.is2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola IS2");
        SerHumano serHumano = new SerHumano("Juan", 30, "12345678");
        System.out.println("Nombre: " + serHumano.getNombre());
        System.out.println("Edad: " + serHumano.getEdad());
        System.out.println("DNI: " + serHumano.getDni());
    }
}