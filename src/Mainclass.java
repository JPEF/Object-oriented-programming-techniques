


import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class Mainclass {

    public static void main(String[] args) {
        Car c = new Car("xxx-666", "BMW", "525", 2000);
        Customer cust = new Customer("12345-xxx", "Pekka", "pekka@email.com");
        Date start = new Date();
        Calendar end = Calendar.getInstance();
        Rental rent = new Rental(c, cust, start, end);
        System.out.println(rent.toString());
    }
}
