/*
 5 
 5 4
 5 4 3
 5 4 3 2
 5 4 3 2 1
 */
public class six {
    static int n=14;
    public static void main(String[] args) {
        int k=n;
        for(int i=k;i>=1;i--)
        {
            for(int j=n;j>=k;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            k--;
        }
    }
}
