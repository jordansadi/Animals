package edu.wctc.jsadi;

/**
 * Created by mgreen14 on 12/27/17.
 * @author Matt Green
 * @version 2018 0822 .3
 */
public abstract class Person {
    private String name;

    /**
     * This constructor creates an instance of a Person using a specified name
     * @param name the name of the Person instance
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * This method returns a String of the Person's name
     * @return String the name of the Person
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the name of the Person to a specified new value
     * @param name the new name of the Person
     */
    public void setName(String name) {
        this.name = name;
    }
}