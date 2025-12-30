import java.time.ZoneId;

public class Main {

    public static void main(String[] args) {
        // creating ZoneId for California
       ZoneId CaliforniaZone = ZoneId.of("America/Los_Angeles");
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        
  System.out.println("Time Zone ID: " + CaliforniaZone);
    System.out.println("Time Zone ID: " + newYorkZone);
    }
}
