import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int[] a={1,2,5,8,7,9};
        int odd=0,even=0;
    
        for(int i=0;i<a.length;i++){  
            if(a[i]%2==0){  
                odd=odd+1;  
            }  
        }  
        for(int i=0;i<a.length;i++){  
            if(a[i]%2!=0){  
               even=even+1; 
            }  
        }
        System.out.println("odd numbers"+odd);
        System.out.println("even numbers"+even);
}
}
