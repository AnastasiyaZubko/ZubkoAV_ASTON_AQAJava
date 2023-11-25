package Lesson_5;
/*
Задание 2:
Применяя интерфейсы написать программу расчета периметра и площади геометрических фигур: круг, прямоугольник, треугольник.
Задать для каждой фигуры цвет заливки и цвет границы.
Результат полученных характеристик [ Периметр, площадь, цвет фона, цвет границ ] по каждой фигуре вывести в консоль.

 */
public interface Calculating {
    double calculatingArea();

    double calculatingPerimeter();
}
class FigureInfo {

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        figures[0] =new Circle("круг", 3.0, "зеленый", "желтый");
        figures[1] =new Square("квадрат", 2.0, "розовый", "черный");
        figures[2] =new Triangle("треугольник", 25.0, 5.0, "красный", "черный");
        figures[3] =new Circle("круг", 8.0, "белый", "черный");
        figures[4] =new Square("квадрат", 10.0, "черный", "черный");
        figures[5] =new Triangle("треугольник", 8.0, 5.0, "коричневый", "черный");

        for(int i = 0; i < 6; i++) {
            figures[i].info();
        }

    }
}
//////////////////////////////////
class Figure implements Calculating {
    String type;
    double area;
    double perimeter;
    String color1;
    String color2;

    public Figure(String type, String color1, String color2) {
        this.type = type;
        this.color1 = color1;
        this.color2 = color2;
    }

    public double calculatingArea() {

        return this.area;
    }

    public double calculatingPerimeter() {

        return this.perimeter;
    }

    public void info() {
        this.area = this.calculatingArea();
        this.perimeter = this.calculatingPerimeter();
    }
}
////////////////////////////////////////////////////////
class Circle extends Figure implements Calculating {
    double radius;

    public Circle(String type, double radius, String color1, String color2) {
        super(type, color1, color2);
        this.radius = radius;
    }

    public void info() {
        this.area = this.calculatingArea();
        this.perimeter = this.calculatingPerimeter();
        System.out.println(this.type + ", площадь: " + this.area + ", периметр: " + this.perimeter + ", цвет фона: " + this.color1 + ", цвет контура:" + this.color2);
    }

    public double calculatingArea() {
        super.calculatingArea();
        this.area = Math.PI * this.radius * 2.0;
        return this.area;
    }

    public double calculatingPerimeter() {
        super.calculatingPerimeter();
        this.perimeter = Math.PI * this.radius * this.radius;
        return this.perimeter;
    }
}
/////////////////////////////////////////////////////////////
class Square extends Figure implements Calculating {
    double side;

    public Square(String type, double side, String color1, String color2) {
        super(type, color1, color2);
        this.side = side;
    }

    public double calculatingArea() {
        this.area = this.side * this.side;
        return this.area;
    }

    public double calculatingPerimeter() {
        this.perimeter = this.side * 4.0;
        return this.perimeter;
    }

    public void info() {
        this.area = this.calculatingArea();
        this.perimeter = this.calculatingPerimeter();
        System.out.println(this.type + ", площадь: " + this.area +
                ", периметр: " + this.perimeter + ", цвет фона: "
                + this.color1 + ", цвет контура:" + this.color2);
    }
}
///////////////////////////////////////////////////////////////////
class Triangle extends Figure implements Calculating {
    double side;
    double height;

    Triangle(String type, double side, double height, String color1, String color2) {
        super(type, color1, color2);
        this.side = side;
        this.height = height;
    }

    public double calculatingArea() {
        this.area = this.side * this.height / 2.0;
        return this.area;
    }

    public double calculatingPerimeter() {
        this.perimeter = this.side + this.side + this.side;
        return this.perimeter;
    }

    public void info() {
        this.area = this.calculatingArea();
        this.perimeter = this.calculatingPerimeter();
        System.out.println(this.type + ", площадь: " + this.area + ", периметр: " + this.perimeter + ", цвет фона: " + this.color1 + ", цвет контура:" + this.color2);
    }
}
