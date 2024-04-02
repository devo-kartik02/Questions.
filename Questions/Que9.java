import java.util.Scanner;
 class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,6,7,8};
        int n = arr.length;
         int sum=(n+1)*(n+2)/2;   
      for(int i=0;i<n;i++)
      {
          sum=sum-arr[i];
      }
      System.out.println("Missing Element is "+sum);  
   }
 }
