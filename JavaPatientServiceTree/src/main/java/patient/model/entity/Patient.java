package patient.model.entity;

import patient.model.operations.PatientMethod;

public class Patient implements Comparable<Patient>, PatientMethod {
    private int id; // Уникальный идентификатор пациента
    private String name; // Имя пациента
    private int age; // Возраст пациента
    private int time; // Время приема пациента
    private boolean isInList; // Флаг, указывающий, записан ли пациент в больнице
    private static int nextId = 1; // Статическое поле для автоматической генерации ID

    // Конструктор класса, принимающий имя, возраст, время приема и флаг записи в больницу
    public Patient(String name, int age, int time, boolean isInList) {
        this.id = nextId++; // При создании нового объекта автоматически генерируется новый ID
        this.name = name;
        this.age = age;
        this.time = time;
        this.isInList = isInList;
    }

    // Геттер для поля id
    public int getId() {
        return id;
    }

    // Геттер для поля name
    public String getName() {
        return name;
    }

    // Геттер для поля age
    public int getAge() {
        return age;
    }

    // Геттер для поля time
    public int getTime() {
        return time;
    }

    // Геттер для поля isInList
    public boolean isInList() {
        return isInList;
    }

    // Сеттер для поля name
    public void setName(String name) {
        this.name = name;
    }

    // Сеттер для поля age
    public void setAge(int age) {
        this.age = age;
    }

    // Сеттер для поля time
    public void setTime(int time) {
        this.time = time;
    }

    // Сеттер для поля isInList
    public void setInList(boolean inList) {
        isInList = inList;
    }

    // Реализация метода compareTo для сравнения пациентов по имени
    @Override
    public int compareTo(Patient o) {
        return this.name.compareTo(o.getName());
    }
}