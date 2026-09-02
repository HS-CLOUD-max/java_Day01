import java.util.Scanner;

class SecondLargest {
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

        int largest = a[0];
        int secondLargest = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            }
            else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }

        System.out.println("Second largest element = " + secondLargest);
        sc.close();
    }
}