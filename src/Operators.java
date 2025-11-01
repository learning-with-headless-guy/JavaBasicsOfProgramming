public class Operators {
    void main() {
//        1️⃣ Arithmetic
//        2️⃣ Relational
//        3️⃣ Logical
//        4️⃣ Assignment
//        5️⃣ Increment/Decrement

        int a = 10;
        int b = 5;

//      Arithmetic Operators
        IO.println(a + b);  // Addition
        IO.println(a - b);  // Subtraction
        IO.println(a * b);  // Multiplication
        IO.println(a / b);  // Division
        IO.println(a % b);  // Modulus (Remainder)

//      Relational Operators
        IO.println(a > b);  // true
        IO.println(a < b);  // false
        IO.println(a == b); // false
        IO.println(a != b); // true


//      Logical Operators
        int x = 10, y = 20;
        IO.println(x > 5 && y > 15); // true
        IO.println(x > 15 || y > 15); // true
        IO.println(!(x > 5)); // false

//      Assignment operator
        int n = 5;
        n += 2;  // same as n = n + 2 //7
        IO.println(n);
        n -= 1;  // same as n = n - 1 //6
        IO.println(n);

//      Increment aur Decrement
        n++; // increment //7
        IO.println(n);
        n--; // decrement  //6
        IO.println(n);

    }
}
