import java.util.Random;

public class Main{
    public static void main(String[] args) {
        System.out.println("Times for Insertion sort");
        Timesinsertion();
        System.out.println("Times for Merge sort");
        Timesmerge();
    }

    private static void Timesinsertion()
    {        
        long bgn, end;
        int max = 5000;
        Random generator = new Random();
        Insertionsort IS = new Insertionsort();
        for(int j=10000;j<67000;j+=3000){
            int size = j;
            int[] array = new int[size];
            for (int i=0; i<size; i++)
            {
                array[i] = generator.nextInt(max);
            }
            bgn = System.currentTimeMillis();
            IS.insertionSort(array);
            end = System.currentTimeMillis();
            System.out.println((end-bgn));           
        }
    }

    private static void Timesmerge()
    {
        Mergesort MS = new Mergesort();
        long bgn, end;
        int max = 5000;
        Random generator = new Random();
        for(int j=10000;j<67000;j+=3000){
            int size = j;
            int[] array = new int[size];
            for (int i=0; i<size; i++)
            {
                array[i] = generator.nextInt(max);
            }
            bgn = System.currentTimeMillis();
            MS.sort(array, 0, array.length-1);  
            end = System.currentTimeMillis();
            System.out.println((end-bgn));           
        }
    }
}