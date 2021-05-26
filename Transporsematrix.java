import java.util.Scanner;
class Transporsematrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column index:");
        int row = sc.nextInt();
        int colm = sc.nextInt();
        int[][] arr = new int[row][colm];
        int[][] trns= new int[row][colm];
 if(row >= 3 && row<=10 && colm >= 3 && colm<=10){
        System.out.println("Enter the matrix elements");
        for(int i = 0; i<row; i++)
        {
            for(int j = 0; j<colm; j++)
            {

                arr[i][j] = sc.nextInt();
            }
        }
       System.out.println("Matrix after transporse:");
        for(int i = 0; i<row; i++)
        {
            for(int j = 0; j<colm; j++)
            {
                 
                trns[i][j]=arr[j][i];

                System.out.print(trns[i][j]+" ");
            }
            System.out.println();
         }
     }
  else{
   System.out.println("invalid input");
        }
    }
} 