public class TestInvoice {

    public static void main(String[] args)
    {

        Invoice product = new Invoice("100", "Red flowers", 40, 7.35);
        System.out.printf("Product number: %s", product.getNumber());
        System.out.printf("\nDescription: %s", product.getDescription());
        System.out.printf("\nQuantity: %d", product.getQuantity());
        System.out.printf("\nPrice Per Unit: $%.2f", product.getPrice());
        System.out.printf("\nInvoice Amount: $%.2f%n", product.getInvoiceAmount());
    }
} // end class TestInvoice