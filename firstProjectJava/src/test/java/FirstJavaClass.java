import jdk.nashorn.internal.ir.IfNode;
import org.testng.annotations.Test;
import sun.rmi.runtime.NewThreadAction;

public class FirstJavaClass {
    @Test
    public void test00001() {
        //Print Hello Word

            System.out.println("Hello Word");
    }

    @Test
    public void test00002() {
        int number = 13;

        System.out.println(number);
    }

    @Test
    public void test00003() {
      //Create all of the primitives (except long and double) with different values
        // Concatenate them into a string and print it to the screen so it will print: H3110 w0r1d 2.0 true


        int numbersSequence = 3110;
        char secondLetter = 'w';
        int secondNumber = 0;
        char thirdLetter = 'r';
        int thirdNumber = 1;
        char lastletter = 'd';
        float floatNumber = 2.0f;
        boolean istrue = true;

        String finalResult = "H" + numbersSequence + " " + secondLetter + secondNumber + thirdLetter +
                thirdNumber + lastletter + " " + floatNumber + " " + istrue;
        System.out.println(finalResult);

    }


    @Test
    public void test00004() {
        String firstString = new String("misho");
        String secondString = new String("misho");

        if (firstString.equals(secondString)){
            System.out.println("Yesss");
        }
        else {
            System.out.println("Not good, you lost your job");
        }
    }

    @Test
    public void test00005() {
        int[] arr = new int[20];
        arr[2] = 22;
        arr[1] = arr[2] + 5;
        System.out.println(arr[1]);

       for(int i = 0; i < arr.length; i++){
           System.out.println(arr[i]);
       }
    }

    @Test
    public void test00006() {
        //Arrays
        int[] numbers = {1, 2, 3, 9};
        int length = numbers[3];
        char[] chars = new char[length];
        chars[numbers.length + 4] = 'y';
        System.out.println("Done!");
    }

    @Test
    public void test00007() {
        int[] numbers = {
                951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544,
                615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941,
                386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345,
                399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217,
                815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717,
                958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470,
                743, 527};

        for(int i = 0; i < numbers.length; i++){
            int element = numbers[i];

            if (element == 237){
                break;
            }
            if(element % 2 == 0){
                System.out.println(element);
            }
        }
    }

    @Test
    public void test00008() {

    }
}
