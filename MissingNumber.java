import java.util.Scanner;

class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n - 1];

        System.out.println("Enter elements:");
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            int count = 0;

            for (int j = 0; j < n - 1; j++) {
                if (a[j] == i) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("Missing number = " + i);
            }
        }
        sc.close();
    }
}