import java.util.Scanner;

class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.print(a[i] + " ");
            }
        }
        sc.close();
    }
}
