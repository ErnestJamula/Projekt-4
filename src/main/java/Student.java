pupublic class Student {
    private String Name;
    private String Surname;  
    private int Age;
    public Student(String name, String surname, int age) {
      Name = name;
      Surname = surname;  
      Age = age;
    }
    public String GetName() { return Name; }
    public String GetSurname() { return Surname; }  
    public int GetAge() { return Age; }
    public String ToString() {
      return Name + " " + Surname + " " + Integer.toString(Age); 
    }
    public static Student Parse(String str, Collection<Student> allStudents) {
      String[] data = str.split(" ");
      if (data.length != 3) {
        System.out.println("Znaleziono błędny format, oto lista studentów:\n");
        for (Student student : allStudents) {
          System.out.println(student.ToString() + "\n"); 
        }
        return null; 
      }
      return new Student(data[0], data[1], Integer.parseInt(data[2])); 
    }
  }