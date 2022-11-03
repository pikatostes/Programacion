// Realiza un programa que pida 8 números enteros y que luego muestre esos números junto
// con la palabra “par” o “impar” según proceda.

public class e9 {
    public static void main(String[] args){
        int[] num = new int[8];
        System.out.print("Introduce 8 numeros: ");
        for (int i = 0; i<8; i++){
            num[i] = Integer.parseInt(System.console().readLine());
        }
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i]);
            if (num[i]% 2 == 0){
                System.out.print(" par, ");
            } else {
                System.out.print(" impar, ");
            }
        }
    }
}