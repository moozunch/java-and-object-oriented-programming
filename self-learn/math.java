public class math {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        //1. Max find the highst value
        System.out.println(Math.max(x, y));

        //2. Min find the lowest value
        System.out.println(Math.min(x, y));

        //3. Square root
        System.out.println(Math.sqrt(64));

        //4. Absolute value - bilangan tanpa tanda positif maupun negatif, bilangan bulat
        System.out.println(Math.abs(-4.7));

        //5. Random number - returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        System.out.println(Math.random());
        int randomNum = (int)(Math.random() * 101); //0 to 100
        System.out.println(randomNum);

    }
}  