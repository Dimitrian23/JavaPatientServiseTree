package patient.view;

import patient.view.commands.*;
import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private List<Command> commandList; // Список доступных команд

    // Конструктор, инициализирующий список команд
    public MainMenu(ConsoleUI consoleUI) {
        commandList = new ArrayList<>();
        commandList.add(new AddPatient(consoleUI)); // Добавление пациента
        commandList.add(new GetPatientInfo(consoleUI)); // Информация о пациентах
        commandList.add(new SortByName(consoleUI)); // Сортировка по имени
        commandList.add(new SortByTime(consoleUI)); // Сортировка по времени
        commandList.add(new Finish(consoleUI)); // Завершение работы
    }

    // Метод для формирования меню команд
    public String menu() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Choose an option:\n");
        for (int i = 0; i < commandList.size(); i++) {
            stringBuilder.append((i + 1)).append(". ").append(commandList.get(i).getDescription()).append("\n");
        }
        return stringBuilder.toString();
    }

    // Метод для выполнения выбранной команды
    public void execute(int choice) {
        if (choice > 0 && choice <= commandList.size()) {
            commandList.get(choice - 1).execute();
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    // Метод для получения количества доступных команд
    public int getSize() {
        return commandList.size();
    }
}