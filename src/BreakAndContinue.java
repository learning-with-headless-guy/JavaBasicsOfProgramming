public class BreakAndContinue {
    void main() {
        //Break and Continue

        //Break
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            IO.println("Number: " + i);
        }

        //Continue
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Number: " + i);
        }

        //Even Numbers
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) continue;
            System.out.println(i);
        }

    }
}
