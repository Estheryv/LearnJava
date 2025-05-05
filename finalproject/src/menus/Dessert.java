package menus;

public class Dessert extends Menus {

    //data members
    private String savor;
    public Dessert next;

    // constructors

    public Dessert() {
    }

    public Dessert(String name, String recipe, int time, int serving, String savor) {
        super(name, recipe, time, serving);
        this.savor = savor;
    }

    //Getters and setters


    public String getSavor() {
        return savor;
    }

    public void setSavor(String savor) {
        this.savor = savor;
    }

    // helper methods

    @Override
    public String showMenu() {
        return "Savor: " + savor + ", "+ super.showMenu() ;
    }
}
