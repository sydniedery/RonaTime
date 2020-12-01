/**
 * ---------------------------------------------------------------------------
 * File name: Location.java
 * Project name: Project
 * ---------------------------------------------------------------------------
 * Creator's name and email: Sydnie Dery, derysf@etsu.edu
 * Course:  CSCI 1250 942
 * Creation Date: October 18, 2020
 * ---------------------------------------------------------------------------
*/
import java.util.Random;
/**
 * Implements a Location class to create a Location with a name, capacity,  and if it 
 * is indoor or outside
 * 
 * Date created: October 18, 2020
 * 
 * @author Sydnie Dery
 */
public class Location 
{
    int cap; //to hold capapcity at the Location
    boolean outside; //to hold if it is outside or inside
    Random rand = new Random(); //to instantiate a random generator object
    String name; //to hold the nameof the Location

    public Location(String name, int cap, boolean outside)
    {
        setName(name);
        setCap(cap);
        setOutside(outside);
    }

    /**
     * Acessor for the capacity
     * 
     * Date created: October 18, 2020
     * 
     * @return cap int
     */
    public int getCap() 
    {
        return cap;
    }
     
    /**
     * Acessor for if it is outside or not
     * 
     * Date created: October 18, 2020
     * 
     * @return outside boolean
     */
    public boolean getOutside()
    {
        return outside;
    }

    /**
     * Acessor for the name
     * 
     * Date created: October 18, 2020
     * 
     * @return name String
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Mutator for the capacity
     * 
     * Date created: October 18, 2020
     * 
     * @param cap int
     */
    public void setCap(int cap) 
    {
        this.cap = cap;
    }

    /**
     * mutator for the name
     * 
     * Date created: October 18, 2020
     * 
     * @param name String
     */
    public void setName(String name) 
    {
        this.name = name;
    }

    /**
     * mutator for the outside boolean
     * 
     * Date created: October 18, 2020
     * 
     * @param outside boolean
     */
    public void setOutside(boolean outside) 
    {
        this.outside = outside;
    }

    /**
     * Give the user corona depending on the capacity and if the location is indoor or outdoor
     * 
     * Date created: November 2, 2020
     * 
     * @param user User
     * @return user User
     */
    public User contractCorona(User user)
    {
        if(outside == true)
        {
            if(cap <25)
            {
                int randomInt = rand.nextInt(30000);
                if(randomInt == 53)
                {
                   user.setCorona(true);
                }

             }
            else if(cap < 100)
            {
                int randomInt = rand.nextInt(25000);      
                if(randomInt == 53)
                {
                    user.setCorona(true);
                }
            }
            else if(cap < 250)
            {
                int randomInt = rand.nextInt(20000);
                if(randomInt == 53)
                {   
                    user.setCorona(true);
                }
            }
            else if(cap < 400)
            {
                int randomInt = rand.nextInt(10000);
                if(randomInt == 13 || randomInt == 42)
                {
                    user.setCorona(true);
                }
            }
            else if(cap < 800)
            {
                int randomInt = rand.nextInt(5000);
                if(randomInt == 13 || randomInt == 42)
                {
                    user.setCorona(true);
                }

            }
        }
        else if(outside == false)
        {
            if(cap <25)
            {
                int randomInt = rand.nextInt(50000);
                if(randomInt == 53)
                {
                   user.setCorona(true);
                }

             }
            else if(cap < 100)
            {
                int randomInt = rand.nextInt(30000);      
                if(randomInt == 53)
                {
                    user.setCorona(true);
                }
            }
            else if(cap < 250)
            {
                int randomInt = rand.nextInt(25000);
                if(randomInt == 14)
                {   
                    user.setCorona(true);
                }
            }
            else if(cap < 400)
            {
                int randomInt = rand.nextInt(2500);
                if(randomInt == 13 || randomInt == 17)
                {
                    user.setCorona(true);
                }
            }
            else if(cap < 800)
            {
                int randomInt = rand.nextInt(1000);
                if(randomInt == 13 || randomInt == 42)
                {
                    user.setCorona(true);
                }

            }
         
        }
        return user;
    }
}
