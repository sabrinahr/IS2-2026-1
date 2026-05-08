package pe.edu.ulima.is2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola IS2");
        SerHumano serHumano = new SerHumano("Juan", 30, "12345678");
        System.out.println("Nombre: " + serHumano.getNombre());
        System.out.println("Edad: " + serHumano.getEdad());
        System.out.println("DNI: " + serHumano.getDni());

        Serhumano[] seresHumanos = new SerHumano[3];    
        seresHumanos[0] = null;
        seresHumanos[1] = new SerHumano("Maria", 25, "87654321");
        seresHumanos[2] = new SerHumano("Pedro", 40, "11223344");
        int[] numeros = new int[3];
        //int numero = null;
        //foreach

    }
}