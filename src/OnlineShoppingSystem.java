import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

// Class representing a product
class Product {
    private int productID;
    private String name;
    private double price;
    private int quantityAvailable;

    public Product(int productID, String name, double price, int quantityAvailable) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    public int getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }
}

// Class representing the shopping cart
class ShoppingCart {
    Map<Product, Integer> cartItems = new HashMap<>();

    // Add product to the cart
    public void addItem(Product product, int quantity) {
        if (product.getQuantityAvailable() >= quantity) {
            cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
            product.setQuantityAvailable(product.getQuantityAvailable() - quantity);
        } else {
            System.out.println("Not enough stock available for " + product.getName());
        }
    }

    // Remove product from the cart
    public void removeItem(Product product, int quantity) {
        if (cartItems.containsKey(product)) {
            int currentQuantity = cartItems.get(product);
            if (quantity >= currentQuantity) {
                cartItems.remove(product);
            } else {
                cartItems.put(product, currentQuantity - quantity);
            }
            product.setQuantityAvailable(product.getQuantityAvailable() + quantity);
        } else {
            System.out.println("Product not in cart.");
        }
    }

    // View all items in the cart
    public void viewCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
                Product product = entry.getKey();
                int quantity = entry.getValue();
                System.out.println("Product: " + product.getName() + " | Quantity: " + quantity + " | Price: " + product.getPrice());
            }
        }
    }

    // Get total price of the items in the cart
    public double getTotalPrice() {
        double total = 0;
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }
        return total;
    }
}

// Class representing an order
class Order {
    private int orderID;
    private Map<Product, Integer> orderedItems;
    private double totalPrice;

    public Order(int orderID, Map<Product, Integer> items) {
        this.orderID = orderID;
        this.orderedItems = new HashMap<>(items); // Deep copy of the cart items
        this.totalPrice = calculateTotalPrice();
    }

    public int getOrderID() {
        return orderID;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    private double calculateTotalPrice() {
        double total = 0;
        for (Map.Entry<Product, Integer> entry : orderedItems.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        for (Map.Entry<Product, Integer> entry : orderedItems.entrySet()) {
            System.out.println("Product: " + entry.getKey().getName() + " | Quantity: " + entry.getValue());
        }
        System.out.println("Total Price: $" + totalPrice);
    }
}

// Class representing the user's order history
class OrderHistory {
    private ArrayList<Order> pastOrders = new ArrayList<>();

    public void addOrder(Order order) {
        pastOrders.add(order);
    }

    public void viewOrderHistory() {
        if (pastOrders.isEmpty()) {
            System.out.println("No past orders.");
        } else {
            for (Order order : pastOrders) {
                order.displayOrderDetails();
                System.out.println();
            }
        }
    }
}

// Class representing the user
class User {
    private int userID;
    private String name;
    private String email;
    private ShoppingCart shoppingCart;
    private OrderHistory orderHistory;

    public User(int userID, String name, String email) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.shoppingCart = new ShoppingCart();
        this.orderHistory = new OrderHistory();
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public OrderHistory getOrderHistory() {
        return orderHistory;
    }
}

// Main class
public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User(1, "John Doe", "johndoe@example.com");

        // Predefined products
        Product product1 = new Product(101, "Laptop", 800.00, 10);
        Product product2 = new Product(102, "Phone", 500.00, 20);
        Product product3 = new Product(103, "Headphones", 100.00, 30);

        int choice = -1;
        int orderID = 1;

        while (choice != 0) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Items");
            System.out.println("2. Remove Items");
            System.out.println("3. View Cart");
            System.out.println("4. View Total Price");
            System.out.println("5. Checkout and Place Order");
            System.out.println("6. View Order History");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Add items
                    System.out.println("Available Products: \n1. Laptop \n2. Phone \n3. Headphones");
                    System.out.print("Enter product number to add: ");
                    int productChoice = sc.nextInt();
                    Product selectedProduct = null;

                    switch (productChoice) {
                        case 1:
                            selectedProduct = product1;
                            break;
                        case 2:
                            selectedProduct = product2;
                            break;
                        case 3:
                            selectedProduct = product3;
                            break;
                        default:
                            System.out.println("Invalid product choice!");
                    }

                    if (selectedProduct != null) {
                        System.out.print("Enter quantity to add: ");
                        int quantity = sc.nextInt();
                        user.getShoppingCart().addItem(selectedProduct, quantity);
                        System.out.println("Added " + quantity + " of " + selectedProduct.getName());
                    }
                    break;

                case 2: // Remove items
                    System.out.println("Enter the product number to remove (1. Laptop, 2. Phone, 3. Headphones): ");
                    productChoice = sc.nextInt();
                    selectedProduct = null;

                    switch (productChoice) {
                        case 1:
                            selectedProduct = product1;
                            break;
                        case 2:
                            selectedProduct = product2;
                            break;
                        case 3:
                            selectedProduct = product3;
                            break;
                        default:
                            System.out.println("Invalid product choice!");
                    }

                    if (selectedProduct != null) {
                        System.out.print("Enter quantity to remove: ");
                        int quantity = sc.nextInt();
                        user.getShoppingCart().removeItem(selectedProduct, quantity);
                        System.out.println("Removed " + quantity + " of " + selectedProduct.getName());
                    }
                    break;

                case 3: // View items in the cart
                    System.out.println("\nItems in your cart:");
                    user.getShoppingCart().viewCart();
                    break;

                case 4: // View total price of the cart
                    System.out.println("Total Price: $" + user.getShoppingCart().getTotalPrice());
                    break;

                case 5: // Checkout and place order
                    if (user.getShoppingCart().getTotalPrice() > 0) {
                        System.out.println("Placing your order...");
                        Order order = new Order(orderID++, user.getShoppingCart().cartItems);
                        user.getOrderHistory().addOrder(order);
                        user.getShoppingCart().cartItems.clear(); // Clear cart after checkout
                        System.out.println("Order placed successfully! Order ID: " + order.getOrderID());
                    } else {
                        System.out.println("Your cart is empty. Add items before checking out.");
                    }
                    break;

                case 6: // View order history
                    System.out.println("\nOrder History:");
                    user.getOrderHistory().viewOrderHistory();
                    break;

                case 0: // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }


    }
}
