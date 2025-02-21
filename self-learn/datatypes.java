/*
    Primitive types in Java are predefined and built into the language, while non-primitive types are created by the programmer (except for String).
    Non-primitive types can be used to call methods to perform certain operations, whereas primitive types cannot.
    Primitive types start with a lowercase letter (like int), while non-primitive types typically starts with an uppercase letter (like String).
    Primitive types always hold a value, whereas non-primitive types can be null.
    Examples of non-primitive types are Strings, Arrays, Classes etc.
 */

public class datatypes {
    public static void main(String[] args) {
        //primitive data types
        byte angka1 = 100; //8-bit signed two's complement integer
        System.out.println(angka1);
        short angka2 = 1000; //16-bit signed two's complement integer
        System.out.println(angka2);
        int angka3 = 100000; //32-bit signed two's complement integer
        System.out.println(angka3);
        long angka4 = 1000000000; //64-bit signed two's complement integer
        System.out.println(angka4);
        float angka5 = 10.5f; //32-bit floating point
        //bisa juga float f1 = 35e3f; // 35 x 10^3
        System.out.println(angka5);
        double angka6 = 10.5; //64-bit floating point
        System.out.println(angka6);
        char karakter = 'A'; //16-bit unicode character
        System.out.println(karakter);
        boolean benar = true; //true or false
        System.out.println(benar);

        //non-primitive data types
        String nama = "Annisa"; //String is a class, not a data
        System.out.println(nama);


        //Type casting, converting one primitive data types to another
        //1. Widening Casting (automatically) - converting a smaller type to a larger type size
        //byte -> short -> char -> int -> long -> float -> double
        int myInt = 9;
        double myDouble = myInt; //Automatic casting: int to double
        System.out.println("widening nilai awal: " + myInt);
        System.out.println("widening nilai awal: " + myDouble);

        //2. Narrowing Casying (manually) - converting a larger type to a smaller size type
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; //Manual casting: double to int
        System.out.println("narrowing nilai awal: " + myDouble);
        System.out.println("narrowing nilai akhir: " + myInt2);



        //Contoh, kita mau buat program yang mengkalkulasikan persentasi dari skor user dalam hubungan dengan skor maksimal.
        int maxScore = 500;
        int userScore = 423;
        float percentage = (float) userScore / maxScore * 100.0f;
        System.out.println("Persentasi skor adalah " + percentage + "%");


        //untuk materi selanjutnya operator, tetap sama seperti pada bahasa lainnya.

    }
}