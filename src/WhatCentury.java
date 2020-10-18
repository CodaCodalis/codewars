public class WhatCentury {
    public static String whatCentury(int year) {
        int cent;
        String century;
        String ending;
        cent = year / 100;
        if (year / 10 % 10 == 0 || cent % 10 == 0) {
            cent = cent;
        } else {
            cent = cent + 1;
        }
        if (cent == 11 | cent == 12 | cent == 13) {
            ending = "th";
        } else if (cent % 10 == 1) {
            ending = "st";
        } else if (cent % 10 == 2) {
            ending = "nd";
        } else if (cent % 10 == 3) {
            ending = "rd";
        } else {
            ending = "th";
        }
        String begin = String.valueOf(cent);
        century = begin + ending;
        return century;
    }
    public static void main(String[] args) {
        System.out.println(whatCentury(1927));
        System.out.println(whatCentury(1999));
        System.out.println(whatCentury(2011));
        System.out.println(whatCentury(2259));
        System.out.println(whatCentury(1059));
        System.out.println(whatCentury(1159));
        System.out.println(whatCentury(2000));
        System.out.println(whatCentury(7580));
        System.out.println(whatCentury(2100));
    }
}