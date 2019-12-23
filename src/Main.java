import com.skillbox.airport.*;

public class Main {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        System.out.println(airport.getAllAircrafts().toString().replace(",", "\n"));
    }
}
