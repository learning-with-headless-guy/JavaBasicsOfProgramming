public class Debugging {
    void main() {
        int i = 1;  //i = 1
        int sum = 0; //sum = 0

        while (i <= 3) {   //1 <= 3 == true // 2 <= 3 == true // 3 <= 3 == true //4 <= 3 == false
            sum = sum + i;  //sum = 0 + 1 = 1// sum  = 1 // sum = 1 + 2 == 3 // sum = 3 // sum = 3 + 3 // Sum = 6
            i++;  // i = 2 // i = 3 // i = 4
        }
        System.out.println(sum); // 6

//        “Beginners debugging me ye galti karte hain:
//        1️⃣ Console ke output pe depend rehna
//        2️⃣ Breakpoints galat jagah lagana
//        3️⃣ Dry run skip kar dena — aur fir confuse rehna 😅”
    }
}
