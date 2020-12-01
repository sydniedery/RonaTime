/**
 * ---------------------------------------------------------------------------
 * File name: ShoppingCart.java
 * Project name:HW08//Project
 * ---------------------------------------------------------------------------
 * Creator's name and email: Sydnie Dery, derysf@etsu.edu
 * Course:  CSCI 1250 942
 * Creation Date: November 2, 2020
 * ---------------------------------------------------------------------------
*/
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * Implements a ShoppingCart class with JOptionPane 
 * and an ArrayList to hold Product items and to calculate
 * the receipt and display it
 * 
 * Date created: November 2, 2020
 * 
 * @author Sydnie Dery
*/
public class ShoppingCart 
{
    private ArrayList<Product> cartItems; //to hold Products
    //private double tax; //to hold the amount of tax
    private int subTotal; //to hold the subtotal
    private int grandTotal; //to hold the total after tax is added
    //not needed for project private String prettySubTotal; //to hold the formatted sub total
    //not needed for project private String prettyTax; //to hold the formatted tax
    //not needed for project private String prettyGrandTotal; //to hold the formatted grand total
    private String allItems; //to hold one String of all the Products
    private int count; //to hold how many of an item was added

    //create formatter
    DecimalFormat dec = new DecimalFormat("$###,##0.00");

    /**
     * Constructor for the ShoppingCart that makes an array list
     * 
     * Date created: November 2, 2020
     */
    public ShoppingCart()
    {
        cartItems = new ArrayList<>();
    }

    /**
     * Add Product objects to the array list
     * 
     * Date created: November 2, 2020
     * Date edited: November 21, 2020
     * 
     * @param item Product object 
     * @param amount int of how many of the Product to add to the array list
     */
    public void addItem(Product item, int amount)
    {
        count = 0;

        if(amount < item.getAvailable())
        {
            for(int x = 0; x < amount; x++)
            {
                cartItems.add(item);
                count += 1;
            }
            JOptionPane.showMessageDialog(null, amount + " of " + item.getItem() +" have been added to your cart!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Only " + item.getAvailable() + " of " + item.getItem() + " are available. All have been added to your cart.");
            for(int x = item.getAvailable(); x > 0; x--)
            {
                cartItems.add(item);
                count += 1;
            }
        }
    }

    /**
     * return the number of a specific item added 
     * 
     * Date created: November 22, 2020
     * 
     * @return count int
     */
    public int getCount()
    {
        return count;
    }

    /**
     * Call the other methods to calculate the subtotal and grandtotal
     * 
     * Date created: November 22, 2020
     * 
     * @param user User
     */
    public void checkOut(User user)
    {
        calcSubTotal(user);
        calcGrandTotal();
    }


    /**
     * Create a String with every Product item from the array List
     * 
     * Date created: November 2, 2020
     */
    public void listAllItems()
    {
        allItems = "";
        for(Product product : cartItems)
        {
            allItems += product.getItem();
            allItems += ": $";
            allItems += product.getPrice();
            allItems += "\n";
        }
    }

    /**
     * Add together the price from every Product item in the array list
     * then format it to be $####,##0.00 and store it. Subtract the total from the user's money
     * 
     * Date created: November 2, 2020
     */
    public void calcSubTotal(User user)
    {
        for(Product product : cartItems)
        {
            subTotal += product.getPrice();
        }

        if(user.getMoney() > subTotal)
        {
            user.setMoney(user.getMoney() - subTotal);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Haha, you are broke. Your cart has been emptied. Try coming back when you have enough money.");
            cartItems.clear();
            subTotal = 0;
        }
        //not needed in project prettySubTotal = dec.format(subTotal);
    }

    /**
     * Calculate the tax on the subtotal, then format it
     * it to be $####,##0.00 and store it 
     * 
     * not needed in Corona Time
     * 
     * Date created: November 2, 2020
     * 
     * @param stateTax double to use to calculate the tax
     
    public void calcTax(double stateTax)
    {
        tax = subTotal * stateTax;
        prettyTax = dec.format(tax);
        
    }
    */

    /**
     * Calculate the grand total and then format 
     * it to be $####,##0.00 and store it
     * 
     * Date created: November 2, 2020
     */
    public void calcGrandTotal()
    {
        grandTotal = subTotal;
      //not needed for project  prettyGrandTotal= dec.format(grandTotal);
    }

    /**
     * Use JOptionPane to display every item by calling a method and then display the calculated,
     * formatted, sub total, tax, and grand total
     * 
     * Date created: November 2, 2020
     */
    public void receipt()
    {
        listAllItems();
        JOptionPane.showMessageDialog(null, "Items purchased:\n" +
                                    allItems + 
                                    "\nGrandTotal: " + grandTotal);
        cartItems.clear();
        subTotal = 0; //reset for next time it is used
        grandTotal = 0; //reset for next time it is used
    }


}
