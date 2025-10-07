package Array.dsa.com;

import java.util.Scanner;

public class array1 {
  int divide(int []arr){
   int sum=0;
   for(int i=0;i<arr.length;i++){
    sum+=arr[i];
   }
   int prefix=0;
   for(int j=0;j<arr.length-1;j++){
    prefix=prefix+arr[j];
    int ans=sum-prefix;
    if(ans==prefix){
      return 1;
    }

   }
   return 0;

  }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int []arr=new int[size];
    for(int i=0;i<size;i++){
      System.out.print("arr[i]"+" "+":");
      int arr[]=sc.nextInt[i];
      array1 obj=new array1();
      int result=obj.divide(arr);
    }
  }    
}
  

 
 
