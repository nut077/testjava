package com.nut.test;

public class Bitwise {
    public static void main(String[] args) {
        System.out.println(10 >> 3);
        /*
            1 1 1 0
            1 0 1 0

            1 0 1 0 >> 0 1 0 1 == 5
            1 0 1 0 >> 0 0 1 0 == 5

            & === เหมือนกันทั้งสอง
            | === ตัวใดตัวหนึ่งเป็น 1 ก็ได้
            ^ === ทั้งสองตัวต้องมีค่าไม่เหมือนกัน
            >> === การขยับถัดไปของตำแหน่งตามจำนวน

         */

    }
}
