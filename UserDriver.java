/**
 * ---------------------------------------------------------------------------
 * File name: UserDriver.java
 * Project name: Project
 * ---------------------------------------------------------------------------
 * Creator's name and email: Sydnie Dery, derysf@etsu.edu
 * Course:  CSCI 1250 942
 * Creation Date: October 18, 2020
 * ---------------------------------------------------------------------------
*/
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.ArrayList;
/**
 * Driver for the User, Location, Product, and ShoppingCart classes
 * Plays the Corona Time game where the user chooses things to do
 * like get groceries, get tested for Corona, get treated for Corona, throw a party,
 * and move to the next month
 * 
 * Date created: October 18, 2020
 * 
 * @author Sydnie Dery
*/
public class UserDriver 
{
    static User user = new User(); //to hold User object
    static Random rand = new Random(); //instantiate a random generator
    static Location groceryStore = new Location("WallyWorld", 212, false); //create a Location object
    static Location doctor = new Location("Dr. Grey's office", 100, false); //create a Location object
    static Location indoorRestaurant = new Location("Chili's", 150,false); //create a Location object
    static Location outdoorRestaurant = new Location("Macado's", 150, true); //create a Location object
    static Location party = new Location("Your Party", 900, false); //create a Location object
    static Product tp = new Product("Toilet Paper", "Wipe ya tushy with these 2 scratchy rolls. Sorry, these are the only ones in stock.", 7, rand.nextInt(11)+1); //create a Product object
    static Product germex = new Product("Sanitizing kit", "Keep the rona germs at bay, sanitizer, wipes, and spray", 100, rand.nextInt(7)+1); //create a Product object
    static Product greatValue = new Product("Store Brand Meals", "Enough Tastless Store Brand food to last you a month.", 200, 10000); //create a Product object
    static Product nameBrand = new Product("Name Brand Meals", "Delecious name brand meals to last you a whole month.", 600, 10000); //create a Product object
    static Product organicMeals = new Product("Organic Meals", "Scrumptious, organic, health meals to boost your health. Lasts a month.", 800, 1000); //create a Product object
    static ArrayList<Location> visited = new ArrayList<>(); //create an arrayList to hold Location objects
    static ShoppingCart basket = new ShoppingCart(); //create a ShoppingCart object

    /**
     * Main method that completes the objective described above
     * 
     * Date Created: October 18, 2020
     * 
     * @param args
     */
    public static void main(String[] args) 
    {
        welcome(); //show into to game
        user.makeUser(); //get user's input to make the User object

        //run main menu loop until user gives up, dies or lives through 12 months
       int choice;
       do
       {
           choice = whatToDoMenu();
           whatToDoSelection(choice);
        }while(choice != 0 && user.getMonth() < 12 && user.getHealth() > 0);  

        //if health points hit 0, user died
       if(user.getHealth() == 0)
       {
           JOptionPane.showMessageDialog(null, "You have died.");
           JOptionPane.showMessageDialog(null, placesVisited());  //list Locations visited

       }
       else if(choice != 0 ) //if the user lived through 12 months and didn't die or give up
       {
           JOptionPane.showMessageDialog(null, "Congrats! You lived through 1 year of the COVID-19 pandemic.");
           JOptionPane.showMessageDialog(null, placesVisited()); //list Locations visited

       }
       System.exit(0); //close
   }// end main  


   /**
    * Gives the user the choice of what to do
    * 
    * Date created: November 2, 2020
    * 
    * @return choice int of what user input to do with the menu
    */
   public static int whatToDoMenu()
   {
       String input = JOptionPane.showInputDialog("What would you like to do?" +
                                                "\n1. Go to the Grocery Store" +
                                                "\n2. Get tested" +
                                                "\n3. Get treated" + 
                                                "\n4. Go out to eat" + 
                                                "\n5. Throw a party!" +
                                                "\n6. Stay in quarantine\n Move forward 1 month" +
                                                "\n0. End Game/Give Up");
       
       int choice = Integer.parseInt(input);
       return choice;
   }

