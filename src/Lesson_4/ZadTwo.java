package Lesson_4;

public class ZadTwo {
    public static void main (String [] args){
        Park park = new Park("Веселушки","Минск," +
                " ул Дружбы 45","+375298000000", "veselushki@mail.ru");
        park.show();
        Park.Carousel carousel1 = park.new Carousel("Колесо обозрения",
                "10.00", "24.00","10 руб");
        Park.Carousel carousel2 = park.new Carousel("Веселые горки",
                "10.00", "24.00","5 руб");
        Park.Carousel carousel3 = park.new Carousel("Кораблики",
                "10.00", "18.00","2 руб");

    }
}
