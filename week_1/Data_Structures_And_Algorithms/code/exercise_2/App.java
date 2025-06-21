package assignemts.cts;

public class App 
{
    public static void main( String[] args ) {
    	Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Table", "Furniture"),
                new Product(103, "Clothes", "Articles"),
                new Product(104, "Shoes", "Footwear"),
            };

            Product found1 = SearchAlgorithms.linearSearch(products, "Laptop");
            System.out.println("Linear Search Result: " + (found1 != null ? found1 : "Not Found"));

            SearchAlgorithms.sortProductsByName(products);
            Product found2 = SearchAlgorithms.binarySearch(products, "Clothes");
            System.out.println("Binary Search Result: " + (found2 != null ? found2 : "Not Found"));
    }
}
