import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Fashion"),
                new Product(103, "Phone", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Fashion")

        };

        System.out.println("Linear Search:");

        Product p1 = LinearSearch.search(products, "Phone");

        if (p1 != null)
            p1.display();
        else
            System.out.println("Product not found");

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        System.out.println("\nBinary Search:");

        Product p2 = BinarySearch.search(products, "Phone");

        if (p2 != null)
            p2.display();
        else
            System.out.println("Product not found");
    }
}