package com.functional.interfaces4;

@FunctionalInterface
interface College {

    public String fees(String name, String branch, int price, String date);
}

public class Main1 {

    public static void main(String[] args) {

        College c = (name, branch, price, date) -> {
            System.out.println("Information is " + name + " : Branch " + branch + " : Price " + price + " : Date " + date);
            return "Happy : 500%";
        };


        System.out.println(c.fees("Lavkush", " B.Tech ", 56000, "23/29/2026"));
    }
}
