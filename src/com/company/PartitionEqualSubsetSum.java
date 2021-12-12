package com.company;

public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        int []arr=new int[5];
        arr[0]=5;
        arr[1]=1;
        arr[2]=11;
        arr[3]=5;
        PartitionEqualSubsetSum p = new PartitionEqualSubsetSum();
        System.out.println(p.canPartition(arr));
    }

    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int i=0;i<n;i++){
            s+=nums[i];
        }
        if(s%2!=0) return false;
        s=s/2;
        boolean [][]dp = new boolean[n+1][s+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=s;i++){
            dp[0][i]=false;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=s;j++){
                if(nums[i-1]<=j)
                    dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        for(boolean[] x:dp){
            for(boolean y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        return dp[n][s];
    }
}
