public class GatoSimple {
    // atributos
    String color, raza, sexo;
    int edad;
    double peso;

    // metodos /////////////////
    // constructor
    GatoSimple (String s){
        this.sexo = s;
    }

    // getter
    String getSexo(){
        return this.sexo;
    }

    // maulla
    void maulla(){
        System.out.println("Miau");
    }

    // ronroneo
    void ronronea(){
        System.out.println("mrrr");
    }

    // gato solo come pescado
    void come(String comida){
        if (comida.equals("pescado")){
            System.out.println("Hmmm, gracias");
        } else {
            System.out.println("Lo siento, solo como pescado");
        }
    }

    // pelea de gatos
    void peleaCon(GatoSimple contrincante){
        if (this.sexo.equals("hembra")){
            System.out.println("no me gusta pelear");
        } else {
            if (contrincante.getSexo().equals("hembra")){
                System.out.println("no peleo contra gatitas");
            } else {
                System.out.println("Te vas a enterar");
            }
        }
    }

}