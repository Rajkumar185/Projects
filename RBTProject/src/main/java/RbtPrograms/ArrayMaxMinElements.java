package RbtPrograms;

import java.util.Scanner;

public class ArrayMaxMinElements {
	
	public static int maxVal(int len,int[] arr){
        int maxVal=0;
        for(int n:arr){
            if(n>maxVal){
                maxVal=n;
            }
        }

        return maxVal;
    }

    public static int minVal(int len,int[] arr){
        int minVal=maxVal(len,arr);

        for(int n:arr){
            if(n<minVal){
                minVal=n;
            }
        }
        return minVal;
    }


public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of the array");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter the elements of the array: "); 
    for(int i=n-1;i>=0;i--){
        arr[i]=sc.nextInt();
    }

    System.out.println("Maxium value from array = "+maxVal(n,arr));
    System.out.println("Minium value from array = "+minVal(n,arr));
}
}
