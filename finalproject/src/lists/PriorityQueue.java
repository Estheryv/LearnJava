package lists;

public class PriorityQueue {
/*
    //data members
    private Menu head;
    private int size;

    //constructor

    public MenuList(){
        this.head = null;
        this.size = 0;
    }

    //helper methods
    //to add a node at the end
    public void add(Menu menu){
        Menu newMenu = new Menu();
        if (head == null){
            head = newMenu;
        }else{
            Menu current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newMenu;
        }
        size++;
    }

    //get value of a node at a random index
    public Menu getMenu(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Menu current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public Menu getItem(MenuList menuList){

        int i = 0;
        return getMenu(i);
    }

    //print list
    public void printList() {
        Menu current = head;
        while (current != null) {
            System.out.print(current + " ");
            current = current.next;
        }
        System.out.println();
    }*/
static class Menu {
    Menu data;

    int priority;

    Menu next;

}

    static Menu node = new Menu();

    // Function to Create A New Node
    static Menu newNode(Menu m, int p) {
        Menu temp = new Menu();
        temp.data = m;
        temp.priority = p;
        temp.next = null;

        return temp;
    }

    // Return the value at head
    public Menu peek(Menu head) {
        return (head).data;
    }

    // Removes the element with the
// highest priority from the list
    public Menu pop(Menu head) {
        (head) = (head).next;
        return head;
    }

    // Function to push according to priority
   public static Menu push(Menu head, Menu m, int p) {

        Menu start = (head);

        // Create new Node
        Menu temp = newNode(m, p);


        temp.next = start.next;
        start.next = temp;

        return head;
    }

    // Function to check is list is empty
    public int isEmpty(Menu head) {
        return ((head) == null)?1:0;
    }



}
