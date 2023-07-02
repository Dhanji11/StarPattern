/*
 1 1 1 1 1 1
 1 1 1 1 2 2
 1 1 1 3 3 3
 1 1 4 4 4 4
 1 5 5 5 5 5
 6 6 6 6 6 6
 */

public class second {
    public static void main(String[] args) {
        int  n=5;
        for(int i=1;i<=n;i++)
        {
         for(int j=0;j<n;j++)
         {
            int t=n-i;
            if(j<t)
            System.out.print(1+" ");
            else
            {
                System.out.print(i+" ");
            }
         }
         System.out.println();
        }
    }
}
