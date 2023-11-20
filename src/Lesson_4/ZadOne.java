package Lesson_4;

public class ZadOne {
    public static void main(String[] args) {
        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Петров Петр ", "директор","a@mail.ru",
                "430021",4000,47);
        employees[1] = new Employees("Иванов Иван ", "юрист","a@mail.ru",
                "430022",2000,35);
        employees[2] = new Employees("Сергеев Сергей ", "экономист","a@mail.ru",
                "430023",2000,52);
        employees[3] = new Employees("Сидоров Максим ", "водитель","a@mail.ru",
                "430024",2000,30);
        employees[4] = new Employees("Степанов Вячеслав ", "бухгалтер","a@mail.ru",
                "430025",2500,54);
        for (int i = 0; i < employees.length; i++)
            if (employees[i].getAge() > 40) {
                employees[i].print();
            }
    }
}
