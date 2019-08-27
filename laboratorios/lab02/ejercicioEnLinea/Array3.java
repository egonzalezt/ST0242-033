/**
 * Soluciones de los ejercicios de array3 de coding bat.
 * -canBalance
 * -fix34
 * -countClumps
 * -linearIn 
 * -maxSpan 
 */
public class Array3
{
    public boolean canBalance(int[] nums) {
        int cont=0;
        for(int i=0;i<nums.length;i++)
        {
            cont+=nums[i];
            int cont2=0;
            for(int j=nums.length-1;j>i;j--)
            {
                cont2+=nums[j];
            }
            if(cont==cont2)
            {
                return true;
            }
        }
        return false;
    }

    public int[] fix34(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==4)
            {
                for(int j=0;j<nums.length-1;j++)
                {
                    if(nums[j]==3)
                    {
                        int temp=nums[i];
                        nums[i]=nums[j+1];
                        nums[j+1]=temp;
                    }
                }
            }
        }
        return nums;
    }

    public int countClumps(int[] nums) {
        int cont=0;
        boolean same=false;
        for(int i=0;i<nums.length-1;i++)
        {
            if (nums[i] == nums[i+1] && !same) {
                same = true;
                cont++;
            } 
            else if (nums[i] != nums[i+1]) {
                same = false;
            }
        }
        return cont;
    }

    public boolean linearIn(int[] outer, int[] inner) {
        if(inner.length>0)
        {
            int cont=0;
            for(int i=0;i<outer.length;i++)
            {
                for(int j=0;j<inner.length;j++)
                    if(outer[i]==inner[j])
                    {
                        inner[j]=-111;
                        cont++;
                    }
            }
            if(inner.length==cont)
            {
                return true;
            }else return false;
        }else return true;
    }

    public int maxSpan(int[] nums) {
        if(nums.length>0)
        {
            int intervalo=0;
            for(int i=0;i<nums.length;i++)
            {
                int retadora=0;
                for(int j=nums.length-1;j>i;j--)
                {
                    if(nums[i]==nums[j])
                    {
                        retadora = j-i;
                    }
                    if(retadora>intervalo)
                    {
                        intervalo=retadora;
                    }
                }
            }return intervalo+1;
        }else return 0;
    }
}