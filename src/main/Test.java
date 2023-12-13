package main;

import entities.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Student[] l = new Student[] {
                new Student(3,"3",3),
                new Student(1,"1",1),
                new Student(2,"2",2)
        };
        List<Student> list = Arrays.asList(l);
        StudentManagement sm = new StudentManagement();
        System.out.println("Liste des etudiants :");
        sm.displayStudents(list,System.out::println);
        System.out.println("Liste des etudiants ayant un id>1 :");
        sm.displayStudentsByFilter(list,student -> student.getId()>1,System.out::println);
        System.out.println("Les noms des etudiants sont :");
        System.out.println(sm.returnStudentsNames(list,Student::getNom));
        System.out.println("Creer un nouveau etudiant :");
        System.out.println(sm.createStudent(Student::new));
        System.out.println("Liste des etudiants triee par id :");
        sm.sortStudentsById(list, Comparator.comparingInt(Student::getId));
        sm.displayStudents(list,System.out::println);
        System.out.println("Liste converti en Stream :");
        sm.convertToStream(list).forEach(System.out::println);
    }
}
