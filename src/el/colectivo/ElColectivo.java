package el.colectivo;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ElColectivo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#.000");
        double personas = 0;
        double capacidad = 0;
        
        System.out.println("¿Cuantas personas caben en el bus?");
        capacidad = entrada.nextInt();
        System.out.println("¿Cuantos turistas se van a transportar?");
        personas = entrada.nextInt();
        
        int costo = (int) (10000*personas);
        int viajes = (int) Math.round(personas/capacidad);
        int person = (int) personas;
        if (viajes < 1) {
            viajes = 1;
        }
        int neto = (int) viajes*2000;
        
        System.out.println("");
        System.out.println("Respuesta:");
        System.out.println("Personas:" + person);
        System.out.println("Dinero total:" + " " + "$" + costo);
        System.out.println("Viajes:" + " " + viajes);
        System.out.println("Dinero a propietario:" + " " + neto);
    }
    
}
