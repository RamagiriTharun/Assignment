import java.text.CollationElementIterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ClassAssignment3 {
    public static void arraySort(int a[],int n){
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
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
        arraySort(a,n);
    }
}
