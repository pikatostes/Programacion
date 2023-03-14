public class Ej01to10 {

    // ---contador espacios---
    public static int numeroEspacios(String x){
        int numeroEspacios = 0;
        // bucle recorre string
        for (int i = 0; i < x.length(); i++){
            // si encuentra espacio, suma
            if(x.charAt(i)== ' '){
                numeroEspacios = numeroEspacios+1;
            }
        }
        System.out.println(numeroEspacios);
        return numeroEspacios;
    }

    // ---contador vocales---
    public static int numeroVocales(String y){
        int longi = y.length();
        char x[] = y.toCharArray();
        int vocales = 0;
        // recorre string
        for(int i = 0; i < longi; i++){
            // si encuentra vocales, suma
            if (x[i] == 'a' || x[i] == 'e' || x[i] == 'i' || x[i] == 'o' || x[i] == 'u' || x[i] == 'A' || x[i] == 'E' || x[i] == 'I' || x[i] == 'O' || x[i] == 'U'){
                vocales++;
            }
        }
        return vocales;
    }

    // palindromo
    public static boolean esPalindromo(String x){
        // cambia los caracteres a minusculas y a los que me interesan
        String y = x.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
        // invierte la cadena
        String inversa = new StringBuilder(x).reverse().toString();
        return inversa.equals(x);
    }

    // contiene
    public static boolean contiene(String x, char y){
        int longi= x.length();
        // bucle recorre el array en busca del caracter
        for(int i = 0; i < longi; i++){
            if(x.charAt(i) == y){
                return true;
            }
        }
        return false;
    }

    // repeticion caracter

    public static String repiteCaracter(char x, int y){

        String repiteCaracter = " ";
        repiteCaracter = repiteCaracter.valueOf(x);
        repiteCaracter = repiteCaracter.repeat(y);

        return repiteCaracter;
    }

    // padding left

    public static String padLeft(String x, int longi){
        String padLeft = "";
        char cadenaEspacios[] = new char[longi];
        cadenaEspacios[0]=' ';
        for(int i = 0; i < longi/2; i++){
            cadenaEspacios[i]= ' ';
        }
        padLeft = padLeft.valueOf(cadenaEspacios) + x;
        return padLeft;
    }

    // padding right

    public static String padRight(String x, int longi){
        String padRight = "";
        char cadenaEspacios[] = new char[longi];
        for(int i = x.length(); i < longi; i++){
            cadenaEspacios[i] = ' ';
        }
        padRight = x + padRight.valueOf(cadenaEspacios);
        return padRight;
    }


    // quita espacios
    public static String quitaEspacios(String x) {
        x= x.trim();
        // maximo de 100 char
        char quitaEspacio[] = new char[100];
        quitaEspacio[0] = ' ';
        String quitaEspacios = "";
        char y[] = x.toCharArray();
        int j = 0;
        for(int i = 0; i< x.length(); i++){
            if(y[i] != ' '){
                quitaEspacio[j] = y[i];
                j++;
            }
        }
        quitaEspacios = quitaEspacios.valueOf(quitaEspacio);
        return quitaEspacios;
    }

    // quita espacios tri

    public static String quitaEspaciosTrim(String x) {

        String quitaEspaciosTrim = x.replace(" ", "");

        return quitaEspaciosTrim;




    }


    // sustituye

    public static String sustituyeCaracter(String x, char a, char b) {
        // sustituye caracter por otro
        return x.replace(a, b);
    }

    // contador palabras

    public static int cuentaPalabras(String x) {
        int contador = 1, pos;
        x = x.trim();
        if(x.isEmpty()){
            contador = 0;
        }
        else{
            pos = x.indexOf(" ");
            while(pos !=-1){
                contador++;
                pos = x.indexOf(" ", pos + 1);
            }
        }
        return contador;
    }

}