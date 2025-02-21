public class string {
    public static void main(String[] args) {
        //String is a sequence of characters
        String greeting = "Hello";
        System.out.println(greeting);

        //String length
        System.out.println(greeting.length()); //5

        //String concatenation
        String firstName = "Annisa";
        String lastName = "Aprilia";
        String fullName = firstName + " " + lastName; //Annisa Aprilia concatenation
        System.out.println(fullName);

        //String format
        String nama = "Annisa";
        int umur = 19;
        System.out.println("Nama saya " + nama + " berumur " + umur);
        System.out.printf("Nama saya %s berumur %d", nama, umur); //seperti c

        //String methods
        String txt = "Hello World";
        System.out.println(txt.toUpperCase()); //HELLO WORLD
        System.out.println(txt.toLowerCase()); //hello world
        System.out.println(txt.indexOf("World")); //6 karena index dimulai dari 0 dan spasi juga dihitung, world dimulai dari index 6
        System.out.println(txt.indexOf("o")); //4 karena index dimulai dari 0, o pertama kali muncul di index 4
        System.out.println(txt.indexOf("a")); //-1 karena a tidak ada di dalam txt
        System.out.println(txt.indexOf("l")); //2 karena index dimulai dari 0, l pertama kali muncul di index 2
        System.out.println(txt.indexOf("x")); //-1 karena x tidak ada di dalam txt
        System.out.println(txt.indexOf("o", 5)); //7 karena index dimulai dari 0, o pertama kali muncul di index 4 alias less than 5, maka o kedua kali muncul di index 7
        System.out.println(txt.indexOf("o", 6)); //7 karena index dimulai dari 0, o pertama kali muncul di index 4 alias less than 6, maka o kedua kali muncul di index 7
        System.out.println(txt.indexOf("o", 7)); //7 karena index dimulai dari 0, o pertama kali muncul di index 4 alias less than 7, maka o kedua kali muncul di index 7
        System.out.println(txt.indexOf("o", 8)); //-1 karena o tidak ada di dalam txt setelah index 7

        int angka1 = 10;
        int angka2 = 20;
        System.out.println(angka1 + angka2); //30
        String strAngka1 = String.valueOf(angka1); //"10"
        String strAngka2 = "20";
        System.out.println(strAngka1 + strAngka2); //1020
        System.out.println(angka2 + strAngka2); //2020


        //Escape for special characters
        String text = "We are the so-called \"Vikings\" from the north."; //We are the so-called "Vikings" from the north.
        System.out.println(text);
        System.out.println("it\'s alright");
        //other special character
        // \n	New Line
        //\r	Carriage Return
        //\t	Tab
        //\b	Backspace
        //\f	Form Feed
    }
}