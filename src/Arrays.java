public class Arrays {
    void main() {
        int[] marks = {90, 85, 70, 95, 88};

//        1️⃣ Declare + Initialize together
//        2️⃣ Declare pehle, fill baad me

        int[] num = new int[5]; ////// 10,12,12,12,12
        num[0] = 10;
        num[1] = 12;
        num[2] = 12;
        num[3] = 12;
        num[4] = 12;

//        IO.println("num " + num[1]);
//        IO.println("num " + num[0]);

        for (int i = 0; i < num.length; i++) {
            IO.println(num[i]);
        }

//        Beginners ki common galti:
//        1️⃣ Index out of range error (array ke size se zyada access karna)
//        2️⃣ Galat data type store karna
//        3️⃣ Confusion between length & index




    }
}
