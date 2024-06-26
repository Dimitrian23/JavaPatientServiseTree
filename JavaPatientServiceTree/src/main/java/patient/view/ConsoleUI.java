package patient.view;

import patient.presenter.Presenter;
import java.util.Scanner;

public class ConsoleUI implements View {
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu menu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new MainMenu(this);
    }

    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        System.out.println("Welcome to the Patient Management System!");
        while (work) {
            printMenu();
            execute();
        }
        System.out.println("Goodbye!");
    }

    public void finish() {
        work = false;
    }

    private void execute() {
        String line = scanner.nextLine();
        if (checkTextForInt(line)) {
            int numCommand = Integer.parseInt(line);
            if (checkCommand(numCommand)) {
                menu.execute(numCommand);
            }
        }
    }

    private boolean checkTextForInt(String text) {
        if (text.matches("[0-9]+")) {
            return true;
        } else {
            inputError();
            return false;
        }
    }

    private boolean checkCommand(int numCommand) {
        if (numCommand <= menu.getSize()) {
            return true;
        } else {
            inputError();
            return false;
        }
    }

    private void printMenu() {
        System.out.println(menu.menu());
    }

    private void inputError() {
        System.out.println("Invalid input. Please try again.");
    }

    public void addPatient() {
        System.out.println("Enter patient name:");
        String name = scanner.nextLine();
        System.out.println("Enter patient age:");
        int age = scanner.nextInt();
        System.out.println("Enter patient time:");
        int time = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.println("Is the patient in the list? (true/false)");
        boolean isInList = scanner.nextBoolean();
        presenter.addPatient(name, age, time, isInList);
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void getPatientInfo() {
        System.out.println("Enter patient ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        presenter.getPatientInfo(id);
    }

    public void sortByTime() {
        presenter.sortByTime();
    }
    public void sortByAge() {
        presenter.sortByTime();
    }
}