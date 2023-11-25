package Lesson_5;



/*
Задание 1:
Создать классы Собака и Кот с наследованием от класса Животное.

Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
препятствия. Результатом выполнения действия будет печать в консоль.
(Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');

У каждого животного есть ограничения на действия
(бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).

Добавить подсчет созданных котов, собак и животных.

Расширить задачу про котов и тарелки с едой, выполнив следующие пункты:
Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
(например, в миске 10 еды, а кот пытается покушать 15-20).
Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
Если коту удалось покушать (хватило еды), сытость = true.
Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
Создать массив котов и тарелку с едой, попросить всех котов покушать
из этой тарелки и потом вывести информацию о сытости котов в консоль.
Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

*/
public class Animals {
    String type;
    String name;
    String color;
    int weight;
    private static int count;
    int run;
    int swim;


    public Animals(String type, String name, String color, int weight) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.weight = weight;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void infoAnimal() {
        System.out.println(this.type + ": " + name + ", цвет: " + color + ", вес: " + weight);
    }

    protected void runAnimals(int distance) {
    }

    protected void swimAnimals(int distance) {

    }

    public void infoStatusHungry() {
    }

    public void eat(Plate plate) {
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////
class Cat extends Animals {
    private static int count;
    private boolean hungry;
    int appetite;

    public Cat(String type, String name, String color, int weight, int appetite) {
        super(type, name, color, weight);
        this.appetite = appetite;
        this.hungry = true;
        count++;
    }

    @Override
    public void infoAnimal() {
        super.infoAnimal();
    }



    public static int getCount() {
        return count;
    }

    @Override
    protected void runAnimals(int distance) {
        this.run = 200;
        if (run >= distance) {
            System.out.println(name + " успешно пробежал дистанцию " + distance + " м");

        } else {
            System.out.println(type + " максимально может пробежать: " + run + " м");
        }
    }

    @Override
    protected void swimAnimals(int distance) {
        System.out.println(type + " не умеет плавать");
    }

    public void infoStatusHungry() {
        String Status = !hungry ? "сыт" : "голоден";
        System.out.println(name + ": " + Status);
    }

    public void eat(Plate plate) {
        if (hungry && plate.minusFood(appetite))
            hungry = false;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////
class Dog extends Animals {
    private static int count;

    public Dog(String type, String name, String color, int weight) {
        super(type, name, color, weight);
        count++;
    }

    @Override
    public void infoAnimal() {
        super.infoAnimal();
    }

   public static int getCount() {
        return count;
    }

    @Override
    protected void swimAnimals(int distance) {
        this.swim = 10;
        if (run >= distance) {
            System.out.println(name + " успешно проплыл дистанцию " + distance + " м");

        } else {
            System.out.println(type + " максимально может проплыть: " + run + " м");
        }
    }

    @Override
    protected void runAnimals(int distance) {
        this.run = 500;
        if (run >= distance) {
            System.out.println(name + " успешно пробежал дистанцию " + distance + " м");

        } else {
            System.out.println(type + " максимально может пробежать: " + run + " м");
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////
class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean minusFood(int n) {
        int minus = food - n;
        if (minus < 0)
            return false;
        food = food - n;
        return true;
    }

    public void addFood (int food) {
        this.food = food+food;
    }

    public void infoPlate() {
        System.out.println("В тарелке: " + food + " г. корма");
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////
class ActionAnimals {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.infoPlate();
        Animals[] animals = new Animals[6];
        animals[0] = new Cat("кот", "Барсик", "рыжий", 10, 50);
        animals[1] = new Cat("кот", "Пушок", "белый", 7, 70);
        animals[2] = new Dog("собака", "Тузик", "рыжий", 15);
        animals[3] = new Dog("собака", "Бим", "черный", 12);
        animals[4] = new Dog("собака", "Бобик", "серый", 19);
        animals[5] = new Dog("собака", "Тимка", "черный", 13);
        for (int i = 0; i < 6; i++) {
            animals[i].infoAnimal();
            animals[i].runAnimals(300);
            animals[i].swimAnimals(10);
            animals[i].eat(plate);
            animals[i].infoStatusHungry();
        }
        System.out.println("Всего котов создано: " + Cat.getCount());
        System.out.println("Всего собак создано: " + Dog.getCount());
        System.out.println("Всего животных создано: " + Animals.getCount());
    }
}



