import java.util.Scanner;

public class IngresarPalabra {
    Scanner scanner = new Scanner(System.in);
    CantidadLetras cantidadLetras= new CantidadLetras();
    OperacionesPalabra operacionesPalabra= new OperacionesPalabra();
    public void ingresar(){
        System.out.println("\nIngrese una palabra para calcular todas las operaciones ");
        String palabra= scanner.nextLine();
        cantidadLetras.contarLetras(palabra);
        System.out.println("____________________________________________________________");
        cantidadLetras.contarLetrasMinusculas(palabra);
        System.out.println("Ingrese una caracter para buscar en la palabra anterior");
        String caracter= scanner.next();
        operacionesPalabra.contarLetraEnPalabra(palabra,caracter);
        System.out.println("Desde donde desea extraer la palabra: " + palabra);
        int p = scanner.nextInt();
        System.out.println("Hasta donde desea extraer la palabra: " + palabra);
        int f = scanner.nextInt();
        operacionesPalabra.extraerPartePalabra(palabra,p,f);
        operacionesPalabra.palabraAlRevez(palabra);

    }
}
