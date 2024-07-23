import java.time.LocalTime;


public class AirTrip {
    private String destination;
    private int flightNumber;
    private LocalTime flightTime;


    public AirTrip(String destination,int flightNumber,LocalTime flightTime){
        this.destination=destination;
        this.flightNumber=flightNumber;
        this.flightTime=flightTime;
    }
    public void flightStatus(){
        if (flightTime.isAfter(LocalTime.now())) {
            System.out.println("Take Off");
        }
        else if (flightTime.isBefore(LocalTime.now())){
            System.out.println("Flight has delayed");
        }
        else if(flightTime.equals(LocalTime.now())){
            System.out.println("Taking passengers");
        }
    }

    public static void main(String[] args) {
        AirTrip trip1 = new AirTrip("ahvaz",4,LocalTime.of(10,50,30,00));
        AirTrip trip2 = new AirTrip("sari",5,LocalTime.of(10,10,30,00));
        AirTrip trip3 = new AirTrip("istanbul",74,LocalTime.of(8,50,30,00));
        AirTrip trip4 = new AirTrip("dubai",402,LocalTime.of(17,50,30,00));
        AirTrip trip5 = new AirTrip("tokiyo",452,LocalTime.now());
        trip5.flightStatus();
        trip1.flightStatus();
        trip2.flightStatus();
        trip3.flightStatus();
        trip4.flightStatus();
    }
}