   /**
    * Method to follow through the choice from the menu 
    * 
    * Date created: November 2, 2020
    * 
    * @param choice int 
    */
    public static void whatToDoSelection(int choice)
    {
        switch(choice)
        {
            case 1: 
                groceryStore.contractCorona(user);
                mask();
                visitStore();
                setAllAvailable();
                user.showSymptoms();
                badChoice();
                
                visited.add(groceryStore);
                break;
            case 2:
                doctor.contractCorona(user);
                mask();
                user.getTested();
                visited.add(doctor);
                break;
            case 3: 
                doctor.contractCorona(user);
                mask();
                treatmentMenu();
                visited.add(doctor);
                break;
            case 4:
                mask();
                chooseRestaurant();
                badChoice();
                user.showSymptoms();
                break;
            case 5:
                badChoice();
                mask();
                party.contractCorona(user);
                user.showSymptoms();
                JOptionPane.showMessageDialog(null, "Wow! That party rocked!!");
                visited.add(party);
                break;
            case 6:
                user.nextMonth();
                user.paycheck();
                user.toString();
                if(user.getGoodTreatment() == true)
                {
                    user.setCorona(false);
                }

                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Giving up? Lame.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Input: Please enter 0-6");
                break;

        }


    }

    /**
     * Show user a welcome statement 
     * 
     * Date created: November 2, 2020
     */
   public static void welcome()
   {
       JOptionPane.showMessageDialog(null, "Welcome to Corona Time!" +
                                    "\nSee if you can make it through 12 months of the COVID-19 Pandemic." +
                                    "\nYour age will effect your health to begin with, and your job will effect the difficulty and your monthly income."
                                    + "\nYou can purchase things at the store, pay for doctor visits/treatments, and more.");
   }

   /**
    * Ask user what mask they want to wear, then maybe contract corona based on what mask they choose
    * 
    * Date created: November 2, 2020
    */
   public static void mask()
   {
       int choice = 0;
       while(choice != 1 && choice != 2 && choice != 3 & choice != 4 && choice !=5) 
       {
           String input = JOptionPane.showInputDialog("What mask are you wearing?" +
                                                    "\n1. New disposable mask" +
                                                    "\n2. Used disposable mask" +
                                                    "\n3. Reusable mask" +
                                                    "\n4. Face shield" +
                                                    "\n5. No mask");
            choice = Integer.parseInt(input);

            switch(choice)
            {
                case 1:
                    contractRona(5000);
                    break;
                case 2:
                    contractRona(1800);
                    break;
                case 3:
                    contractRona(2400);
                    break;
                case 4: 
                    contractRona(18000);
                    break;
                case 5:
                    contractRona(3000);
                    user.minusHealth();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Input. Please enter 1-5");
                    break;
            }
       }
       badChoice();
    }

    /**
     * User will have corona if the random int up to the param choices
     * (User has a 1/param chances of getting corona)
     * 
     * Date Created: November 2, 2020
     * 
     * @param chances
     */
   public static void contractRona(int chances)
   {
       int randomInt = rand.nextInt(chances);
       if(randomInt == 3)
       {
           user.setCorona(true);
       }
   }
   /**
    * Ask user what restaurant they want to go to 
    * add it to the arrayList of places visited and test to 
    * see if the user contracts corona
    *
    * Date created: November 7, 2020
    */
   public static void chooseRestaurant()
   {
       badChoice();
       String input = JOptionPane.showInputDialog("What restaurant do you want to go to?" +
                                    "\n1. Macado's (outdoor seating)" +
                                    "\n2. Chili's (indoor seating)");
        int choice = Integer.parseInt(input);
        if(choice == 1)
        {
            outdoorRestaurant.contractCorona(user);
            visited.add(outdoorRestaurant);
        }
        else if(choice == 2)
        {
            indoorRestaurant.contractCorona(user);
            visited.add(indoorRestaurant);
        }
        badChoice();
   }

   /**
    * If the user has corona and this is called, they will lose a health point
    *
    * Date createdL: November 17, 2020
    */
   public static void badChoice()
   {
       if(user.getTestedPositive() == true)
       {
           user.minusHealth();
        }
   }

