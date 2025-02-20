
//Every line of code that runs in java must be inside of a class (javac). class name should be start with capital letter.
//PS D:\Coding\Learning Folder\Java> cd self-learn
//PS D:\Coding\Learning Folder\Java\self-learn> javac Satu.java
//PS D:\Coding\Learning Folder\Java\self-learn> java Satu


//the name of java file must match the class name
public class Satu { //curly brackets to starrt end code blocks. each code statement also ends with a semicolon.
    public static void main(String[] args) {
        //any code inside the main will be executed, main is a must.
        System.out.println("Hello World"); //print Hello World, new line each print. print dulu baru enter line.
        System.out.print("Halo annisa!");
        System.out.println(9 + 7); //print numbers

        int angka = 19;
        int x, y, z;
        x = y = z = 50; //assign value to multiple variables
        System.out.println(x+y+z);
        String nama;
        nama = "Annisa";
        System.out.println("nama saya " + nama + " berumur " + angka); //concatenation

        final int constanta = 10; //final means constant, cannot be changed.

        //besides all general rules for naming a variables, variables could also start with $ and _.
    }
}