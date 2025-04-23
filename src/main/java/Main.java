
import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Podaj imie studenta:");
      String name = scanner.nextLine();
      System.out.println("Podaj wiek studenta:");
      int age = scanner.nextInt();
      
      Student newStudent = new Student(name, age);
      s.addStudent(newStudent);

  
    } catch (IOException e) {
      System.out.println("Blad podczas operacji na pliku: " + e.getMessage());
    }
  }
}
