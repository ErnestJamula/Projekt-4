import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner scanner = new Scanner(System.in);
      int choice;
      do {
        System.out.println("Wybierz opcję:");
        System.out.println("1. Wprowadzenie studentów");
        System.out.println("2. Wyświetlenie listy studentów");
        System.out.println("3. Zakończ program");
        choice = scanner.nextInt();
        scanner.nextLine();  
        switch (choice) {
          case 1:
            System.out.println("Podaj imie studenta:");
            String name = scanner.nextLine();
            System.out.println("Podaj wiek studenta:");
            int age = scanner.nextInt();
            Student newStudent = new Student(name, age);
            s.addStudent(newStudent);
            System.out.println("Student dodany!\n");
            break;
          case 2:
            var students = s.getStudents();
            System.out.println("\nLista studentów:");
            for (Student current : students) {
              System.out.println(current.ToString());
            }
            System.out.println();
            break;
          case 3:
            System.out.println("Zamykanie programu...");
            break;
          default:
            System.out.println("Niepoprawny wybór, spróbuj ponownie.\n");
        }
      } while (choice != 3);
    } catch (IOException e) {
      System.out.println("Błąd podczas operacji na pliku: " + e.getMessage());
    }
  }
}