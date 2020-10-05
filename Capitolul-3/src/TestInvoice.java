class TestInvoice {
    public static void main(String[] args) {
        printInfo(new Invoice("100", "Flowers", 21, 40));
        System.out.println();
        printInfo(new Invoice("", "", 6, 5));
        System.out.println();
        printInfo(new Invoice(null, null, -6, -9));
        System.out.println();


    }

    private static void printInfo(Invoice invoice) {
        System.out.printf("PartNumber: %s%nDescription: %s%nQuantity: %d%nPrice: $%.2f%nInvoice Amount: $%.2f%n",
                invoice.getPartNumber(), invoice.getDescription(), invoice.getQuantity(),
                invoice.getPrice(), invoice.getInvoiceAmount());
    }
}