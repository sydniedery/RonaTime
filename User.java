/**
 * ---------------------------------------------------------------------------
 * File name: User.java
 * Project name: Project
 * ---------------------------------------------------------------------------
 * Creator's name and email: Sydnie Dery, derysf@etsu.edu
 * Course:  CSCI 1250 942
 * Creation Date: October 18, 2020
 * ---------------------------------------------------------------------------
*/
import javax.swing.JOptionPane;
import java.util.Random;
/**
 * Implements a User class to create a User with a name, age, money owned, health
 * level, if they have corona or not. User also has a job, toilet paper, germex, and food supply.
 * 
 * 
 * Date created: October 18, 2020
 * 
 * @author Sydnie Dery
*/
public class User 
{
    private String name; //to hold the user's name
    private String monthlyMessage = "\n"; //to hold the message abour how much tp, food, and germex user has
    private int age; //to hold the user's age
    private int foodSupply; //to hold how many months of food the user has
    private int tp; //to hold how many months of toilet paper a user has
    private int germex; //to hold how much germex/santizing kits a user has
    private int month = 1; //to hold what month it is
    private int money; //to hold the user's money
    private int health; //to hold the user's health
    private int job; //to hold the user's job
    private boolean corona = false; //to hold if the user has corona or not
    private boolean testedPositive = false; //to hold if the user has tested for corona or not
    private boolean goodTreatment; //to hold if the user's treatment worked or not
    private Random rand = new Random(); //instantiate a random generator


    /**
     * Constructor for the User class with no params 
     * 
     * Date created: November 17, 2020
     */
    public User()
    {

    }

    /**
     * Constructor to create a User with a name, age, corona positivity, and health points
     * 
     * Date created: November 17, 2020
     * 
     * @param name String
     * @param age int
     * @param corona boolean
     * @param money int
     * @param health int
     */
    public User(String name, int age, boolean corona, int money, int health)
    {
       setName(name);
       setAge(age);
       setCorona(corona);
       setMoney(money);
       setHealth(health);
    }

    /**
     * Acessor method for the name
     * 
     * Date created: October 19, 2020
     * 
     * @return name String
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Acessor for the age
     * 
     * Date created: October 19, 2020
     * 
     * @return age int
     */
    public int getAge() 
    {
        return age;
    }
    
    /**
     * Acessor for the health
     * 
     * Date created: October 19, 2020
     * 
     * @return heath int
     */
    public int getHealth() 
    {
       return health;
    }

    /**
     * Acessor for the money
     * 
     * Date created: October 19, 2020
     * 
     * @return money int
     */
    public int getMoney() 
    {
       return money;
    }

    /**
     * Acessor for if the user has corona or not
     * 
     * Date created: October 19, 2020
     * 
     * @return corona boolean
     */
    public boolean getCorona()
    {
       return corona;
    }

    /**
     * Acessor for the monthly message
     * 
     * Date created: October 19, 2020
     * 
     * @return monthlyMessage String
     */
    public String getMonthlyMessage() 
    {
        return monthlyMessage;
    }

    /**
     * Acessor for the germex/sanitzer kits
     * 
     * Date created: October 19, 2020
     * 
     * @return germex int
     */
    public int getGermex() 
    {
        return germex;
    }
 
    /**
     * Acessor for the toilet paper
     * 
     * Date created: October 19, 2020
     * 
     * @return tp int
     */
    public int getTp() 
    {
        return tp;
    }

    /**
     * Acessor for the month
     * 
     * Date created: October 19, 2020
     * 
     * @return month int
     */
    public int getMonth()
    {
        return month;
    }
 
    /**
     * Acessor for getTestedPositive
     * 
     * Date created: October 19, 2020
     * 
     * @return getTestedPositive boolean
     */
    public boolean getTestedPositive()
    {
        return testedPositive;
    }

    /**
     * Acessor for goodTreatment
     * 
     * Date created: October 19, 2020
     * 
     * @return goodTreatment boolean
     */
    public boolean getGoodTreatment()
    {
        return goodTreatment;
    }
    
