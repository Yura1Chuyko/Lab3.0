package task3;

import java.util.List;
import java.util.stream.Collectors;

public class StudentSimple {
    private long id;
    private String name;
    private String lastname;

    public StudentSimple() { }

    public StudentSimple(final Student students) {
        this.name = students.getName();
        this.lastname = students.getLastname();
        this.id = students.getId();
    }

    public List<StudentSimple> transformed(final List<Student> students) {
        return students.stream()
                .map(StudentSimple::new)
                .collect(Collectors.toList());
    }
}