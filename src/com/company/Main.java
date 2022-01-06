package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String[] st = {"A","B","C","D"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente a name's student: ");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < st.length;i++){
            if (st[i].equals(input_name)){
                System.out.println("Position of the students in the list " + input_name + " is " + (i +1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found" + input_name + " int the list");
    }
}
