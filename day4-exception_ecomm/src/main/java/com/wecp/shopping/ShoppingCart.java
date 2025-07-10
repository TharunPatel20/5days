package com.wecp.shopping;

import java.util.ArrayList;
import java.util.List;
import com.wecp.exceptions.*;

public class ShoppingCart {
    private List<Item> cart = new ArrayList<>();

    public void addItem(Item item, Boolean isItemValid)  {
        //  Adds an item to the cart
        //  throws InvalidItemException, DuplicateItemException, NullItemException, InvalidQuantityException
    }

    public void removeItem(Item item)  {
        //  Removes an item from the cart
        //  throws EmptyCartException, NullItemException
    }

    public void checkout(boolean isUserAuthorized, boolean isCheckoutSuccess)  {
        // Proceeds to checkout. if checkout is successful, clears the cart
        // throws InsufficientStockException, CheckoutFailureException, UnauthorizedAccessException
    }

    public List<Item> getCart() {
        return cart;
    }
}
