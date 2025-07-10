package com.wecp;

import com.wecp.exceptions.*;
import com.wecp.shopping.ShoppingCart;
import com.wecp.shopping.Item;

public class ExceptionHandlingMechanism {
    public static void main(String[] args) {
        System.out.println("======= E-Commerce Application =======");
        ShoppingCart cart = new ShoppingCart();

        try {
            Item item1 = new Item("Item1", 5);
            cart.addItem(item1, true);
            System.out.println("Item added to the cart.");

            Item item2 = new Item("Item2", 3);
            cart.addItem(item2, true);
            System.out.println("Item added to the cart.");

            // Try adding a duplicate item
            cart.addItem(item1, true);
        } catch (InvalidItemException | DuplicateItemException | NullItemException | InvalidQuantityException e) {
            System.out.println("Exception occurred " + e.getMessage());
        }

        // Removing an item from the cart
        try {
            Item itemToRemove = new Item("Item1", 5);
            cart.removeItem(itemToRemove);
            System.out.println("Item removed from the cart.");
        } catch (EmptyCartException | NullItemException e) {
            System.out.println(e.getMessage());
        }

        // Proceeding to checkout
        try {
            boolean isUserAuthorized = true;
            boolean isCheckoutSuccess = true;
            cart.checkout(isUserAuthorized, isCheckoutSuccess);
            System.out.println("Checkout successful!");
        } catch (InsufficientStockException | CheckoutFailureException | UnauthorizedAccessException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("======= End of E-Commerce Application =======");
    }
}