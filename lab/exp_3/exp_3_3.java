// find maximum and minimum value in an array
import java.util.Arrays;
import java.util.Scanner;

public class exp_3_3 {
    public static void main(String[] args) {
        int nums[]={1,2,3,6,43,21,-1};

        int max=0,min=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
               min= nums[i];
            }
        }
        System.out.println("Max:"+max+"\nMin:"+min);
    }
}
