package src.main.java.SehrSchwer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class CoffeeShop {
    /**
     * Coffee Shop
     * 
     * Write a class called CoffeeShop, which has three instance variables:
     * 
     * name : a string (basically, of the shop)
     * menu : an array of items (of type MenuItem), with each item containing the
     * item (name of the item), type (whether a food or a drink) and price.
     * orders : an empty array
     * 
     * and seven methods:
     * 
     * addOrder: adds the name of the item to the end of the orders array if it
     * exists on the menu. Otherwise, return "This item is currently unavailable!"
     * fulfillOrder: if the orders array is not empty, return "The {item} is
     * ready!". If the orders array is empty, return "All orders have been
     * fulfilled!"
     * listOrders: returns the list of orders taken, otherwise, an empty array.
     * dueAmount: returns the total amount due for the orders taken.
     * cheapestItem: returns the name of the cheapest item on the menu.
     * drinksOnly: returns only the item names of type drink from the menu.
     * foodOnly: returns only the item names of type food from the menu.
     * 
     * IMPORTANT: Orders are fulfilled in a FIFO (first-in, first-out) order.
     * Examples
     * 
     * tcs.addOrder("hot cocoa") ➞ "This item is currently unavailable!"
     * // Tesha's coffee shop does not sell hot cocoa
     * tcs.addOrder("iced tea") ➞ "This item is currently unavailable!"
     * // specifying the variant of "iced tea" will help the process
     * 
     * tcs.addOrder("cinnamon roll") ➞ "Order added!"
     * tcs.addOrder("iced coffee") ➞ "Order added!"
     * tcs.listOrders ➞ ["cinnamon roll", "iced coffee"]
     * // the list of all the items in the current order
     * 
     * tcs.dueAmount() ➞ 2.17
     * 
     * tcs.fulfillOrder() ➞ "The cinnamon roll is ready!"
     * tcs.fulfillOrder() ➞ "The iced coffee is ready!"
     * tcs.fulfillOrder() ➞ "All orders have been fulfilled!";
     * // all orders have been presumably served
     * 
     * tcs.listOrders() ➞ []
     * // an empty array is returned if all orders have been exhausted
     * 
     * tcs.dueAmount() ➞ 0.0
     * // no new orders taken, expect a zero payable
     * 
     * tcs.cheapestItem() ➞ "lemonade"
     * tcs.drinksOnly() ➞ ["orange juice", "lemonade", "cranberry juice", "pineapple
     * juice", "lemon iced tea", "vanilla chai latte", "hot chocolate", "iced
     * coffee"]
     * tcs.foodOnly() ➞ ["tuna sandwich", "ham and cheese sandwich", "bacon and
     * egg", "steak", "hamburger", "cinnamon roll"]
     * 
     * Notes
     * 
     * Round off due amount up to two decimal places.
     */

     //TODO

   











    public static class MenuItem {
        private String item;
        private String type;
        private double price;

        public MenuItem(String item, String type, double price) {
            this.item = item;
            this.type = type;
            this.price = price;
        }

        public String getItem() {
            return item;
        }

        public String getType() {
            return type;
        }

        public double getPrice() {
            return price;
        }
    }


    // private String name;
    // private ArrayList<MenuItem> menu;
    // private Queue<String> orders;

    // public CoffeeShop(String name, MenuItem[] menu, String[] orders) {
    //     this.name = name;
    //     this.menu = new ArrayList<>(Arrays.asList(menu));
    //     this.orders = new LinkedList<>(Arrays.asList(orders));
    // }

    // // addOrder: adds the name of the item to the end of the orders array if it
    // // exists on the menu. Otherwise, return "This item is currently unavailable!"

    // public String addOrder(String nextOrder) {
    //     for (MenuItem menuItem : menu) {
    //         if (menuItem.getItem().equals(nextOrder)) {
    //             orders.add(nextOrder);
    //             return "Order added!";
    //         }
    //     }
    //     return "This item is currently unavailable!";
    // }

    // /*
    //  * fulfillOrder: if the orders array is not empty, return "The {item} is
    //  * ready!". If the orders array is empty, return "All orders have been
    //  * fulfilled!"
    //  */

    // public String fulfillOrder() {
    //     String nextOrder = orders.poll();
    //     return nextOrder == null ? "All orders have been fulfilled!" : "The "+ nextOrder +" is ready!";
    // }

    // /* listOrders: returns the list of orders taken, otherwise, an empty array. */
    // public String[] listOrders() {
    //     return orders.toArray(String[]::new);
    // }

    // /* dueAmount: returns the total amount due for the orders taken. */

    // public double dueAmount() {
    //     return orders.stream()
    //             .mapToDouble(order -> menu.stream()
    //                     .filter(x -> x.getItem().equals(order))
    //                     .mapToDouble(x -> x.getPrice())
    //                     .findFirst()
    //                     .orElse(0))
    //             .sum();

    // }

    // /* cheapestItem: returns the name of the cheapest item on the menu. */
    // public String cheapestItem() {
    //     return menu.stream()
    //             .sorted(Comparator.comparing(MenuItem::getPrice))
    //             .map(MenuItem::getItem)
    //             .findFirst()
    //             .get();
    // }

    // /* drinksOnly: returns only the item names of type drink from the menu. */
    // public String[] drinksOnly() {
    //     return menu.stream()
    //             .filter(item -> item.getType().equals("drink"))
    //             .map(MenuItem::getItem)
    //             .toArray(String[]::new);
    // }

    // /* foodOnly: returns only the item names of type food from the menu. */
    // public String[] foodOnly() {
    //     return menu.stream()
    //             .filter(item -> item.getType().equals("food"))
    //             .map(MenuItem::getItem)
    //             .toArray(String[]::new);
    // }



}
