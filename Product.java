/**
 * ---------------------------------------------------------------------------
 * File name: Product.java
 * Project name:HW08//Project
 * ---------------------------------------------------------------------------
 * Creator's name and email: Sydnie Dery, derysf@etsu.edu
 * Course:  CSCI 1250 942
 * Creation Date: November 2, 2020
 * ---------------------------------------------------------------------------
*/
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 * Implements a Product class with JOptionPane 
 * to create a Product object with a price and description
 * 
 * Date created: November 2, 2020
 * 
 * @author Sydnie Dery
*/

public class Product 
{
    private String item; //to hold product name
    private String description; //to hold product description
    private double price; //to hold product price
    private String formattedPrice; //to hold the price formatted
    private int available;
    
    /**
     * Constructor to create a product item. With a price, description and name
     * 
     * Date created: November 2, 2020
     * 
     * @param item String of the product's name
     * @param description String of the product's description
     * @param price int of the product's cost
     */
    public Product(String item, String description, double price, int available)
    {
        this.item = item;
        this.description = description;
        this.price = price;
        this.available = available;
    }

    //create a formatter
    DecimalFormat dec = new DecimalFormat("$##,##0.00");

    /**
     * Accessor for the description
     * 
     * Date created: November 2, 2020
     * 
     * @return description String
     */
    public String getDescription() 
    {
        return description;
    }

    /**
     * Accessor for the item
     * 
     * Date created: November 2, 2020
     * @return item String
     */
    public String getItem() 
    {
        return item;
    }

    /**
     * Accessor for the price
     * 
     * Date created: November 2, 2020
     * 
     * @return price double
     */
    public double getPrice() 
    {
        return price;
    }

    /**
     * Accessor for the number of the item available
     * 
     * Date created: November 21, 2020
     * 
     * @return available int
     */
    public int getAvailable()
    {
        return available;
    }

    /**
     * Mutator for the description
     * 
     * Date created: November 2,2020
     * 
     * @param description String of item's description
     */
    public void setDescription(String description) 
    {
        this.description = description;
    }

    /**
     * Mutator for the item name
     * 
     * Date created: November 2,2020
     * 
     * @param item String of item name
     */
    public void setItem(String item) 
    {
        this.item = item;
    }

    /**
     * Mutator for the price
     * 
     * Date created: November 2, 2020
     * 
     * @param price double  of item's price
     */
    public void setPrice(double price) 
    {
        this.price = price;
    }

    /**
     * Mutator for the available items
     * 
     * Date created: November 22, 2020
     * 
     * @param available int of available items
     */
    public void setAvailable(int available)
    {
        this.available = available;
    }

    /**
     * Format the price to be $###,##0.00
     * 
     * Date created: November 2, 2020
     * 
     * @return String of the formatted price
     */
    public String formatPrice() 
    { 
        formattedPrice = dec.format(price);
        //JOptionPane.showMessageDialog(null, formattedPrice);
        return formattedPrice;
    }

    /**
     * Put the item name, descrption, and price into one String
     * 
     * Date created: November 2, 2020
     * 
     * @return String of the item's information
     */
    public String toString()
    {
        String msg = "";

        msg += "\n" + item;
        msg += "\nDescription:  " + description;
        msg += "\nCost: " + price;
        msg += "\nAvailable: " + available;

        return msg;
    }
    
}