    /**
     * Acessor for the foodSupply
     * 
     * Date created: October 19, 2020
     * 
     * @return foodSupply int
     */
    public int getFoodSupply() 
    {
       return foodSupply;
    }

    /**
     * Acessor for the job
     * 
     * Date created: October 19, 2020
     * 
     * @return job int
     */
    public int getJob() 
    {
        return job;
    }

    /**
     * Mutator for the name
     * 
     * Date created: October 19, 2020
     * 
     * @param name String
     */
    public void setName(String name) 
    {
       this.name = name;
    }

    /**
     * Mutator for the age
     * 
     * Date created: October 19, 2020
     * 
     * @param age int
     */
    public void setAge(int age) 
    {
       this.age = age;
    }

    /**
     * Mutator for the health
     * 
     * Date created: October 19, 2020
     * 
     * @param health int
     */
    public void setHealth(int health) 
    {
       this.health = health;
    }

    /**
     * Mutator for the money
     * 
     * Date created: October 19, 2020
     * 
     * @param money int
     */
    public void setMoney(int money) 
    {
       this.money = money;
    }

    /**
     * Mutator for the corona
     * 
     * Date created: October 19, 2020
     * 
     * @param corona boolean
     */
    public void setCorona(boolean corona) 
    {
       this.corona = corona;
    }

    /**
     * Mutator for the food supply
     * 
     * Date created: October 19, 2020
     * 
     * @param foodSupply int
     */
    public void setFoodSupply(int foodSupply) 
    {
       this.foodSupply = foodSupply;
    }

    /**
     * Mutator for the name
     * 
     * Date created: October 19, 2020
     * 
     * @param germex int
     */
    public void setGermex(int germex) 
    {
       this.germex = germex;
    }

    /**
     * Mutator for tp
     * 
     * Date created: October 19, 2020
     * 
     * @param tp int
     */
    public void setTp(int tp) 
    {
       this.tp = tp;
    }

    /**
     * Mutator for the job
     * 
     * Date created: October 19, 2020
     * 
     * @param job int
     */
    public void setJob(int job) 
    {
       this.job = job;
    }

    /**
     * Mutator for goodTreatment
     * 
     * Date created: October 19, 2020
     * 
     * @param goodTreatment boolean
     */
    public void setGoodTreatment(boolean goodTreatment) 
    {
       this.goodTreatment = goodTreatment;
    }

    /**
     * Mutator for the month
     * 
     * Date created: October 19, 2020
     * 
     * @param month int
     */
   public void setMonth(int month) 
   {
       this.month = month;
   }
   
    /**
     * Mutator for the monthlyMessage
     * 
     * Date created: October 19, 2020
     * 
     * @param monthlyMessage String
     */
    public void setMonthlyMessage(String monthlyMessage) 
    {
        this.monthlyMessage = monthlyMessage;
    }

    /**
     * Remove 1 from the health
     * 
     * Date created: November 2, 2020
     * 
     * @return health int
     */
    public int minusHealth()
    {
       health -= 1;
       return health;
    }

    /**
     * Add one to the month, remove 1 from the foodSupply (because you ate)
     * if no food is available, loose 1 health point
     * add a health point if there are sanitizing kits, then remove one
     * remove 1 from toilet paper if available
     * 
     * Date created: November 2, 2020
     * 
     * @return month int
     */
    public int nextMonth()
    {
       if(foodSupply > 0)
       {
           foodSupply -= 1;
       }
       else
       {
           health -= 1;
           monthlyMessage += "\nStarvation is not good for your health. Check out the grocery store to buy food.";

       }
       if(germex > 0)
       {
           germex -= 1;
           health += 1;
           monthlyMessage += "\nThe Sanitizing kit was worth the price. +1 health";
       }
       if(tp > 0)
       {
           tp -= 1;
       }
       else
       {
           monthlyMessage += "\nHey , Mr. PoopyButthole, might wanna look into getting some toilet paper. The people around you don't like that stench.";
       }
       month += 1;
       return month;
    }
    /**
     * add the money, amount depending on the job 
     * 
     * Date created: November 2, 2020
     */
    public void paycheck()
    {
        switch(job)
        {
            case 1:
                money += 999999;
                break;
            case 2: 
                money += 1000;          
                break;
            case 3: 
                money += 50;

                break;
            default:
                break;
        }
    }

