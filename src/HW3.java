import java.util.Scanner;

public class HW3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numArray;

        System.out.println("Add a number");
        int num1 = scan.nextInt();

        System.out.println("Add a number");
        int num2 = scan.nextInt();

        System.out.println("Add a number");
        int num3 = scan.nextInt();

        System.out.println("Add a number");
        int num4 = scan.nextInt();

        System.out.println("Add a number");
        int num5 = scan.nextInt();


        //To find the sum//
        int numbArray[] = {num1, num2, num3, num4, num5};
        int sum = 0;

        for (int i : numbArray)
            sum += i;
        System.out.println("The sum  of the numbers is " + sum);

////Part 2//
//        double[ ] exampleArray = {1,5,6,5,4,1};
//
//        double maximum = exampleArray[0];
//
//        int index = 0;
//
//        for (int i = 1; i<exampleArray.length>; i++){
//
//            if (exampleArray[ i ] > maximum) {
//
//                maximum = exampleArray[ i ];
//
//                index = i;
//            }
//
//        }
//
//        System.out.println(index);

//        3. Write a public static method called "toPower" that takes in as parameters two integers called size and power. The method should return an array of size "size" with each array index raised to the value of "power." So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should return the following result: [0,1,4,9].

    }
}