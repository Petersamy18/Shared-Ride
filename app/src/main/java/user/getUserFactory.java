package user;

public class getUserFactory {

    public User getUser(String userType){
        if (userType == null)
            return null;
        if(userType.equalsIgnoreCase("Employee")){
            return new Employee();
        }
        else if(userType.equalsIgnoreCase("CarOwner")){
            return new CarOwner();
        }
        else if(userType.equalsIgnoreCase("Customer")){
            return new Customer();
        }
        return null;
    }
}
