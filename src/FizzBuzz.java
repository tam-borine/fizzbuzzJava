import java.util.ArrayList;

/**
 * Created by tam on 12/01/2017.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("Hello world");
        FizzBuzz fizzbuzzRun = new FizzBuzz();
        System.out.println(fizzbuzzRun.fizzBuzz());
    }


    public ArrayList<String> fizzBuzz() {
        int[] numbers = generateArrayOfInts(0,100);
        ArrayList<String> convertedNumbers = new ArrayList<String>();
        //loop through numbers
        for (int i = 0; i < numbers.length; ++i) {
            if (i%3==0 && i%5==0) {
                convertedNumbers.add("FizzBuzz");
            } else if (i%3==0) {
                convertedNumbers.add("Fizz");
            } else if (i%5==0) {
                convertedNumbers.add("Buzz");
            } else {
                convertedNumbers.add(Integer.toString(i));
            }
        }
        return convertedNumbers;
    }

    public int[] generateArrayOfInts(int start, int finish) {
        int[] a = new int[finish];
        for (int i = start; i < finish; ++i) {
            a[i] = i;
        }
        return a;
    }
}

//    Create a FizzBuzz() method that prints out the numbers 1 through 100.
//        Instead of numbers divisible by three print "Fizz".
//        Instead of numbers divisible by five print "Buzz".
//        Instead of numbers divisible by three and five print "FizzBuzz".


//class ArrayCopyDemo {
//    public static void main(String[] args) {
//        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
//                'i', 'n', 'a', 't', 'e', 'd' };
//        char[] copyTo = new char[7];
//
//        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
//        System.out.println(new String(copyTo));
//    }
//}