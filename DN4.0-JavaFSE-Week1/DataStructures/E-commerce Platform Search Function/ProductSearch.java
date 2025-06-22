package week1;

public class ProductSearch {
    public static int searchProduct(String[] products, String target) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] products = {"Laptop", "Phone", "Camera", "Tablet"};
        String target = "Phone";

        int index = searchProduct(products, target);

        if (index != -1)
            System.out.println("✅ Product found at index: " + index);
        else
            System.out.println("❌ Product not found");
    }
}
