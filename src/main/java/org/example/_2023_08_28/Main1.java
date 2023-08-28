package org.example._2023_08_28;

public class Main1 {
    int a = 5;
    static String s = "hello";

    // x = 10
    // x + y = 25
    //
    private static void m1(int a) {
        // save(a)
    }

    public void get(int a) {
        m1(a);
        System.out.println(a + 15);
    }

    public int returnMinValue(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public int[] m2() {
        return null;
    }

    private int sumArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        int sum = 0;

        while (left <= right) {
            if (left == right) {
                sum += array[left];
                break;
            } else {
                sum = sum + array[left] + array[right];
                left++;
                right--;
            }
        }
        return sum;
    }

    public int returnSum (int[] arr) {
        if (arr.length == 0) return 0;
        int result = 0;

        if (arr.length%2==1){
            result = arr[arr.length/2];
        }

        for (int i = 0; i < arr.length/2; i++) {
            result += arr[i] + arr[arr.length-1-i];
        }
        return result;
    }


    public static void main(String[] args) {
        int[] qaa = {31, 21, 45, 6, 98, 7};

    }
}