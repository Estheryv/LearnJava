package menus;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenusTest {

    Menus menu = new Menus("Mashed potato and gravy", 20, 4);
    @Test
    void showMenu() {
        assertEquals("Menu: Mashed potato and gravy, cook time: 20, serving 4", menu.showMenu());
    }
}