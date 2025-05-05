package menus;

public class Salad extends Menus {

    //data members
    private String type;
    public Salad next;

    //Constructors

    public Salad() {
    }

    public Salad(String name, String recipe, int time, int serving, String type) {
        super(name, recipe, time, serving);
        this.type = type;
    }

    //getters and setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //helper methods

    @Override
    public String showMenu() {
        return "Salad type: " + type + ", " + super.showMenu();
    }
}
