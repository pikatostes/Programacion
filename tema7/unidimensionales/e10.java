public class e10 {
    public static void main(String[] args){
        int[] num = new int[20];
        for (int i = 0; i < num.length; i++){
            num[i] = (int)(Math.random()*101);
        }
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();

        int[] aux = new int[20];
        int contAux = 0;
        for (int i = 0; i < num.length; i++){
            if (num[i]%2 != 0){
                aux[contAux] = num[i];
                num[i] = -1;
                contAux++;
            }
        }

        for (int i = 0; i < num.length; i++){
            if (num[i] != -1){
                int trash = num[i];
                for (int j = 0; j < i ; j++){
                    if (num[i-j-1] == -1){
                        num[i-j-1] = trash;
                        num[i-j] = -1;
                    }
                }
            }
        }

        int j = 0;
        for (int i = 0; i < num.length; i++){
            if (num[i] == -1){
                num[i] = aux[j];
                j++;
            }
        }

        for (int i = 0; i < num.length; i++){
            System.out.print(num[i]+" ");
        }
    }
}