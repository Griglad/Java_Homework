package services;

import interf.SortingStrategy;
import model.Student;
import utils.InputValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public final class DataManager {
    private final List<Student> students = new ArrayList<>();

    public void create(Scanner scanner) {

        System.out.println("Please insert the number of students");

        String result = scanner.nextLine();

        IntStream.range(0, Integer.parseInt(result)).forEach(num -> {
            System.out.println("Please insert the id of student");
            int id = InputValidator.getValidPositiveInt(scanner);
            System.out.println("Please insert the name of student");
            String name = InputValidator.getValidName(scanner);
            System.out.println("Please insert the cgpa of student");
            double cgpa = InputValidator.getValidDoubleValue(scanner);
            Student s = new Student(id, name, cgpa);
            synchronized (this) {
                students.add(s);
            }
        });

    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void sortUsingStrategy(SortingStrategy strategy) {
        strategy.sort(students);
    }


}
