package com.tonghs.java.lambda_demo;

/**
 * EatableDemo class
 *
 * @author tonghs
 * @date 2021/06/26
 */
public class EatableDemo {
    public static void main(String[] args) {
//        callEatable(new Eatable() {
//            @Override
//            public void eat() {
//                System.out.println("a apple");
//            }
//        });

//        callEatable( (String food, String food1) -> {
//            System.out.println("a " + food + food1);
//            return food + food1;
//        });

        callEatable((food, food1) -> {
            System.out.println("a " + food + food1);
            return food + food1;
        });
    }

    private static void callEatable(Eatable e) {
        String s = e.eat("Apple", "ooo");
        System.out.println(s);
    }
}
