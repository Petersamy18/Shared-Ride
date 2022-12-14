package user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class User {
    private String userName;
    private String email;
    private String password;
    private String age;

    public User(String userName, String email, String password, String age) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public User() {}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean validateEmail(String email){
        String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches() == false){
            System.out.println("Invalid Email!");
            return false;
        }
        System.out.println("Valid Email");
        return true;
        //Function Explanation
        /*The following restrictions are imposed in the email address' local part by using this regex:
        It allows numeric values from 0 to 9.
        Both uppercase and lowercase letters from a to z are allowed.
        Allowed are underscore “_”, hyphen “-“, and dot “.”
        Dot isn't allowed at the start and end of the local part.
        Consecutive dots aren't allowed.
        For the local part, a maximum of 64 characters are allowed.

        Restrictions for the domain part in this regular expression include:
        It allows numeric values from 0 to 9.
        We allow both uppercase and lowercase letters from a to z.
        Hyphen “-” and dot “.” aren't allowed at the start and end of the domain part.
        No consecutive dots.
        user.name@domain.com --> Valid
        .user.name@domain.com --> InValid
        */
    }

}
