//Capitolul 3, sarcina 3.12
//Create a class called Invoice that a hardware store might use to represent
//an invoice for an item sold at the store. An Invoice should include four pieces of information as
//instance variables—a part number (type String), a part description (type String), a quantity of the
//item being purchased (type int) and a price per item (double). Your class should have a constructor
//that initializes the four instance variables. Provide a set and a get method for each instance variable.
//In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
//multiplies the quantity by the price per item), then returns the amount as a double value. If the
//quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to
//0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.

class Invoice {

    private String partNumber;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String description, int quantity, double price) {
        if (partNumber == null || partNumber.isBlank())
            partNumber = "## No part number provided ##";

        if (description == null || description.isBlank())
            description = "## No description provided ##";

        // If the quantity is not positive, it should be set to 0
        if (quantity < 0)
            quantity = 0;

        // If the price per item is not positive, it should be set to 0.0.
        if (price <= 0.0)
            price = 0.0;

        this.partNumber = partNumber;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        if (partNumber != null && !partNumber.isBlank())
            this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description != null && !description.isBlank())
            this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0)
            this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0.0)
            this.price = price;
    }

    public double getInvoiceAmount() {
        return this.quantity * this.price;
    }
}