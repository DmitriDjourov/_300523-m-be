package org.example._2023_10_16;

public class StatEx {
    static int st = 0;
    int nonSt = 0;

    //    public static void main(String[] args) {
//        StatEx o1 = new StatEx();
//        StatEx o2 = new StatEx();
//        o1.nonSt = 777;
//        System.out.println(o2.nonSt);
//    }
    public static void main(String[] args) {
        StatEx o1 = new StatEx();
        StatEx o2 = new StatEx();
        StatEx.st = 777;
        System.out.println();
    }
}