
import java.util.*;

/**
 * 
 */
public interface CalculateNumber {

    /**
     * @param x int 
     * @param y int 
     * @return
     */
    public int add(void x int, void y int);

    /**
     * @param x int 
     * @param y int 
     * @return
     */
    public int substract(void x int, void y int);

    /**
     * @param x double 
     * @param y double 
     * @return
     */
    public double multiply(void x double, void y double);

    /**
     * @param a int 
     * @return
     */
    public int square(void a int);

    /**
     * @param x int 
     * @param y int 
     * @return
     */
    public double divide(void x int, void y int);

    /**
     * @param x int 
     * @param y int 
     * @return
     */
    public abstract double modulo(void x int, void y int);

}