package patient.view.commands;

import patient.view.ConsoleUI;

public class SortByName extends Command{
    @Override
    public void execute(){
        consoleUI.sortByName();
    }

    public SortByName(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Отсортировать список пациентов по имени";
    }
}
