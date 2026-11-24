class Car extends Vehicle {
    private int numDoors;

    public Car(String model, int numDoors) {
        super(model);
        this.numDoors = numDoors;
    }

    public void checkDoors() {
        System.out.println(getModel() + " has " + numDoors + " doors");
    }
}
class Vehicle {
    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void inspect() {
        System.out.println("Inspecting vehicle: " + model);
    }
}
