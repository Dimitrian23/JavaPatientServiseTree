package patient.model.operations;

import patient.model.entity.comparators.PatientComparatorByAge;
import patient.model.entity.comparators.PatientComparatorByName;
import patient.model.entity.comparators.PatientComparatorByTime;
import patient.model.operations.iterators.PatientIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PatientListManager<E extends PatientMethod> implements Iterable<E> {
    private List<E> patientList;

    public PatientListManager() {
        patientList = new ArrayList<>();
    }

    public void addPatient(E patient) {

        patientList.add(patient);
    }

    @Override
    public Iterator<E> iterator() {
        return new PatientIterator<>(patientList);
    }

    public void sortByName() {
        patientList.sort(new PatientComparatorByName());
    }

    public void sortByTime() {
        patientList.sort(new PatientComparatorByTime());
    }
    public void sortByAge() {
        patientList.sort(new PatientComparatorByAge());
    }
}
