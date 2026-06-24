public class Duplicates{
    public static void main(String[] args) {
        int a[]={2,1,2,5,1,10};
        int n=a.length;
        for(int i=0;i<n;i++){
            int count =1;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                    System.out.println(a[j]);
                }
            }
        }
    }
}