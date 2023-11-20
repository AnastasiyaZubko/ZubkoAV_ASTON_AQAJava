package Lesson_4;

public class Park {
    private String parkName;
    private String parkAddress;
    private String phoneNumber;
    private String email;
    public Park(String parkName,String parkAddress, String phoneNumber, String email){
        this.parkName = parkName;
        this.parkAddress = parkAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
     class Carousel{
        private String nameCarousel;
        private String timeOpen;
        private String timeClose;
        private int price;

         Carousel(String nameCarousel, String timeOpen, String timeClose, String price) {
             System.out.println("Название карусели: "+nameCarousel+", Режим работы: с "+
                     timeOpen+" до "+timeClose+", Стоимость: "+price);
             }
     }
     public void show(){
         System.out.println("Название парка: "+parkName+", Адрес: "+ parkAddress+
                 ", Номер телефона: "+phoneNumber+", Email: "+email);
         }
}
