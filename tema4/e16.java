public class e16 {
    public static void main(String[] args){
        int puntos = 0;
        System.out.println("-------------------------");
        System.out.println("---TEST DE INFIDELIDAD---");
        System.out.println("-------------------------");
        System.out.println(" ");
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        System.out.println("a) Sí");
        System.out.println("b) No");
        String res = System.console().readLine();
        if (res.equals("a") || res.equals("Sí")) {
            puntos = puntos + 3;
        }
        System.out.println("2. Ha aumentado sus gastos de vestuario");
        System.out.println("a) Sí");
        System.out.println("b) No");
        res = System.console().readLine();
        if (res.equals("a") || res.equals("Sí")) {
            puntos = puntos + 3;
        }
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
        System.out.println("a) Sí");
        System.out.println("b) No");
        res = System.console().readLine();
        if (res.equals("a") || res.equals("Sí")) {
            puntos = puntos + 3;
        }
        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        System.out.println("a) Sí");
        System.out.println("b) No");
        res = System.console().readLine();
        if (res.equals("a") || res.equals("Sí")) {
            puntos = puntos + 3;
        }
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
        System.out.println("a) Sí");
        System.out.println("b) No");
        res = System.console().readLine();
        if (res.equals("b") || res.equals("No")) {
            puntos = puntos + 3;
        }
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        System.out.println("a) Sí");
        System.out.println("b) No");
        res = System.console().readLine();
        if (res.equals("a") || res.equals("Sí")){
            puntos = puntos + 3;
        }
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        System.out.println("a) Sí");
        System.out.println("b) No");
        res = System.console().readLine();
        if (res.equals("a") || res.equals("Sí")){
            puntos = puntos + 3;
        }
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        System.out.println("a) Sí");
        System.out.println("b) No");
        res = System.console().readLine();
        if (res.equals("a") || res.equals("Sí")){
            puntos = puntos + 3;
        }
        System.out.println("9. Has notado que últimamente se perfuma más");
        System.out.println("a) Sí");
        System.out.println("b) No");
        res = System.console().readLine();
        if (res.equals("a") || res.equals("Sí")){
            puntos = puntos + 3;
        }
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        System.out.println("a) Sí");
        System.out.println("b) No");
        res = System.console().readLine();
        if (res.equals("a") || res.equals("Sí")){
            puntos = puntos + 3;
        }

        if (puntos>=21){
            System.out.println("Tu pareja te está siendo infiel");
        }
        if (puntos>=15){
            System.out.println("Tu pareja puede estar siendote infiel");
        }
        if (puntos<=12){
            System.out.println("Tu pareja no te está siendo infiel");
        }
    }
}