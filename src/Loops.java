public class Loops {
    void main() {

        for (int i = 1; i <= 5; i++) {
            IO.println("Hello world " + i);
        }

        //while loop
        int count = 1;
        while (count <= 5) {
            IO.println(count + "\n");
            count++;
        }

        //Do while
        int num = 6;
        do {
            IO.println("Number: " + num);
            num++;
        } while (num <= 5);

        //Even Number
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                IO.println(i);
            }
        }

//        1️⃣ Increment bhool jana — Infinite Loop 💀
//        2️⃣ Condition galat likh dena — Loop kabhi nahi chalega
    }
}
