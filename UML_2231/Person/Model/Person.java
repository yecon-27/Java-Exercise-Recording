
import java.util.*;

/**
 * 
 */
public abstract class Person {

    /**
     * Default constructor
     */
    public Person() {
    }

    /**
     * 
     */
    private String firstName;

    /**
     * 
     */
    private String lastName;

    /**
     * @return
     */
    public String displayName() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public abstract double pay();

}