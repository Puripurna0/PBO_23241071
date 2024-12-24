package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // membuat objek
        HeroTank hero2 = new HeroTank("Balmod", 200, 100);
        HeroTank hero3 = new HeroTank("Jhonson", 200, 300);

        hero2.cetak();
        hero3.cetak();
    }
}