
import java.util.ArrayList; import
java.util.List;
13
public class ProductCatalog {
private List<Product> products;
 public ProductCatalog() {
 this.products = new ArrayList<>(); // Add some sample products
products.add(new Product("Laptop", 999.99, "Powerful laptop for your
computing needs")); products.add(new Product("Smartphone", 299.99,
"Feature-rich smartphone with the latest technology"));
products.add(new Product("Headphones", 79.99, "High-quality
headphones for an immersive audio experience"));
 }
 public void displayProductCatalog() {
 System.out.println("===== Product Catalog =====");
for (int i = 0; i < products.size(); i++) {
 Product product = products.get(i);
 System.out.println(i + ". " + product.getName() + " - $" +
product.getPrice());
 System.out.println(" Description: " + product.getDescription());
 }
 }
 public Product getProductByIndex(int index) {
if (index >= 0 && index < products.size()) {
return products.get(index);
 }
 return null;
 }
}