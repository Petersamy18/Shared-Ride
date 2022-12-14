import user.CarOwner;
import user.Customer;

public class Trip {
    private Customer customer;
    private CarOwner carOwner;
    private String pickup_Point;
    private String destination;
    private String trip_Time;

    public Trip(Customer customer, CarOwner carOwner, String pickup_Point, String destination, String trip_Time) {
        this.customer = customer;
        this.carOwner = carOwner;
        this.pickup_Point = pickup_Point;
        this.destination = destination;
        this.trip_Time = trip_Time;
    }

    public Trip() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CarOwner getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(CarOwner carOwner) {
        this.carOwner = carOwner;
    }

    public String getPickup_Point() {
        return pickup_Point;
    }

    public void setPickup_Point(String pickup_Point) {
        this.pickup_Point = pickup_Point;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTrip_Time() {
        return trip_Time;
    }

    public void setTrip_Time(String trip_Time) {
        this.trip_Time = trip_Time;
    }
}
