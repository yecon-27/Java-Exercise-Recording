
import java.util.*;

/**
 * 
 */
public abstract class GeometricObject {

    /**
     * Default constructor
     */
    public GeometricObject() {
    }

    /**
     * 
     */
    private String color;

    /**
     * 
     */
    private boolean filled;

    /**
     * 
     */
    private java.util.Date dataCreated;

    /**
     * 
     */
    public void GeometricObject() {
        // TODO implement here
    }

    /**
     * @param color 
     * @param filled
     */
    public void GeometricObejct(String color, boolean filled) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getColor() {
        // TODO implement here
        return "";
    }

    /**
     * @param color 
     * @return
     */
    public void setColor(String color) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public boolean isFilled() {
        // TODO implement here
        return false;
    }

    /**
     * @param filled 
     * @return
     */
    public void setFilled(boolean filled) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public java.util.Date getDateCreated() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public abstract double getArea();

    /**
     * @return
     */
    public abstract double getPerimeter();

}