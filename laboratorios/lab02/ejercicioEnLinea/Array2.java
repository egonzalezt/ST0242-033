/**
 * Soluciones de los ejercicios de array2 de coding bat.
 * -coutEvents
 * -bigDiff
 * -lucky13
 * -sum28
 * -only14
 * -either24
 * -has22
 * -no14
 */
public class Array2
{
    public int countEvens(int[] nums) {
        int cont=0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]%2==0)
            {
                cont++;
            }
        return cont;
    }

    public int bigDiff(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        return max-min;
    }

    public boolean lucky13(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1||nums[i]==3)
            {
                return false;
            }
        }
        return true;
    }

    public boolean sum28(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==2)
            {
                sum+=nums[i];
            }
        }
        if(sum==8)
        {
            return true;
        }else return false;
    }

    public boolean only14(int[] nums) {
        boolean cond = true;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=1&&nums[i]!=4)
            {
                cond =false;
            }
        }
        return cond;
    }

    public boolean either24(int[] nums) {
        boolean cond=false;
        boolean cond2=false;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==2&&nums[i+1]==2)
            {
                cond= true;
            }
            if(nums[i]==4&&nums[i+1]==4)
            {
                cond2= true;
            }
        }
        if(cond!=cond2)
        {
            return true;
        }else return false;
    }

    public boolean has22(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==2&&nums[i+1]==2)
            {
                return true;
            }
        }
        return false;
    }

    public boolean no14(int[] nums) {
        boolean cond=true;
        boolean cond1=true;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                cond= false;
            }
            if(nums[i]==4)
            {
                cond1= false;
            }
        }
        if(cond==false&&cond1==false)
        {
            return false;
        }
        else return true; 
    }
}
