package services;

import interf.SortingStrategy;
import interf.impl.CgpaThenNameThenIdSortingStrategy;
import model.Student;
import utils.Input;

import java.util.List;
import java.util.Scanner;

public class StudentFacade {

    private final DataManager dataManager;


    public StudentFacade() {
        this.dataManager = new DataManager();
    }

    public void createAndSortStudents() {
        Scanner scanner = Input.getInstance();
        dataManager.create(scanner);
        SortingStrategy strategy = new CgpaThenNameThenIdSortingStrategy();
        dataManager.sortUsingStrategy(strategy);

    }

    public void createStudents() {
        Scanner scanner = Input.getInstance();
        dataManager.create(scanner);
    }

    public List<Student> getStudents() {
        return dataManager.getStudents();
    }

    public void displayStudents() {
        dataManager.getStudents().forEach(System.out::println);
    }

}
