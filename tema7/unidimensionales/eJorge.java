public class eJorge {
    public static void main(String[] args){
        int[] array = new int[8];
        int mayor=0;

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*21);
            System.out.print(array[i]+" ");
        }
    }
}