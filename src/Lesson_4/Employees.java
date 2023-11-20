package Lesson_4;

public class Employees {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    public Employees(String fio, String position,String email,
                     String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void print(){
        System.out.println("ФИО: "+fio+", должность: "+position+
                ", email: "+email+", телефон: "+phone+", зарплата: "+
                salary+", возраст: "+age);
    }
}
