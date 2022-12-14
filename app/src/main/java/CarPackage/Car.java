package CarPackage;

import androidx.annotation.NonNull;

public class Car implements Cloneable{
    private String maker;
    private String model;
    private int year;
    private int no_Seats;
    private String plate_Number;
    private String ownerName;

    public Car(String maker, String model, int year, int no_Seats, String plate_Number, String ownerName) {
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.no_Seats = no_Seats;
        this.plate_Number = plate_Number;
        this.ownerName = ownerName;
    }

    public Car() {
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNo_Seats() {
        return no_Seats;
    }

    public void setNo_Seats(int no_Seats) {
        this.no_Seats = no_Seats;
    }

    public String getPlate_Number() {
        return plate_Number;
    }

    public void setPlate_Number(String plate_Number) {
        this.plate_Number = plate_Number;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
