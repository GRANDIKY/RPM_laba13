package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String standartIP =
            "\\b((25[0-5]|2[0-4]\\d|1\\d\\d|\\d\\d|\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|\\d\\d|\\d)\\b";

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Pattern pattern = Pattern.compile(standartIP);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(
                "C:\\Users\\12\\IdeaProjects\\laba_13\\log.txt"))) {
            System.out.println("Input the string");
            String str = in.nextLine();
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                writer.write(matcher.group());
            } else {
                writer.write("No IP address");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}