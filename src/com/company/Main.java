package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(100));
            if (numbers.get(i)%2==0) {
               evenNumbers.add(numbers.get(i));
            }else {
                oddNumbers.add(numbers.get(i));
            }
        }
        System.out.println(numbers);
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);









    }

}

