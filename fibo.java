import  java.util.Scanner;
public class fibo {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int front=1;
        int back=0;
        System.out.print(0+ " ");
        System.out.print(1+ " ");

        for(int i=1;i<n;i++){
            // 0 1 1 2 
            int next=front+back;
            back=front;
            front=next;
            
            System.out.print(front+" ");
        }}
    }