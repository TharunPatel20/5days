import com.wecp.exceptions.*;
import com.wecp.shopping.Item;
import com.wecp.shopping.ShoppingCart;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingMechanismTests {

    @Test
    public void testAddItem_InvalidItem() {
        ShoppingCart cart = new ShoppingCart();
        Item invalidItem = new Item("name", 5);
        assertThrows(InvalidItemException.class, () -> cart.addItem(invalidItem, false));
    }

    @Test
    public void testAddItem_NullItem() {
        ShoppingCart cart = new ShoppingCart();
        Item nullItem = null;
        assertThrows(NullItemException.class, () -> cart.addItem(nullItem, true));
    }

    @Test
    public void testAddItem_InvalidQuantity() {
        ShoppingCart cart = new ShoppingCart();
        Item invalidQuantityItem = new Item("Item1", -1);
        assertThrows(InvalidQuantityException.class, () -> cart.addItem(invalidQuantityItem, true));
    }

    @Test
    public void testAddItem_DuplicateItem() throws InvalidItemException, NullItemException, InvalidQuantityException, DuplicateItemException {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("Item1", 5);
        cart.addItem(item1, true);
        assertThrows(DuplicateItemException.class, () -> cart.addItem(item1, true));
    }

    @Test
    public void testAddItem_SuccessfulAddition() throws InvalidItemException, NullItemException, InvalidQuantityException, DuplicateItemException {
        ShoppingCart cart = new ShoppingCart();
        Item item = new Item("Item1", 5);
        cart.addItem(item, true);
        assertEquals(1, cart.getCart().size());
        assertTrue(cart.getCart().contains(item));
    }

    // remove cart item tests
    @Test
    public void testRemoveItem_EmptyCart() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(EmptyCartException.class, () -> cart.removeItem(new Item("Item1", 5)));
    }

    @Test
    public void testRemoveItem_NullItem() throws DuplicateItemException, InvalidQuantityException, InvalidItemException, NullItemException {
        ShoppingCart cart = new ShoppingCart();
        Item item = new Item("Item1", 5);
        cart.addItem(item, true);
        assertThrows(NullItemException.class, () -> cart.removeItem(null));
    }

    @Test
    public void testRemoveItem_SuccessfulRemoval() throws InvalidItemException, NullItemException, DuplicateItemException, InvalidQuantityException, EmptyCartException {
        // Add an item to the cart
        ShoppingCart cart = new ShoppingCart();
        Item item = new Item("Item1", 5);
        Item item2 = new Item("Item1", 5);
        cart.addItem(item, true);

        // Remove the item from the cart
        cart.removeItem(item2);

        assertTrue(cart.getCart().isEmpty());
    }

    // checkout tests
    @Test
    public void testCheckout_UnauthorizedUser() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(UnauthorizedAccessException.class, () -> cart.checkout(false, true));
    }

    @Test
    public void testCheckout_Failure() throws InvalidItemException, NullItemException, InvalidQuantityException, DuplicateItemException, UnauthorizedAccessException {
        // Add items to the cart
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("Item1", 5);
        Item item2 = new Item("Item2", 3);
        cart.addItem(item1, true);
        cart.addItem(item2, true);

        assertThrows(CheckoutFailureException.class, () -> cart.checkout(true, false));
    }

    @Test
    public void testCheckout_SuccessfulCheckout() throws InvalidItemException, NullItemException, InvalidQuantityException, DuplicateItemException, UnauthorizedAccessException, InsufficientStockException, EmptyCartException, CheckoutFailureException {
        // Add items to the cart
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("Item1", 5);
        Item item2 = new Item("Item2", 3);
        cart.addItem(item1, true);
        cart.addItem(item2, true);

        // Perform checkout
        cart.checkout(true, true);

        assertEquals(0, cart.getCart().size());
    }


}
