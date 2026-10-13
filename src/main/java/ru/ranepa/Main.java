package ru.ranepa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();

        System.out.print("Enter a course: ");
        int course = sc.nextInt();

        List<Integer> marks = new ArrayList<>();
        System.out.println("Enter marks (0 - end):");

        int x = -1;
        while (x != 0) {
            x = sc.nextInt();
            if (x != 0) {
                marks.add(x);
            }
        }

        Student student = new Student(name, course, marks);
        student.printReport();
    }
}
