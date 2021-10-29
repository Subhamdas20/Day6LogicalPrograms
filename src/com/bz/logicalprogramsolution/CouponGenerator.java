package com.bz.logicalprogramsolution;

import java.util.*;

public class CouponGenerator {
    /*
    *Used couponGenerator method to generate random coupons
    * Used randomCharGenerator to generate random characters for coupon
    */

    String couponChar, coupon;
    public void couponGenerator() {
        Scanner couponInput = new Scanner(System.in);
        System.out.println("Please enter number of coupons to generate: ");
        int numberOfCoupons = couponInput.nextInt();
        for (int i = 0; i < numberOfCoupons; i++) {
            randomCharGenerator();
            coupon = (couponChar + (i + ""+(i*3)));
            System.out.println("---" + coupon + "---");
        }
    }

    public void randomCharGenerator() {
        int numInCoupon;
        int intToChar = (int) (5 * Math.random() + 1);
        if (intToChar == 1) {
            numInCoupon = (int) (9 * Math.random() + 1);
            couponChar = ("A" + numInCoupon);
        } else if (intToChar == 2) {
            numInCoupon = (int) (9 * Math.random() + 1);
            couponChar = ("B" + numInCoupon);
        } else if (intToChar == 3) {
            numInCoupon = (int) (9 * Math.random() + 1);
            couponChar = ("C" + numInCoupon);
        } else if (intToChar == 4) {
            numInCoupon = (int) (9 * Math.random() + 1);
            couponChar = ("D" + numInCoupon);
        } else if (intToChar == 5) {
            numInCoupon = (int) (9 * Math.random() + 1);
            couponChar = ("E" + numInCoupon);
        }
    }

    public static void main(String[] args) {
        CouponGenerator coupons = new CouponGenerator();
        coupons.couponGenerator();
    }
}
