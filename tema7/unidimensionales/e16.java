public class e16 {
    public static void main(String[] args){
        int[] array = new int[20];
        int resp = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*401);
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        System.out.print("¿Qué números quiere resaltar? [1] los múltiplos de 5 || [2] los múltiplos de 7): ");
        resp = Integer.parseInt(System.console().readLine());
        if (resp == 1){
            for (int j = 0; j < array.length; j++){
                if (array[j] % 5 == 0){
                    System.out.print("["+array[j]+"] ");
                }else System.out.print(array[j]+" ");
            }
        }
        if (resp == 2){
            for (int j = 0; j < array.length; j++){
                if (array[j] % 7 == 0){
                    System.out.print("["+array[j]+"] ");
                }else System.out.print(array[j]+" ");
            }
        }
        System.out.println();
    }
}