package pl.home.cb.cmd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Type text!");
        Scanner echo = new Scanner(System.in);
        String echoText = echo.nextLine();
        System.out.println(echoText);
    }
}
