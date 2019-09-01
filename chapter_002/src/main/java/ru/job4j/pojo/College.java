package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Петров Василий Семёнович");
        student.setGroup("Физ-19-4");
        student.setEnrolled(new Date());
        System.out.println("Студент: " + student.getFullName());
        System.out.println("Группа: " + student.getGroup());
        System.out.println("Поступил: " + student.getEnrolled());
    }
}
