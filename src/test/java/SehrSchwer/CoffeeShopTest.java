package test.java.SehrSchwer;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.SehrSchwer.CoffeeShop;
import main.java.SehrSchwer.CoffeeShop.*;

public class CoffeeShopTest {

    @Test
    public void test01() {
        MenuItem[] menu = new MenuItem[] {
                new MenuItem("orange juice", "drink", 2.13), new MenuItem("lemonade", "drink", 0.85),
                new MenuItem("cranberry juice", "drink", 3.36),
                new MenuItem("pineapple juice", "drink", 1.89), new MenuItem("lemon iced tea", "drink", 1.28),
                new MenuItem("apple iced tea", "drink", 1.28),
                new MenuItem("vanilla chai latte", "drink", 2.48), new MenuItem("hot chocolate", "drink", 0.99),
                new MenuItem("iced coffee", "drink", 1.12),
                new MenuItem("tuna sandwich", "food", 0.95), new MenuItem("ham and cheese sandwich", "food", 1.35),
                new MenuItem("bacon and egg", "food", 1.15),
                new MenuItem("steak", "food", 3.28), new MenuItem("hamburger", "food", 1.05),
                new MenuItem("cinnamon roll", "food", 1.05) };
        CoffeeShop shop = new CoffeeShop("Deep Into Coffee", menu, new String[] {});

        assertEquals("Order added!", shop.addOrder("cinnamon roll"));
        assertEquals("Order added!", shop.addOrder("iced coffee"));
        assertArrayEquals(new String[] { "cinnamon roll", "iced coffee" }, shop.listOrders());
        assertEquals(2.17, shop.dueAmount(), 6);
        assertEquals("The cinnamon roll is ready!", shop.fulfillOrder());
        assertEquals("The iced coffee is ready!", shop.fulfillOrder());
        assertEquals("All orders have been fulfilled!", shop.fulfillOrder());
        assertEquals("This item is currently unavailable!", shop.addOrder("hot cocoa"));
        assertEquals("This item is currently unavailable!", shop.addOrder("iced tea"));
        assertArrayEquals(new String[] {}, shop.listOrders());
        assertEquals(0.0, shop.dueAmount(), 6);
        assertEquals("lemonade", shop.cheapestItem());
        assertArrayEquals(new String[] { "orange juice", "lemonade", "cranberry juice", "pineapple juice",
                "lemon iced tea", "apple iced tea", "vanilla chai latte", "hot chocolate", "iced coffee" },
                shop.drinksOnly());
        assertArrayEquals(new String[] { "tuna sandwich", "ham and cheese sandwich", "bacon and egg", "steak",
                "hamburger", "cinnamon roll" }, shop.foodOnly());
    }

    @Test
    public void test02() {
        MenuItem[] menu = new MenuItem[] {
                new MenuItem("turkey english muffin", "food", 7.99), new MenuItem("avocado toast", "food", 5.05),
                new MenuItem("chocolate croissant", "food", 3.00),
                new MenuItem("espresso", "drink", 2.99), new MenuItem("iced caramel macchiato", "drink", 4.50),
                new MenuItem("cortado", "drink", 4.00),
                new MenuItem("nitro cold brew tester", "drink", 8.00) };
        CoffeeShop shop = new CoffeeShop("Xavier's", menu, new String[] {});

        assertEquals("Order added!", shop.addOrder("cortado"));
        assertEquals(4.0, shop.dueAmount(), 6);
        assertEquals("The cortado is ready!", shop.fulfillOrder());
        assertEquals("All orders have been fulfilled!", shop.fulfillOrder());
        assertEquals("Order added!", shop.addOrder("avocado toast"));
        assertEquals(5.05, shop.dueAmount(), 6);
        assertArrayEquals(new String[] { "avocado toast" }, shop.listOrders());
        assertEquals("espresso", shop.cheapestItem());
        assertArrayEquals(new String[] { "espresso", "iced caramel macchiato", "cortado", "nitro cold brew tester" },
                shop.drinksOnly());
        assertArrayEquals(new String[] { "turkey english muffin", "avocado toast", "chocolate croissant" },
                shop.foodOnly());
    }

    @Test
    public void test03() {
        MenuItem[] menu = new MenuItem[] {
                new MenuItem("cheeseburger with fries", "food", 5.44),
                new MenuItem("cinnamon roll", "food", 4.99),
                new MenuItem("hot chocolate", "drink", 2.99),
                new MenuItem("lemon tea", "drink", 2.50),
                new MenuItem("iced coffee", "drink", 3.00),
                new MenuItem("vanilla chai latte", "drink", 4.00) };
        CoffeeShop shop = new CoffeeShop("Tesha's", menu, new String[] {});

        assertEquals("This item is currently unavailable!", shop.addOrder("hot cocoa"));
        assertEquals(0.0, shop.dueAmount(), 6);
        assertEquals("Order added!", shop.addOrder("cheeseburger with fries"));
        assertEquals("Order added!", shop.addOrder("lemon tea"));
        assertEquals("Order added!", shop.addOrder("iced coffee"));
        assertArrayEquals(new String[] { "cheeseburger with fries", "lemon tea", "iced coffee" }, shop.listOrders());
        assertEquals(10.94, shop.dueAmount(), 6);
        assertEquals("The cheeseburger with fries is ready!", shop.fulfillOrder());
        assertEquals("The lemon tea is ready!", shop.fulfillOrder());
        assertEquals("The iced coffee is ready!", shop.fulfillOrder());
        assertArrayEquals(new String[] {}, shop.listOrders());
        assertEquals("lemon tea", shop.cheapestItem());
        assertArrayEquals(new String[] { "hot chocolate", "lemon tea", "iced coffee", "vanilla chai latte" },
                shop.drinksOnly());
        assertArrayEquals(new String[] { "cheeseburger with fries", "cinnamon roll" }, shop.foodOnly());
    }
}
