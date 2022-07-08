package com.example.Baitap.Baitap2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AplicationBaitap2 {
    public static final Pattern check = Pattern.compile(
            "[B][1-9]",Pattern.CASE_INSENSITIVE);

    public static void checkIdStudent(String id){
        Matcher matcher = check.matcher(id);
        if (matcher.find()){
            System.out.println("Id student hợp lệ !");
        }else {
            System.out.println("Id student không hợp lệ !");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID :");
        String id = scanner.next();
        checkIdStudent(id);
    }
}
