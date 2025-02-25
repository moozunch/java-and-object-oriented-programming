public class Conditional {
    public static void main(String[] args) {
        //Booleans represent one of two values: true or false. Yes/No. On/Off. In java only true or false.
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun); //true
        System.out.println(isFishTasty);

        int x = 10;
        int y = 5;
        System.out.println(x < y);
        System.out.println(x == 10);

        int myAge = 19;
        int votingAge = 17;
        System.out.println(myAge >= votingAge); //true, now we want if true kita mau dia melakukan action, let's use conditional statemtns.


        if (myAge >= votingAge) {
            System.out.println("You are old enough to vote!");
        } else if (myAge < votingAge) {
            System.out.println("You are not old enough to vote!");
        } else {
            System.out.println("kaga ada else sih ;b");
        }

        myAge = 13;
        //Ternary Operator
        System.out.println(myAge >= votingAge ? "You are old enough to vote!" : "You are not old enough to vote!");

        //Switch statement - The value of the expression is compared with the values of each case.
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

    }
}