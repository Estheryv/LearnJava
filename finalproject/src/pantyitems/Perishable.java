package pantyitems;

public class Perishable extends Pantry{
    // data member
    private int hoursToPerish;

    //constructor
    public Perishable() {
    }

    public Perishable(String name, int quantity, int hoursToPerish) {
        super(name, quantity);
        this.hoursToPerish = hoursToPerish;
    }

    //getters and setters
    public int getHoursToPerish() {
        return hoursToPerish;
    }

    public void setHoursToPerish(int hoursToPerish) {
        this.hoursToPerish = hoursToPerish;
    }

    //helper methods

    @Override
    public String ingredientInfo() {
        return super.ingredientInfo() + " will expire in " + hoursToPerish + " hours.";
    }
}
