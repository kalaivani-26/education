import java.util.Scanner;
import java.util.Arrays;
class arrayrepetedelements{
public static void main (String args[]){
Scanner s1 =new Scanner(System.in);
int n=s1.nextInt();
int arr[]=new int[n];
for(int i =0;i<n;i++){
	arr[i]=s1.nextInt();
	System.out.println();
	}
Arrays.sort(arr);
for(int i=0;i<n;i++){
System.out.println(arr[i]);
}
for(int i=0;i<n;i++){
	int temp=arr[i];
	int count=0;
	while(i<n && temp==arr[i]){
		count++;
	    i++;
	
	if (count>1)
	System.out.println(temp);

	}
}
}
}



