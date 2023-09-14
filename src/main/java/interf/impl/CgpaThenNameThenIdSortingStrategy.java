package interf.impl;

import interf.SortingStrategy;
import model.Student;

import java.util.Comparator;
import java.util.List;

public class CgpaThenNameThenIdSortingStrategy implements SortingStrategy {
    @Override
    public void sort(List<Student> students) {
       students.sort(Comparator.comparingDouble(Student::getCgpa)
                .reversed()
                .thenComparing(Student::getFirstName)
                .thenComparing(Student::getId));
    }
}
