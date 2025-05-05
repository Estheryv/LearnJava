package pantyitems;

public class Pantry {

    //data members
    private String name;
    private int quantity;

    //constructors
    public Pantry(){
    }

    public Pantry(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //helper methods
    public String ingredientInfo(){
        return "Ingredient " + name + " : "+ quantity + " items.";
    }
    public int decrementIngredient(){
        return quantity - 1;
    }


}