   /**
    * Ask user what kind of treatment they want
    * Call the method for whichever treatment chosen
    *
    * Date created: November 17, 2020
    */
   public static void treatmentMenu()
   {
       int choice = 0;
       while(choice != 1 && choice != 2 && choice != 3)
       {
           String input = JOptionPane.showInputDialog("Which treatment option do you want? You have $" + user.getMoney() + "." +
                                                "\n1. At-home remedies: Vitamin C pills, hydration, essential oils. ($30)" +
                                                "\n2. Emergency Room ($500)" + 
                                                "\n3. Stem Cell Treatment ($100,000");
            choice = Integer.parseInt(input);
            switch(choice)
            {
                case 1:
                    user.homeRemedy();
                    badChoice();
                    break;
                case 2: 
                    user.emergencyRoom();
                    break;
                case 3:
                    user.stemCell();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter in 1, 2, or 3.");
            }   
        }
   }
   /**
    * Randomly generate the amount of tp and germex avaialable
    * Random events at the grocery store to maybe lose health points
    * 
    * Date created: November 21, 2020
    */
   public static void setAllAvailable()
   {
       tp.setAvailable(rand.nextInt(12));
       germex.setAvailable(rand.nextInt(45));
       if(rand.nextInt(25) == 17)
       {
           JOptionPane.showMessageDialog(null, "While getting groceries some old man whacked you in the knees as" +
                                        " you were trying to decide if you wanted to splurge on the Sanitizing kit or not." +
                                        "\nLose one health point");
            user.minusHealth();
       }
       else if(rand.nextInt(25) == 17)
       {
           JOptionPane.showMessageDialog(null, "You got trampled at the grocery store. Yikes, lose a health point.");
           user.minusHealth();

       }
       else if(rand.nextInt(25) == 17)
       {
           JOptionPane.showMessageDialog(null, "While trying to grab cans from the top shelf, the whole shelf falls on you. You made a fool of yourself. Lose a health point.");
           user.minusHealth();
       }
   }

   /**
    * Go to the grocery store by calling groceryStoreMenu and GroceryStoreSelection
    *
    * Date created: November 22, 2020
    */
   public static void visitStore()
   {
       int choice = 0;
       do
       {
           choice = groceryStoreMenu();
           groceryStoreSelection(choice);
       }while(choice != 0 && choice != 6);
   }

   /**
    * Show menu on groceries to buy and get user input on what they want
    * 
    * Date Created: November 22, 2020
    *
    * @return choice int
    */
   public static int groceryStoreMenu()
   {
       String input = JOptionPane.showInputDialog("Welcome to WallyWorld! What would you like to buy? You have $" + user.getMoney() +
                                                    "\n1: Store Brand Meals for One Month" +
                                                    "\n2: Name Brand Meals for One Month" +
                                                    "\n3: Organic Meals for One month" +
                                                    "\n4: Toilet Paper for One Month" +
                                                    "\n5: GermEx" + 
                                                    "\n6: CheckOut" +
                                                    "\n0: Leave WallyWorld empty handed");
        int choice = Integer.parseInt(input);
        return choice;
   }

   /**
    * Method for what the user chooses to do at the grocery store
    * 
    * Date created: November 22, 2020
    * 
    * @param choice int 
    */
   public static void groceryStoreSelection(int choice)
   {
       switch(choice)
       {
            case 1: 
                basket.addItem(greatValue, howMany(greatValue));
                user.setFoodSupply(user.getFoodSupply() + basket.getCount());
                break;
            case 2: 
                basket.addItem(nameBrand, howMany(nameBrand));
                user.setFoodSupply(user.getFoodSupply() + basket.getCount());
                break;
            case 3: 
                basket.addItem(organicMeals, howMany(organicMeals));
                user.setFoodSupply(user.getFoodSupply() + basket.getCount());
                break;
            case 4: 
                basket.addItem(tp, howMany(tp));
                user.setTp(user.getTp() + basket.getCount());

                break;
            case 5:
                basket.addItem(germex, howMany(germex));
                user.setGermex(user.getGermex() + basket.getCount());
                break;
            case 6:
                checkOut(user);
                break;
            case 0:
                //do nothing
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter 0-6.");

            
       }
   }

    /**
    * Method to ask user how many of a product they want and hold/ return the value
    * 
    * Date created: November 21, 2020
    *
    * @param prod Product 
    * @return amount int
    */
    public static int howMany(Product prod)
    {
        String input =  JOptionPane.showInputDialog(prod.toString() + "\nHow many do you want?");
        int amount = Integer.parseInt(input);
        return amount;
    }

    /**
     * Method to calculate the total of the basket
     * 
     * Date created: November 22, 2020
     * 
     * @param user User
     */
    public static void checkOut(User user)
    {
        basket.calcSubTotal(user);
        basket.calcGrandTotal();
        basket.receipt();
    }

    /**
     * Method to show user where they visited through the whole game
     * 
     * Date created: November 22, 2020
     * @return
     */
    public static String placesVisited()
    {
        String msg = "\nYou visited: ";
        for(Location location : visited)
        {
            msg += "\n" + location.getName();
        }
        return msg;
    }





}
