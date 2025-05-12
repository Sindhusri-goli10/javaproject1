
import java.util.Scanner;
public class ECommerceApp {
 public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 ShoppingCart cart = new ShoppingCart();
ProductCatalog catalog = new ProductCatalog();
 while (true) {
 System.out.println("===== E-Commerce Management System =====");
 System.out.println("1. View Product Catalog");
 System.out.println("2. Add Product to Cart");
 System.out.println("3. View Cart");
 System.out.println("4. Remove Item from Cart");
 System.out.println("5. Checkout");
 System.out.println("6. Exit");
 System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
 switch (choice) {
case 1:
 catalog.displayProductCatalog();
break; case 2:
 System.out.print("Enter the index of the product to add to cart: ");
int productIndex = scanner.nextInt();
 Product selectedProduct=catalog.getProductByIndex(productIndex);
if (selectedProduct != null) { cart.addItem(selectedProduct);
 System.out.println("Product added to cart!");
 } else {
 System.out.println("Invalid product index. Please try again.");
 }
break; case 3:
cart.displayCart();
break; case 4:
 System.out.print("Enter the index of the item to remove from cart:");
int itemIndex = scanner.nextInt(); cart.removeItem(itemIndex);
break; case 5: cart.checkout(); break;
case 6:
 System.exit(0);
default:
 System.out.println("Invalid choice. Please try again.");
 }
 }
 }
}