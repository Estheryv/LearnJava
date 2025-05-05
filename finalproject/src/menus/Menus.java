package menus;

public class Menus {

    //data members
    private String name;
    private String recipe;
    private int time;
    private int serving;

    public Menus next;

    //constructors
    public Menus() {
    }

    public Menus(String name, String recipe, int time, int serving) {
        this.name = name;
        this.recipe = recipe;
        this.time = time;
        this.serving = serving;
    }

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getServing() {
        return serving;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }

    //helper methods
    public String showMenu(){
        return "Menu: " + name + ", cook time: " + time + ", serving " + serving;
    }
}
