public class Punto1 {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private int array[];


    public Punto1() {
        array = new int[9];
        size = 0;
    }


    public int size()
    {
        return size;
    }

    public void add(int e) {
        if(size==array.length)//C1=2
        {
            int [] arr2 = new int[array.length+1];//C2==3 O(1)
            for(int i=0;i<array.length;i++)//C3+C4 O(n)
            {
                arr2[i]= array[i];//C5n O(n)
                array=arr2;// C6  O(1)
            }
        }
        array[size]= e;//C7 O(1)
        size++;//C8 O(1)
        //T(n)=C1+C2+C3+C4N... es O(n)
        //Es funcional para cuando se quiere meter de a una cosa ya si se necesitas varias a la vez queda insuficiente para esa labor
    }

    public int get(int i) {
        if (i < size && i >= 0)
            return array[i];
        else
            throw new ArrayIndexOutOfBoundsException();
    }

    public void add(int index, int e) {
        int [] arr2 = new int [array.length+1];
        int j=0;
        if(index>=0&&index<size)
        {
            for(int i=0;i<arr2.length;i++)
            {
                if(i==index)
                {
                    arr2[i]=e;
                }
                else {
                    if (j < array.length)
                    {
                        arr2[i]=array[j];
                        j++;
                    }
                }
            }
        }
        array=arr2;
    }

    public void del(int index) {
        int[] arrcopy = new int[array.length - 1];
        int j=0;
        if (index >= 0 && index < size) {
            for (int i = 0; i < array.length; i++) {
                if(i!=index)
                {
                    if(j<=arrcopy.length)
                    {
                        arrcopy[j] = array[i];
                    }
                    j++;
                }
            }
        }
        array=arrcopy;
    }
}
