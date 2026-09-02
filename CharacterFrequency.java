import java.util.Scanner;

class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    alreadyCounted = true;
                }
            }

            if (!alreadyCounted) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }

                System.out.println(str.charAt(i) + " = " + count);
            }
      
        }
        sc.close();
    }
}