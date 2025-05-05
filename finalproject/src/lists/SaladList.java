package lists;


import menus.Salad;

public class SaladList {

    //data members
    private Salad head;
    private int size;

    //constructor

    public SaladList(){
        this.head = null;
        this.size = 0;
    }

    //helper methods
    //to add a node at the end
    public void add(String name, String recipe, int time, int serving, String type){
        Salad newMenu = new Salad(name, recipe, time, serving, type);
        if (head == null){
            head = newMenu;
        }else{
            Salad current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newMenu;
        }
        size++;
    }

    //get value of a node at a random index
    public Salad get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Salad current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    //print list
    public void printList() {
        Salad current = head;
        while (current != null) {
            System.out.print(current + " ");
            current = current.next;
        }
        System.out.println();
    }

}
