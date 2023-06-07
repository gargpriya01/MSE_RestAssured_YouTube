package awaitilityExamples;

import org.awaitility.Awaitility;

import java.time.Duration;

public class CreateBookingTests {
    public static void main(String[] args) {
        /*for(int i=0;i<5;i++){
            if (CreateBooking.createBooking()==200)
                break;
        }*/

        /*way 2
        Awaitility.await().atMost(Duration.ofSeconds(30))
                .pollInterval(Duration.ofSeconds(2))
                .until(()->CreateBooking.createBooking()==200);*/

        //way 3 with any parameter in method
        String url="https://restful.boooker.herekuapp.com/booking";
        Awaitility.await().atMost(Duration.ofSeconds(30))
                .pollInterval(Duration.ofSeconds(2))
                .until(()->CreateBooking.createBooking(url)==200);
    }
}
