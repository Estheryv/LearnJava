package menusDriver;
/*
* */
import lists.DessertList;
import lists.SaladList;
import menus.Menus;

import java.awt.*;
import java.util.*;

import static lists.PriorityQueue.push;

public class Main {
    public static void main(String[] args) {
        Menus menus1 = new Menus("Mashed potato and gravy", "add meat or fish", 20, 4);
        Menus menus2 = new Menus("Rustic Ratatouille", "vegetarian", 60, 3);
        Menus menus3 = new Menus("Orange teriyaki Salmon", "add asparagus", 25, 4);
        Menus menus4 = new Menus("Sausage & Pinto Bean Soup", "with cornbread", 40, 6);
        Menus menus5 = new Menus("CreamyMushroom and wild Rice Soup", "add sour cream", 45, 6);
        Menus menus6 = new Menus("Ham and Cannellini Soup", "add crusty bread", 40, 6);
        Menus menus7 = new Menus("13 Bean Vegetable Soup", "vegetarian", 45, 6);
        Menus menus8 = new Menus("Chicken and Gnocchi soup", "add lemon", 50, 6);
        Menus menus9 = new Menus("Vegan French Onion Soup", "vegetarian", 90, 6);
        Menus menus10 = new Menus("Split pea Soup with Ham Hocks", "add cornbread", 120, 6);

        int priority = 1 +(int)(Math.random()*7 + 1);
        Menu menu11 = new Menu();
        Menu menu12 = new Menu();
        Menu menu13 = new Menu();
        Menu menu14 = new Menu();
        Menu menu15 = new Menu();
        Menu menu16 = new Menu();
        Menu menu17 = new Menu();
        Menu menu18 = new Menu();
        Menu menu19 = new Menu();


/*
        menu11 = push(menu11, menu11, priority);
        menu12 = push(menu11, menu12, priority);
        menuItems.add(menus3);
        menuItems.add(menus4);
        menuItems.add(menus5);
        menuItems.add(menus6);
        menuItems.add(menus7);
        menuItems.add(menus8);
        menuItems.add(menus9);
        menuItems.add(menus10);
*/
        DessertList dessertItems = new DessertList();
        dessertItems.add("Brownie", "add chocolate chips", 60, 6, "sweet");
        dessertItems.add("Cheesecake", "add honey", 60, 6, " sweet");
        dessertItems.add("Cheesecake", "add garlic", 50, 6, "savory");
        dessertItems.add("Ice Cream", "add praline", 120, 7, "sweet");
        dessertItems.add("Hush Puppies", "add dill", 30, 8, "savory");
        dessertItems.add("Bloody Mary", "add basil", 15, 5, "savory");
        dessertItems.add("Cream puffs", "add caramel", 50, 6, "sweet");
        dessertItems.add("Ham Quiche", "add spinach", 60, 7, "savory");
        dessertItems.add("Flan", "add caramel", 50, 6, "sweet");
        dessertItems.add("Cookies", "add pecans", 45, 6, "sweet");

        SaladList saladItems = new SaladList();
        saladItems.add("Ceasar Salad", "add croutons", 10, 6, "cold");
        saladItems.add("Caprese salad", "add bread", 10, 6, "cold");
        saladItems.add("Bacon Lettuce TOmato", " add olive oil", 15, 6, "cold");
        saladItems.add("Avocado Cucumber Tomato", "add cheese", 5, 6, "cold");
        saladItems.add("Carrot Salad", " add olives", 7, 4, "cold");
        saladItems.add("Coleslaw", "add raisins", 10, 4, "cold");
        saladItems.add("Chicken Salad", "add mayo", 20, 6, "hot");
        saladItems.add("Potato Salad", "add sour cream", 25, 6, "hot");
        saladItems.add("Penne Salad", "add beans", 12, 6, "hot");

        //Now that we have our lists of menus -
        //we will create weekly menus, randomly selected from the menus lists and store in a hashmap

        ArrayList<Menus> weeklyMenu = new ArrayList<>();
       /* while (!menuItems.isEmpty()){
            weeklyMenu.add(menuItems.poll());
        }*/


        Scanner scr = new Scanner(System.in);
        System.out.println("View Menu For The Week");
        String input = scr.nextLine();
        if(input.equals("yes")) {

            System.out.println(menus1.showMenu());
            System.out.println(menus2.showMenu());
            System.out.println(menus3.showMenu());
            System.out.println(menus4.showMenu());
            System.out.println(menus5.showMenu());
            System.out.println(menus6.showMenu());
            System.out.println(menus7.showMenu());
        }
        if(!input.equals("yes")){
            System.out.println("Bien vouloir recommencer");
        }

        scr.close();

    }
}