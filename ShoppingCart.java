
import java.util.ArrayList; import
java.util.List;
public class ShoppingCart {
private List<Product> items;
 public ShoppingCart() {
this.items = new ArrayList<>();
 }

 public void addItem(Product product) {
items.add(product);
 }
 public void removeItem(int index) {
if (index >= 0 && index < items.size()) {
items.remove(index);
 System.out.println("Item removed from the cart.");
 } else {
 System.out.println("Invalid index. Please enter a valid item index.");
 }
 }
 public double calculateTotal() { return
items.stream().mapToDouble(Product::getPrice).sum();
 }
 public List<Product> getItems() {
return items;
 }
 public void displayCart() {
 System.out.println("===== Shopping Cart =====");
for (int i = 0; i < items.size(); i++) {
 Product product = items.get(i);
 System.out.println(i + ". " + product.getName() + " - $" +
product.getPrice());
 System.out.println(" Description: " + product.getDescription());
 }
 System.out.println("Total: $" + calculateTotal());
 }
 public void checkout() {
 System.out.println("Total amount to pay: $" + calculateTotal());
 System.out.println("Thank you for shopping!");
 System.exit(0);
 }
}
