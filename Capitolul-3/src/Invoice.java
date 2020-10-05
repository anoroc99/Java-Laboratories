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

public class Invoice {

    private String number;
    private String description;
    private int quantity;
    private double price;

    //  Constructor
    public Invoice(String number, String description, int quantity, double price)
    {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    } // end constructor

    // Method to get invoice amount
    public double getInvoiceAmount()
    {
        return quantity * price;
    }

    // Set method for number
    public void setNumber(String number)
    {
        this.number = number;
    } // end method setNumber

    // Get method for number
    public String getNumber()
    {
        return number;
    } // end method getNumber

    // Set method for description
    public void setDescription(String description)
    {
        this.description = description;
    } // end method setDescription

    // Get method for description
    public String getDescription()
    {
        return description;
    } // end method getDescription

    // Set method for quantity
    public void setQuantity(int quantity)
    {
        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;
    } // End method setQuantity

    // Get method for quantity
    public int getQuantity()
    {
        return quantity;
    } // end method getQuantity

    // Set method for price
    public void setPrice(double price)
    {
        if (price > 0)
            this.price = price;
        else
            this.price = 0;
    } // end method setPrice

    // Get method for price
    public double getPrice()
    {
        return price;
    } // end method getPrice
} // end class Invoice