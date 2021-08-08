package CodingAssignment;

import java.io.Console;
import java.text.DecimalFormat;
import java.util.Arrays;

public class CodingAssignment {
    public static void main(String[] args) {
        // step 1
        int[] ages = {3,9,23,64,2,8,28,93,35};
        int i = ages.length-1;
        System.out.println(ages[i] - ages[0]); //step 1a last-first
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        System.out.println(sum/ages.length); //step 1c. average age

        //step 2
        String[] names =  {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        int size = 0;
        for (String name : names){
            size += name.length();
        }
        System.out.println(size/names.length); //step 1a average length
        StringBuilder concat = new StringBuilder();
        for (String name : names){
            concat.append(name).append(" ");
        }
        System.out.println(concat); //step 2b string concatenation

        //step 5
        int x;
        int index =0;
        int[] nameLengths = new int[names.length];
        for (String name : names){
            nameLengths[index] = name.length();
            index++;
        }
        //step 6
        int numSum = 0;
        for (int num : nameLengths){
        numSum += num;
        }
        System.out.println(numSum);

        //step 7 test
        String hi = wordRepeat("hi", 10);
        System.out.println(hi);

        //step 8 test
        String name = fullName("Jane", "Doe");
        System.out.println(name);

        //step 9 test
        int[] test = {42,12,15,37,21,6,46};
        int[] test2 = {1,2,3,4,5,6,7,8,9,2};
        boolean testOut = over100(test);
        boolean testOut2 = over100(test2);
        System.out.println(testOut);
        System.out.println(testOut2);

        //step 10 test
        double[] test3 = {42,12,15,37,21,6,46};
        System.out.println(averageNum(test3));

        //step 11 test
        double[] test4 = {1,2,3,4,5,6,7,8,9,2};
        System.out.println(firstGreater(test4, test3));
        System.out.println(firstGreater(test3, test4));

        //step 12 test
        boolean hotOutside = true;
        double moneyInPocket = 11.1;
        System.out.println(willBuyDrink(hotOutside,moneyInPocket));

        //step 13 test
        double[] grades = {98.2, 95, 99.5, 100, 97.5, 75, 100};
        System.out.println(finalGrade(grades));
    }
    //step 7
    public static String wordRepeat(String word, int repeat)
    {
        String words = "";
      for (int i = 0; i< repeat;i++)
      {
          words += word;
      }
       return words;
    }
    //step 8
    public  static String fullName(String firstName, String lastName)
    {
        return firstName + " " + lastName;
    }
    //step 9
    public static boolean over100(int[] nums)
    {
        int sum = 0;
        for (int num: nums)
        {
            sum += num;
        }
        return sum>100;
    }
    //step 10
    public  static double averageNum(double[] nums)
    {
        double sum = 0;
        for (double num: nums)
        {
            sum += num;
        }
        return sum/ nums.length;
    }
    //step 11
    public static boolean firstGreater(double[] nums1, double[] nums2)
    {
        return averageNum(nums1)>averageNum(nums2);
    }
    //step 12
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket)
    {
        return isHotOutside && (moneyInPocket>10.5);
    }
    //step 13
    // takes an array of assignment grades and gives an average and letter grade
    public static String finalGrade(double[] grades)
    {
        DecimalFormat df = new DecimalFormat("#.00");
        String grade;
    if (averageNum(grades) >= 90)
        {grade = "A";}
    else if (averageNum(grades) >= 80)
        {grade = "B";}
    else if (averageNum(grades) >= 70)
        {grade = "C";}
    else if (averageNum(grades) >= 60)
    {grade = "D";}
    else {grade = "F";}
    return grade + " " + df.format(averageNum(grades));
    }
}
