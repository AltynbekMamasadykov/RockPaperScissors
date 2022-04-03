package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rps = {"Rock","Paper","Scissors"};
        String computerMove = rps[new Random().nextInt(rps.length)];
        System.out.println(computerMove);

    }
}
