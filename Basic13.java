// =======  BASIC 13 ALGORITHMS  ======= //

// This Class will contain all of the Methods & Algorithms

import java.util.ArrayList;

public class Basic13 {

  // 1. Print 1-255
  void print1To255() {
    for (int i = 1; i <= 255; i++) {
      System.out.println(i);
    }
  }

  // 2. Print Odds 1-255
  void printOdds1To255() {
    for (int i = 1; i <= 255; i += 2) {
      System.out.println(i);
    }
  }

  // 3. Print Ints and Sum 0-255
  void printIntsAndSum0To255() {
    int sum = 0;
    for (int i = 0; i <= 255; i++) {
      sum += i;
      System.out.println(i + " " + sum);
    }
  }

  // 4. Iterate and Print Array Values
  // void printArrayVals(int[] items) {
  // so that we can accept an Array List instead
  void printArrayVals(ArrayList<Object> items) {
    for (Object item : items) {
      System.out.println(item);
    }
  }

  // 5. Find and Print Max
  // Given an array, find and print its largest element.
  void printMaxOfArray(int[] nums) {
    int max = 0;
    for (int num : nums) {
      if (num > max) {
        max = num;
      }
    }
    System.out.println(max);
  }

  // 6. Get and Print Average
  // Analyze an array’s values and print the average.
  void printAverageOfArray(int[] nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    System.out.println(sum / (nums.length));
  }

  // 7. Array with Odds
  // Create an array with all the odd integers between 1 and 255 (inclusive).
  ArrayList<Integer> returnOddsArray1To255() {
    ArrayList<Integer> oddArray = new ArrayList<Integer>();
    for (int i = 1; i <= 255; i += 2) {
      oddArray.add(i);
    }
    System.out.println(oddArray.toString()); // Object => String
    return oddArray;
  }

  // 8. Square the Values
  // Square each value in a given array, returning that same array with changed
  // values.
  ArrayList<Integer> squareArrayVals(ArrayList<Integer> nums) {
    ArrayList<Integer> squaredArray = new ArrayList<Integer>();
    for (Integer num: nums ) {
      squaredArray.add(num * num);
    }
    System.out.println(squaredArray.toString()); // Object => String
    return squaredArray;
    
  }

  


}