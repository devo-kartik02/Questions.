import java.util.Scanner;
 class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2, 9, 7, 4, 5, 3};
        int n = arr.length;
        int temp;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for (int j = n / 2; j < n - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }


        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
