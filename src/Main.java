import java.awt.Color;
import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {

        Car car = new Car( 1965, 4, LocalDate.of(1964,11,19), 312476, Color.WHITE, Models.MUSTANG);
        car.Print();


    }


}
