package CarPackage;

import java.util.HashMap;

public class Registry {
    private HashMap<String, Car> registry;

    public Registry() {
        this.registry = new HashMap();
    }

    public void initialize(){
        registry.put("Nissan", new Car("Nissan", "Sunny", 2019, 5, "######", "Ahmed"));
        registry.put("Byd", new Car("Byd", "F3", 2020, 5, "######", "Seif"));
        registry.put("Opel", new Car("Opel", "Astra", 2017, 5, "######", "Hassan"));
    }

    public Car getClone(String carMaker){
        Object clone = null;
        try {
            clone = registry.get(carMaker).clone();
        }
        catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return (Car)clone;
    }

}
