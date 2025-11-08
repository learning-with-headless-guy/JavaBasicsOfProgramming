public class Patterns {
    void main() {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                IO.print("* ");
//            }
//            IO.println();
//        }

        //Nested Loops
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Square Pattern
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */

//        for (int i = 1; i <=5 ; i++) {
//            for (int j = 1; j <= 5; j++) {
//                IO.print("* ");
//            }
//            IO.println();
//        }

        //Star Pattern
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                IO.print("* ");
            }
            IO.println();
        }

        //Inverted Star pattern
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */

//        for (int i = 5; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                IO.print("* ");
//            }
//            IO.println();
//        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                IO.print(j + " ");
            }
            IO.println();
        }
    }
}
