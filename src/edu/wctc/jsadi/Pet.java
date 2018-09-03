package edu.wctc.jsadi;

/**
 * Created by mgreen14 on 12/27/17.
 * @author Matt Green
 * @version 2018 0822 .3
 */
public abstract class Pet {
    protected String name;

    /**
     * This constructor creates an instance of a Pet with a specified name
     * @param name the name of the Pet instance
     */
    public Pet(String name) {
        this.name = name;
    }

    /**
     * This method returns the name of the Pet
     * @return String the name of the Pet
     */
    public String getName() {
        return name;
    }
}