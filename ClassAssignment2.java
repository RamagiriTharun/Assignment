import java.util.Scanner;

public class ClassAssignment2 {
    public static void reverse(int[] a, int n){
        int b[] = new int[n];
        int j = 0;
        for(int i=n-1;i>=0;i--){
            b[j] = a[i];
            j++;
        }
        for(int i=0;i<n;i++){
            System.out.println(b[i]);
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
        reverse(a,n);
    }
}
