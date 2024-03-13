interface User{
    void Login(String login);
    void Password(String password);
}

abstract class People implements User{
    private String FIO;
    private int age;
    private String work;

    People(String FIO, int age, String work){
        this.FIO = FIO;
        this.age = age;
        this.work = work;
    }

    public String getFIO(){
        return this.FIO;
    }

    public int getAge(){
        return this.age;
    }

    public String getWork(){
        return this.work;
    }
}

class Teacher extends People{
    private String login;
    private String password;

    public void Login(String login){
        this.login = login;
    }

    public void Password(String password){
        this.password = password;
    }
    Teacher(String FIO, int age, String work){
        super(FIO, age, work);
    }
}

class Student extends People{
    private String login;
    private String password;

    public void Login(String login){
        this.login = login;
    }

    public void Password(String password){
        this.password = password;
    }
    Student(String FIO, int age, String work){
        super(FIO, age, work);
    }
}
public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Иванов А. А.", 35, "Учитель математики");
        Teacher teacher2 = new Teacher("Петров П. П.", 40, "Учитель физики");

        Student student1 = new Student("Иванов А. А.", 18, "Студент 1 курса");
        Student student2 = new Student("Петров П. П.", 20, "Студент 2 курса");

        System.out.println(student1.getAge());

        teacher1.Login("mail1@mail.ru");
        teacher1.Password("1234567");
    }
}
