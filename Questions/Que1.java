import java.util.Scanner;
class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b,reverse = 0;
     for(int i = 0 ; i<=a;i++){
             b = a%10;
             reverse = reverse*10+b;
             a = a/10;
     }
        System.out.println("Reverse = "+reverse);
    }
}