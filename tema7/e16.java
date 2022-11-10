public class e16 {
    public static void main(String[] args){
        int[] array = new int[400];

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*401);
            System.out.print(array[i]+ " ");
            System.out.println();
        }
        System.out.print();
    }
}