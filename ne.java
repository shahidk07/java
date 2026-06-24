import java.util.HashMap;

public class ne {

    public static void main(String[] args) {
        int nums[]={2,1,2,5,1,10};
        int n=nums.length;

        HashMap<Integer,Integer> m=new HashMap<>();

        for(int i=0;i<n;i++){
            if(m.containsKey(nums[i])){
                int prev=nums[i];
                m.put(nums[i],(prev+1));
                System.out.println(nums[i]);
            }
            else{
                m.put(nums[i],1);
            }
        }
    }

}