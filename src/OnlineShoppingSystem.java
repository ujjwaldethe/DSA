import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class OnlineShoppingSystem {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        ShoppingCart s = new ShoppingCart();
        int choice = 999;

        while( choice!=0)
        {
            System.out.println("Press \n1.Add Items \n2.RemoveItems \n3.View Items \n4.Total \n0.Exit ");
            choice= sc.nextInt();
            switch (choice)
            {
                case 1:
                    s.addItems();
                    break;
                case 2:
                    s.removeItems();
                    break;
                case 3:
                    s.viewCart();
                    break;
                case 4:
                    s.calculateTotalPrice();
                    break;
             }
        }
    }
}


// Class representing a Product
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

// Class representing the Shopping Cart
class ShoppingCart {
    private List<CartItem> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        for (CartItem item : cartItems) {
            if (item.getProduct().getProductID() == product.getProductID()) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        cartItems.add(new CartItem(product, quantity));
    }

    public void removeItem(Product product, int quantity) {
        cartItems.removeIf(item -> item.getProduct().getProductID() == product.getProductID()
                && item.getQuantity() == quantity);
    }

    public void viewCart() {
        for (CartItem item : cartItems) {
            System.out.println("Product: " + item.getProduct().getName() +
                    " | Quantity: " + item.getQuantity() +
                    " | Price: " + item.getProduct().getPrice());
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (CartItem item : cartItems) {
            total += item.getQuantity() * item.getProduct().getPrice();
        }
        return total;
    }
}

// Helper class to represent items in the cart
class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// Class representing an Order
class Order {
    private int orderID;
    private List<CartItem> orderItems;
    private double totalPrice;

    public Order(int orderID, List<CartItem> orderItems) {
        this.orderID = orderID;
        this.orderItems = new ArrayList<>(orderItems);
        this.totalPrice = calculateTotalPrice();
    }

    private double calculateTotalPrice() {
        double total = 0;
        for (CartItem item : orderItems) {
            total += item.getQuantity() * item.getProduct().getPrice();
        }
        return total;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getOrderID() {
        return orderID;
    }

    public void viewOrder() {
        System.out.println("Order ID: " + orderID);
        for (CartItem item : orderItems) {
            System.out.println("Product: " + item.getProduct().getName() +
                    " | Quantity: " + item.getQuantity() +
                    " | Price: " + item.getProduct().getPrice());
        }
        System.out.println("Total Price: " + totalPrice);
    }
}

// Class to handle the Order History
class OrderHistory {
    private List<Order> pastOrders;

    public OrderHistory() {
        pastOrders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        pastOrders.add(order);
    }

    public void viewOrderHistory() {
        for (Order order : pastOrders) {
            order.viewOrder();
        }
    }
}

// Class representing the User
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
