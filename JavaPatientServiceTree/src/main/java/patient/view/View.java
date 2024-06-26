package patient.view;

// Интерфейс View, определяющий методы для отображения информации и запуска приложения
public interface View {
    // Метод для вывода ответа пользователю
    void printAnswer(String text);
    // Метод для запуска приложения
    void start();
}