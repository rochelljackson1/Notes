import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        int [] numbers;
        numbers = new int[4];
        numbers[0] = 34;
        numbers[1] = 453;
        numbers[2] = 3;
        numbers[3] = 9;

        //Replace value already inside element by multiplying i by 2.
        for(int i = 0; i < numbers.length; ++i) {
            numbers[i] = i * 2;
            System.out.println(numbers[i]);
        }

        // Twice value already inside element
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
            System.out.println(numbers[i]);
        }

        //Create array that contains Strings
        String[] myStrArray = new String[3];

        myStrArray[0] = new String( "Hello");
        myStrArray[1] = new String( "Hi");
        myStrArray[2] = new String( "Hj");

        for(int i = 0; i < myStrArray.length; i++) {
            numbers[i] = numbers[i] * 2;
            System.out.println(myStrArray[i]);
        }

        //This doesn't copy an array
        //String[] my2StrArray = new String[3];
        //my2StrArray[2] = "Guten Morgen";
        //String[] my2StrArray = myStrArray;

        //for(int i = 0; i < my2StrArray.length; i++) {
            //System.out.println(myStrArray[i] + " ");
            //System.out.println(my2StrArray[i] + " ");
        //}

        //This does copy an array
        String[] my2StrArray = new String[3];

        for(int i = 0; i < my2StrArray.length; i++) {
            my2StrArray[i] = myStrArray[i];
        }
        my2StrArray[2] = "Guten Morgen";
            for(int i = 0; i < my2StrArray.length; i++) {
                System.out.println(myStrArray[i] + " ");
                System.out.println(my2StrArray[i] + " ");
            }
        //two dimensional array
        int [][] scores = new int[3][4];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 4; col++) {
                    Random random = new Random();
                    scores[row][col] = random.nextInt();
                    System.out.println(scores[row][col]);
                }
            }

    }
}