// Last updated: 7/8/2026, 4:48:19 PM
/*
//using hashing
class Solution {
    public int missingNumber(int[] nums) 
    {
        int[] hash=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            hash[nums[i]]+=1;
        }

        for(int i=0;i<=nums.length;i++)

        {
            if(hash[i]==0)
            {
                return i;
            }
        }
        return -1;
        
    }
}

//using summation
class Solution {
    public int missingNumber(int[] nums) 
    {
        int n=nums.length;
        int sum_n= (n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        return sum_n-sum;
    }
}

//using xor
class Solution {
    public int missingNumber(int[] nums) 
    {
        int xor1=0,xor2=0,xor=0;
        for(int i=0;i<nums.length;i++)
        {
            xor1= xor1^(i+1);
            xor2= xor2^nums[i];
        }
        System.out.print(xor1);
        return xor1^xor2;
    }
}
*/

class Solution {
    public int missingNumber(int[] nums) 
    {
        int hash[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            hash[nums[i]]++;
        }
        for(int i=0;i<hash.length;i++)
        {
            if(hash[i]==0)
            {
                return i;
            }
        }
        return -1;
    }
}



