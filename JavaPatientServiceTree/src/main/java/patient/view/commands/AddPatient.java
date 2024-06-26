package patient.view.commands;

import patient.view.ConsoleUI;

public class AddPatient extends  Command{

    public AddPatient(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Добавить пациента";
    }

    @Override
    public void execute(){
        consoleUI.addPatient();
    }
}
