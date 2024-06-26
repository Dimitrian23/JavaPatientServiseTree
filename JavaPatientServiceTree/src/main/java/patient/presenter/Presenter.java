package patient.presenter;

import patient.model.service.Service;
import patient.view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addPatient(String name, int age, int time, boolean isInList) {
        service.addPatient(name, age, time, isInList);
        view.printAnswer("Patient added successfully.");
        getPatientListInfo();
    }

    public void getPatientInfo(int id) {
        String info = service.getPatientInfo();
        view.printAnswer(info);
    }

    public void getPatientListInfo() {
        String info = service.getPatientInfo();
        view.printAnswer(info);
    }

    public void sortByTime() {
        service.sortByTime();
        view.printAnswer("Patients sorted by time successfully.");
        getPatientListInfo();
    }

    public void sortByName() {
        service.sortByName();
        view.printAnswer("Patients sorted by name successfully.");
        getPatientListInfo();
    }
    public void sortByAge() {
        service.sortByAge();
        view.printAnswer("Patients sorted by age successfully.");
        getPatientListInfo();
    }
}