    /**
     * Ask user if they want to pay and get tested. If so, tell them if they 
     * have corona or not
     * 
     * Date created: November 12, 2020
     */
   public void getTested()
   {
       String input = JOptionPane.showInputDialog("It costs $80 to get tested. You have $" + money + ". Do you want to get tested? (Yes or No)");
       if(input.toLowerCase().equals("yes") && money >= 80)
       {
           if(corona == true)
            {
                JOptionPane.showMessageDialog(null, "You have tested positve for Corona ");
                testedPositive = true;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You have tested negative for Corona "); 
            }
            money -= 80;
            
       }
       //if the user doesn't have the money
       else if(input.toLowerCase().equals("yes") && money < 80)
       {
            JOptionPane.showMessageDialog(null, "You do not have enough money to get tested. If you are" +
                                                " a President or a Cashier, you can move to next month and" +
                                                "get a paycheck. If you are laid off, you will not get a paycheck.");
       }
       else
        {
           JOptionPane.showMessageDialog(null, "You have opted not to get tested.");
           if(corona == true)
           {
               health -= 2;
           }
        }
   }

   /**
    * Method to maybe recover from corona if they have the money for it
    * 
    * Date created: November 17, 2020
    */
    public void homeRemedy()
    {
       if(money >= 30)
       {
           money -= 30;
           int chances = rand.nextInt(80);
           if(chances == 5)
           {
               JOptionPane.showMessageDialog(null, "Your condition worsens. Maybe try to splurge for better treatment:)");
               health -= 1;
               goodTreatment = false;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You start feeling better. ");
                goodTreatment = true;
            }
       }
    }

    /**
     * Method to treat corona if the user has the money to pay for it
     * 
     * Date Created: November 17, 2020
     */
   public void emergencyRoom()
   {
       if(money >= 500)
       {
           money -= 500;
           int chances = rand.nextInt(500);
           if(chances == 5)
           {
               JOptionPane.showMessageDialog(null, "Yikes, you aren't doing any better, and that was expensive. You might want to try something else.");
               health -= 1;
               goodTreatment = false;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You start feeling better. Maybe stop going anywhere but work?");
                goodTreatment = true;
         }
       }
    }

    /**
     * Method to treat corona if they have the money for it
     * 
     * Date created: November 17, 2020
     */
     public void stemCell()
    {
        if(money >= 100000)
        {
            money -= 100000;
            int chances = rand.nextInt(100000);
            if(chances == 5)
            {
                JOptionPane.showMessageDialog(null, "You must be SICK SICK if this didn't work, yikes. Maybe try again or try something new?");
                health -= 1;
                goodTreatment = false;
            }
            else
            {
                JOptionPane.showMessageDialog(null, " You Tweet \"Feeling really good! Don't be afraid of Covid... I feel better than I did 20 years ago!\"");
                goodTreatment = true; 
            }
        }
    }

    /**
     * method to ask user what their information is to create a User object
     * 
     * Date created: October 18, 2020
     */
    public void makeUser()
    {
       askName();
       askAge();
       askJob();
       User character = new User(name, age, corona, money, health);
    }

    /**
     * Method to ask user what their name is
     * 
     * Date created: October 17, 20200
     */
   public void askName()
   {
       name = JOptionPane.showInputDialog("What is your name?");
       
   }

   /**
    * Method to ask the user what they want the character's age is
    * 
    * Date created: October 17, 2020
    */
   public void askAge()
   {
       String input = JOptionPane.showInputDialog("What is your player's age?\n (This will effect your health points)");
       age = Integer.parseInt(input);
       while(age < 18)
       {
           input = JOptionPane.showInputDialog("Invalid input. Please enter an age 18 or above.");
           age = Integer.parseInt(input);
        }
       assignHealth();
    }

