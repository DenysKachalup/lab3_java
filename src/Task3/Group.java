package Task3;

import java.util.*;
import java.util.stream.Collectors;

public class Group {
    private List<Student> students;

    public Group(final List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(final List<Student> students) {
        this.students = students;
    }

    public void addSubject(final List<Subject> subjects, final String name) {
        subjects.add(new Subject(name));

        for (final Student student : students) {
            student.getMarks().add(new Mark());
        }
    }

    @Override
    public String toString() {
        String res = "";                                       // Вивід інформації про студентів
        for (final Student student : students) {
            res += "Student { " + "name= " + student.getName() +
                    ", surName= " + student.getSurName();
            for (final Subject subject : student.getSubject()) {
                res += ", subject= " + subject.getNameSubject() + "{ ";
                for (final Integer txt : student.getMarks().get(student.getSubject().indexOf(subject)).getMark())
                    res += txt + " ";
                res += "}";
            }
            res += " }" + '\n';
        }
        return res;
    }

    public Student bestStudentStream() {
        return students.stream()
                .reduce((a, b) -> a.averageMark() > b.averageMark() ? a : b)
                .get();
    }

    public List<Student> filterStudent() {
        return students.stream()
                .filter(e -> e.averageMark() > 3)
                .toList();
    }

    public List<Student> sortGroup() {
        return students.stream()
                .sorted((o1, o2) -> {
            if (o1.getSurName() != o2.getSurName())
                return o1.getSurName().compareTo(o2.getSurName());
            else if (o1.getName()!= o2.getName())
                return o1.getName().compareTo(o2.getName());
            else return o1.getFatherName().compareTo(o2.getFatherName());
        }).collect(Collectors.toList());
    }

    public String printSurnameHyphen() {
        return students.stream()
                .map(Student::getSurName)
                .reduce((s1, s2) -> s1 + "-" + s2).orElse("No");
    }
}
