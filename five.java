/*
 5 4 3 2 1 
 5 4 3 2 
 5 4 3
 5 4 
 5
 */
public class five {
    static int n=13;
    public static void main(String[] args) {
        int k=n-1;
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=(n-k);j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            k--;
        }
    }
}
