package entities;

import interfaces.Management;
import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public class StudentManagement implements Management {
    public StudentManagement() {
    }

    @Override
    public void displayStudents(List<Student> students, Consumer<Student> con) {
        students.forEach(con);
    }

    @Override
    public void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con) {
        students.stream()
                .filter(pre)
                .forEach(con);
    }

    @Override
    public String returnStudentsNames(List<Student> students, Function<Student, String> fun) {
        String names = "|";
        for (Student s : students)
            names+= fun.apply(s)+"|";
        return names;
    }

    @Override
    public Student createStudent(Supplier<Student> sup) {
        return sup.get();
    }

    @Override
    public List<Student> sortStudentsById(List<Student> students, Comparator<Student> com) {
        students.sort(com);
        return students;
    }

    @Override
    public Stream<Student> convertToStream(List<Student> students) {
        return students.stream();
    }
}
