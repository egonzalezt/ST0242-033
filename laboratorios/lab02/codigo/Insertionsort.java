public class Insertionsort
{
    public int[] insertionSort (int[] array){
        int Arg1=array.length;
        for(int i=1;i<Arg1;i++){
            int Arg2=array[i];
            int y=i-1;
            while (y>=0 && array[y]>Arg2){
                array[y+1]=array[y];
                y=y-1;
            }
            array[y+1]=Arg2;
        }
        return array;
    }
}
