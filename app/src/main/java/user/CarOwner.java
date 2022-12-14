package user;

import CarPackage.Car;

public class CarOwner extends User{

    private String [] complaints = new String[50];
    private int noComplaints = 0;
    private Car myCar = new Car();

    public CarOwner(String userName, String email, String password, String age) {
        super(userName, email, password, age);
    }

    public CarOwner() {
    }

    public String[] getComplaints() {
        return complaints;
    }

    public int getNoComplaints() {
        return noComplaints;
    }

    public void setNoComplaints(int noComplaints) {
        this.noComplaints = noComplaints;
    }

    public void addComplaints(String complaint) {
        this.complaints[noComplaints] = complaint;
        noComplaints++;
    }

}
