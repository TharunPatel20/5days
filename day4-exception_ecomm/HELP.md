---
# Problem Scenario: Developing Exception Handling Mechanisms for an E-commerce Cart

You are tasked with developing an exception handling mechanism for an e-commerce shopping cart application. The application allows users to add items to their cart, remove items, and proceed to checkout. 

However, various exceptions may occur during the cart manipulation process, such as invalid item addition, empty cart removal, insufficient stock for checkout, duplicate item addition, null item addition/removal, invalid quantity addition, checkout failure, and unauthorized access. Your objective is to implement exception handling techniques, define custom exceptions, and handle predefined exceptions to ensure smooth operation of the shopping cart.

## Requirements

### Custom Exceptions

Define the following custom exceptions to handle specific scenarios:

- `InvalidItemException`: Thrown when attempting to add an invalid item to the cart.
- `EmptyCartException`: Thrown when attempting to remove an item from an empty cart.
- `InsufficientStockException`: Thrown when attempting to checkout with insufficient stock for any item in the cart.
- `DuplicateItemException`: Thrown when attempting to add an item to the cart that already exists.
- `NullItemException`: Thrown when attempting to add or remove a null item from the cart.
- `InvalidQuantityException`: Thrown when attempting to add an item with a negative or zero quantity to the cart.
- `CheckoutFailureException`: Thrown when the checkout process fails due to an unspecified reason.
- `UnauthorizedAccessException`: Thrown when attempting to perform an operation without proper authorization.

### Exception Handling

Implement exception handling mechanisms within the `ShoppingCart` class to handle the defined custom exceptions and predefined exceptions. Catch and handle the above-defined custom exceptions and predefined exceptions appropriately.

### Cart Operations

Implement the following operations in the `ShoppingCart` class:

- `void addItem(Item item, Boolean isItemValid) throws InvalidItemException, DuplicateItemException, NullItemException, InvalidQuantityException`: Adds an item to the cart.
- `void removeItem(Item item) throws EmptyCartException, NullItemException`: Removes an item from the cart.
- `checkout(boolean isUserAuthorized, boolean isCheckoutSuccess) throws InsufficientStockException, CheckoutFailureException, UnauthorizedAccessException`: Proceeds to checkout and clear the cart after successful checkout.