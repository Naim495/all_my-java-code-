
package com.mycompany.arrayapp; // <-- ADD THIS LINE
// The class definition starts here
public class ArrayApp {

    // 1. The main method is inside the class
    public static void main(String[] args) {

        // This call is perfect!
        int sum_Num = addNum(44, 66);
        int dev_num = remove(33,66);

        System.out.println("the result is : " + sum_Num + " and dev is : "+ dev_num);
    }

    // 2. The addNum method must ALSO be inside the class
    public static int addNum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    
    public static int remove(int a, int b){
        int dev = a-b;
        return dev;
    }

}
