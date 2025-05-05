package lists;

import menus.Dessert;


public class DessertList {

    //data members
    private Dessert head;
    private int size;

    //constructor

    public DessertList(){
        this.head = null;
        this.size = 0;
    }

    //helper methods
    //to add a node at the end
    public void add(String name, String recipe, int time, int serving, String savor){
        Dessert newMenu = new Dessert(name, recipe, time, serving, savor);
        if (head == null){
            head = newMenu;
        }else{
            Dessert current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newMenu;
        }
        size++;
    }

    //get value of a node at a random index
    public Dessert get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Dessert current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    //print list
    public void printList() {
        Dessert current = head;
        while (current != null) {
            System.out.print(current + " ");
            current = current.next;
        }
        System.out.println();
    }
}
