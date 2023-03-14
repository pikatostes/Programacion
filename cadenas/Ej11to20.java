public class Ej11to20 {
    // char ch = cadena.charAt(4)
    // cadena.equals(String)
    //● cadena.equalsIgnoreCase(String)
    // cadena.compareTo(String)
    //● cadena.compareToIgnoreCase(String)
    // dividir cadena en varias
    // cadena.startsWith(char)

    // comprueba si es numero
    public static boolean esNumero(String x){
        //inicia contador
        int counter = 0;
        //recorre string
        for(int i = 0; i < x.length(); i++){
            // si encuentra un numero, suma
            if(x.charAt(i) == '0' || x.charAt(i) == '1'||x.charAt(i) == '2' || x.charAt(i) == '3' || x.charAt(i) == '4' || x.charAt(i) == '5' || x.charAt(i) == '6' || x.charAt(i) == '7' || x.charAt(i) == '8' || x.charAt(i) == '9' ){
                counter++;
            }
        }
        // si el contador equivale a la long del string, devuelve true
        if(x.length() == counter){
            return true;
        }
        // sino false
        else{
            return false;
        }
    }

    // QUITA CARACTER
    public static String quitaCaracter(String x, char a){
        x= x.replace(String.valueOf(a), "");
        return x;

    }

    // quita acentos
    public static String quitaAcentos(String x){
        // reemplaza
        return x.replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").replace("ñ", "n");
    }


    // inv cadena
    public static String invierteCadena(String x){

        StringBuilder stringBuilder = new StringBuilder(x);

        return stringBuilder.reverse().toString();
    }

    // rep caracter
    public static int vecesCaracter(String x, char a){
        char[] y = x.toCharArray();
        int vecesCaracter = 0;
        for(int i = 0; i < x.length(); i++){
            if(y[i] == a){
                vecesCaracter++;
            }
        }
        return vecesCaracter;
    }
    // rep palabra

    public static int vecesPalabra(String x, String a){
        int vecesPalabra = 0;
        for(int i = 0; i < x.length(); i++){
            if(x.substring(i).startsWith(a)){
                vecesPalabra++;
            }
        }

        return vecesPalabra;

    }

    // prim mayus
    public static String mayusculasPrimera(String x){
        char[] c = x.toCharArray();
        c[0] = Character.toUpperCase(c[0]);

        for(int i = 0; i < x.length()-2; i++){
            if(c[i] == ' ' || c[i] == '.' || c[i] == ','){
                c[i +1] = Character.toUpperCase(c[i+1]);
            }
        }
        return new String(c);

    }

    //sustituye
    public static String sustituyePalabra(String x, String a, String b){
        return x.replaceAll(a, b);

    }
    // invierte palabra
    public static String inviertePalabras(String x){
        // divide la cadena
        String[] palabras = x.split(" ");
        // recorre el string segun la longitud
        for(int i = 0; i < palabras.length;i++){
            palabras[i]= invierteCadena(palabras[i]);
        }
        String cadena = String.join(" ", palabras);
        return cadena;

    }

    // quita espacios sobrantes
    public static String quitaEspaciosSobrantes(String x){
        // quita espacios
        return x.replaceAll(" +", " ").trim();
    }
}