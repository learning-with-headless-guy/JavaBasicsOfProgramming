public class ConditionalStatements {
    void main() {
        //Conditional Statements
        boolean raining = true;
        if (raining) {
            IO.println("Take an umbrella!");
        } else {
            IO.println("Go outside freely!");
        }

        //De dana dan
        boolean tumneApnaAadmiBhejaLashKeBadlePaiseKeLiye = true;
        boolean yeTumharaAadmiHai = true;
        boolean isneIskoPaisaDiya = true;

        if (tumneApnaAadmiBhejaLashKeBadlePaiseKeLiye && yeTumharaAadmiHai && isneIskoPaisaDiya) {
            IO.println("Fir tum hamse paisa kyu mang rahe ho");
        }

        boolean baapMarGaya = false;
        if (baapMarGaya) {
            IO.println("baap mar gaya aur ha ye laast baap ki hai");
        }else {
            IO.println("are iski baat mat sun");
        }

        //Normal code
        int age = 18;

        //Simple IF
        if (age >= 18) {
            System.out.println("You can vote!");
        }

        //IF ELSE
        if (age >= 18) {
            System.out.println("You can vote!");
        } else {
            System.out.println("You cannot vote yet!");
        }

        int marks = 85;

        //IF ELSE-IF ELSE
        if (marks >= 90) {
            System.out.println("Grade A+");
        } else if (marks >= 75) {
            System.out.println("Grade A");
        } else if (marks >= 60) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }


        boolean isStudent = true;
        age = 19;

        //NESTED IF
        if (isStudent) {
            if (age > 18) {
                System.out.println("College Student");
            } else {
                System.out.println("School Student");
            }
        }


        int day = 3;

        //SWITCH
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Invalid Day");
        }


    }
}