    /**
     * Assign health points depending on the user's age
     * 
     * Date Created: November 22, 2020
     */
    public void assignHealth()
    {
       if(age >= 18 && age < 24 )
        {   
            health = 15;
        }
        else if(age < 36)
        {
            health = 13;
        }
        else if(age < 46)
        {
            health = 10;
        }
        else if(age < 61)
        {
            health = 8;
        }
        else if(age < 76)
        {
            health = 5;
        }
        else if(age > 75)
        {
            health = 3;
        }
     }

    /**
     * Ask user what they want the job to be and store it
     * 
     * Date created: October 17, 2020
     */
    public void askJob()
    {
       while( job != 1 && job != 2 && job != 3)
       {
           String input = JOptionPane.showInputDialog("What is your job?\n" +
                                    "1. President (Easy Mode)\n" +
                                    "2. Grocery Store Cashier (Medium Mode)\n" +
                                    "3. Laid off from job (Hard Mode)");
            job = Integer.parseInt(input);
            switch(job)
            {
                case 1:
                    money = 999999;
                    health += 1;
                    break;
                case 2: 
                    money = 2000;
                    health -= 1;
                    break;
                case 3: 
                    money = 800;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error, enter in 1,2, or 3.");
            }
        }
    }

    /**
     * If the user has corona, show a symptom that is randomly chosen
     * from the premade ones
     * 
     * Date created: October 18, 2020
     */
    public void showSymptoms()
    {
       if(corona = true)
       {
           int ranNum = rand.nextInt(7);
           if(ranNum == 0)
           {
               JOptionPane.showMessageDialog(null, "You develop a nasty cough. It kinda sounds like a goose honking??");
           }
           else if(ranNum == 1)
           {
               JOptionPane.showMessageDialog(null, "Your daily Starbar's Coffee no longer has a taste, uh oh.");
           }
           else if(ranNum == 2)
           {
               JOptionPane.showMessageDialog(null, "While walking to your aparatment you get out of breath. You're out of shape, but not that bad.");
           }
           else if(ranNum == 3)
           {
               JOptionPane.showMessageDialog(null, "Every time you talk it feels like razorblades are sliding down your throat. (That's not good, pal!)");
           }
           else if(ranNum == 4)
           {
               JOptionPane.showMessageDialog(null, "You have a raging headache, and your throat is sore. (and no, you aren't hungover)");
           }
           else if(ranNum == 5)
           {
               JOptionPane.showMessageDialog(null, "Waterfalls out of both ends. You might want to get that checked out....");
           }
           else if(ranNum == 6)
           {
               JOptionPane.showMessageDialog(null, "It's hard to breathe, your muscles and bodies ache.. \"What is going on???\" you think. ");
           }
                health -= 1;
       }
    }

    /**
     * toString to display user's name, age, if they have tested for corona and the results, 
     * if they got treated and recovered, money, health, food, month, toilet paper
     * sanitizing kits. Then shows the message. Reset the monthlyMessage for the next month.
     * 
     * Date created: October 18, 2020
     */
    public String toString()
    {
       String msg = "";
       msg += "Name: " + name;
       msg += "\nAge: " + age;
       if(testedPositive == true)
       {
           msg += "\nCorona Status: Positive";
       }
       else if(testedPositive == false)
       {
           msg += "\nCorona Status: Negative or unknown";
       }
       if(goodTreatment == true)
       {
           msg += "\nCorona Status: Tested postive and recovered. \n         Try not to get it again, please..." ;
       }
       msg += "\nMoney: " + money;
       msg += "\nHealth: " + health;
       msg += "\nMonth:" + month;
       msg += "\nFood: " + foodSupply + " months worth";
       msg += "\nToilet Paper: " + tp + " months worth";
       msg += "\nSanitizing kits: " + germex;
       msg += monthlyMessage;
       JOptionPane.showMessageDialog(null, msg);
       monthlyMessage = "";
       return msg;
    }
}
