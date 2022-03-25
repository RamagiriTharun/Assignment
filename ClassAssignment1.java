//Find the minimum and maximum element in an array  --10
//        Write a program to reverse the array --10
//        Write a program to sort the given array  --10
//        read data from 1 file and write into another file --20
//        create Map<String, String> object and sort key in ascending order --20

import java.util.Scanner;

public class ClassAssignment1 {
    public static int minimum(int a[],int n){
        int min = a[0];
        for(int i=0;i<n;i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        return min;
    }
    public static int maximum(int a[],int n){
        int max = a[0];
        for(int i=0;i<n;i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int min = minimum(a,n);
        System.out.println("Minimum element in array is: " +min);
        int max = maximum(a,n);
        System.out.println("Maximum element in array is: " +max);
    }
}
