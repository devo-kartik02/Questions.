import java.util.Scanner;
 class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp = n;
        int a,reverse=0;
        for(int i = 0; i<=n;i++){
            a = n%10;
            reverse = reverse*10+a;
            n = n/10;
        }
        if(temp==reverse){
            System.out.println("The number is palindrome" );
        }
        else{
            System.out.println("The number is not palindrome");
        }
    }
}