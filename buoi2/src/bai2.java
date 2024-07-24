import java.util.Scanner;
import java.lang.Math;

public class bai2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("so phan tu cua mang: ");
            n = scanner.nextInt();
        } while(n<=0);
        int arr[] = new int[n];
        System.out.println("nhap mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr["+i+"]= ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("mang ban dau:");
        for(int i = 0; i<n; i++ )
        {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        if(n==2)
            {
                arr[1] = arr[1] + Math.abs(arr[0]-0);
            }
            else if(n%2==0)
            {
                
                for(int i = 1; i < n-1; i=i+2 )
                {
                    arr[i] = arr[i] + Math.abs(arr[i+1]-arr[i-1]);
                }
                arr[n-1] = arr[n-1] + Math.abs(arr[n-2]-0);
            }
            else
            {
                for(int i = 1; i < n; i=i+2 )
                {
                    arr[i] = arr[i] + Math.abs(arr[i+1]-arr[i-1]);
                }
            }
        System.out.println("mang sau bien doi:");
        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}