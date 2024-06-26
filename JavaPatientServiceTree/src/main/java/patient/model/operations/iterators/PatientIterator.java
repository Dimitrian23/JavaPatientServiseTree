package patient.model.operations.iterators;

import java.util.Iterator;
import java.util.List;

public class PatientIterator<E> implements Iterator<E> {
    private int index;
    private List<E> patientList;

    public PatientIterator(List<E> patientList) {
        this.patientList = patientList;
    }

    @Override
    public boolean hasNext() {
        return index < patientList.size();
    }

    @Override
    public E next() {
        return patientList.get(index++);
    }
}
