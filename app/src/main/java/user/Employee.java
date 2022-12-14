package user;

public class Employee extends User{

    private Employee(String userName, String email, String password, String age) {
        super(userName, email, password, age);
    }

    public Employee() {
    }

}
