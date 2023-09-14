import services.StudentFacade;

public class App {

    public static void main(String[] args) {

        StudentFacade studentFacade = new StudentFacade();
        studentFacade.createAndSortStudents();
        studentFacade.displayStudents();
    }


}
