package Lesson_4;

public class Park {

    public static class Carousel {
        private final String carouselName;
        private final String timeOpen;
        private final int price;
        private final String timeClose;

        public Carousel(String carouselName, int price, String timeOpen, String timeClose) {
            this.carouselName = carouselName;
            this.price = price;
            this.timeOpen = timeOpen;
            this.timeClose = timeClose;
        }

        @Override
        public String toString() {
            return  carouselName +  " \n" +
                    "стоимость: " + price + " руб " +
                    "время работы: " + " c "+timeOpen + " до " + timeClose;
        }
    }

}
