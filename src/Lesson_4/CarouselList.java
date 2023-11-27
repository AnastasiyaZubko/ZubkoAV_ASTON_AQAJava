package Lesson_4;

import java.util.ArrayList;
import java.util.List;

public class CarouselList {
    private static final List<Park.Carousel> carouselList = new ArrayList<>();

    static {
        carouselList.add(0, new Park.Carousel("Веселые Горки", 5, "10.00", "20.00"));
        carouselList.add(1, new Park.Carousel("Колесо обозрения", 10, "10.00", "20.00"));
        carouselList.add(2, new Park.Carousel("Батут", 2, "10.00", "18.00"));
    }

    public static List<Park.Carousel> getCarouselList() {
        return carouselList;
    }
}

class InfoCarousel {
    public static void main(String[] args) {
        System.out.println("Парк Атракционов Веселушки ");
        for (int i = 0; i < CarouselList.getCarouselList().size(); i++) {
            System.out.println(CarouselList.getCarouselList().get(i));
        }
    }
}