import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int t=1;
        n = s.nextInt();
        int arr[][] = new int[n][n];
        
            for(int a=n; a>0; a=a-1 )
            {
                
                for(int j = n-a; j<a; ++j)
                    {
                        arr[n-a][j]=t;
                        t=t+1;
                    }
                for(int i = n-a+1; i<a; ++i)
                {
                    arr[i][a-1]=t;
                    t=t+1;
                }
                for(int j = a-2; j>=n-a; --j)
                {
                    arr[a-1][j]=t;
                    t=t+1;
                }
                for(int i = a-2; i >= n-a+1; --i)
                {
                    arr[i][n-a]=t;
                    t=t+1;
                }
            
        }





        for(int i = 0; i<n; ++i)
            {for(int j = 0; j<n; ++j)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}