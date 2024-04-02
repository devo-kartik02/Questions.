import java.util.Scanner;

 class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int reverse = 0;
        while (a != 0) {
            int n = a % 10;
            reverse = reverse + n * n * n;
            a = a / 10;
        }
        if (temp == reverse) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
