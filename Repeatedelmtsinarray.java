import java.util.Scanner;
class Repeatedelmtsinarray
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
                int max=arr[0];
        for(int i=0;i<n;i++)
        {
                if (arr[i] > max)
                 max = arr[i];
               } 
                
             int count = 0;
        for(int i=0;i<n;i++)
        {
             if(max==arr[i])
            {
                count++;
            }}
           System.out.println(max +"  "+count);
}}
