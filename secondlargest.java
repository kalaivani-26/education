import java.util.*;
class secondlargest
{
    public static void main(String[] args) 
    { 
        int i;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for( i=0; i<n; i++)
            arr[i] = sc.nextInt();
                int max=arr[0];
            Arrays.sort(arr);
        for( i=0;i<n;i++)
        {
                if (arr[i] > max)
                 max = arr[i];
               } 
             int max2=arr[0];
        for( i=0;i<n;i++)
        {
                if(arr[i]!=max){
                if (arr[i] > max2)
                 max2= arr[i];}
            }


           System.out.println(max2);
}
}