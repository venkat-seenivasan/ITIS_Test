import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count;
        int val = 0;
        int small = (int) Math.pow(10, b);
        boolean found = false;

        if (a == 0) {
            System.out.println("NO ANSWER");
            return;
        }
            
        for (int i = small / 10; i < small; i++) {
            int back = i;
            while (i > 0) {
                count = i % 10;
                val = val + count;
                i = i / 10;
            }

            if (a == val) {
                System.out.println("Smallest Sum is " + back);
                found = true;
                break;
            }
            val = 0;
           i = back; // restore i after modifying inside loop
        }

        if (!found) {
            System.out.println("NOTHING");
        }
    }
}
