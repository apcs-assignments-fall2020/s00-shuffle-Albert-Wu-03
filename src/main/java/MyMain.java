import java.util.Random;
public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int[] arr1 = new int[arr.length];
		int a = arr.length/2;
        for(int i = 0; i < a; i++){
            arr1[2*i] = arr[i];
            arr1[2*i+1] = arr[i+a];
        }
        return arr1;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            int a = rand.nextInt(7) + 1;
            int b = rand.nextInt(7) + 1;
            int c = arr[a];
            arr[a] = arr[b];
            arr[b] = c;
        }
        return arr;
    }


    public static void main(String[] args) {
        
    }
}
