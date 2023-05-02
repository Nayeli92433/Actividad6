public class OperacionesPalabra {
    public void contarLetraEnPalabra(String palabra, String caracter){
            int cantidadCaracter= 0;

            for(int i = 0; i < palabra.length(); ++i) {
                char letra = palabra.charAt(i);
                char cantCracter = caracter.charAt(0);
                if (letra == cantCracter) {
                    cantidadCaracter++;
                }
            }
            System.out.println("En la palabra "+ palabra+" hay "+cantidadCaracter+ " veces el caracter " +"'"+caracter +"'");
        }
    public void extraerPartePalabra(String palabra, int inicio, int fin) {
        char[] extraer = new char[fin-inicio];

        for(int i = 0; i < extraer.length; ++i) {
            extraer[i] = palabra.charAt(i + 1);
        }

        String parteExtraer = new String(extraer);
        System.out.println("La parte extraida es  " + parteExtraer);
    }
    public void palabraAlRevez(String palabra) {
        String palabraAlReves = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            char letra = palabra.charAt(i);
            palabraAlReves += letra;

    }
        System.out.println("La palabra '" + palabra +"' al revez es: " +palabraAlReves);

    }


}


