package patient.view.commands;

import patient.view.ConsoleUI;


public class SortByAge extends Command{
    @Override
    public void execute(){
        consoleUI.sortByAge();
    }

    public SortByAge(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Отсортировать список пациентов по возрасту";
    }
}
