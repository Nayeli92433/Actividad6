public class CantidadLetras {
    public void contarLetras(String palabra){
        char letra;
        int cantMayuscula= 0, cantMinuscula=0;

        for (int i = 0; i < palabra.length(); i++) {
            letra = palabra.charAt(i);
            if (letra >= 97 && letra <= 122) {
                cantMinuscula ++;
            } else if (letra >= 65 && letra <= 90) {
                cantMayuscula ++;
            }
        }
        System.out.println("Letras mayusculas: " + cantMayuscula + "\nLetras minusculas "+ cantMinuscula);
    }
    public void contarLetrasMinusculas(String palabra){
        char letra;
        int cantMinuscula=0;

        for (int i = 0; i < palabra.length(); i++) {
            letra = palabra.charAt(i);
            if (letra >= 97 && letra <= 122) {
                cantMinuscula ++;
            }

        }
        System.out.println("Letras minusculas "+ cantMinuscula);
    }



}