
package javaapplication2;

/**
 *
 * @author carlos.hernandez107
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Closing");
        System.out.print(".");
        Thread.sleep(1000); // Just to give the user a chance to see "hello".
        System.out.print(".");
        Thread.sleep(1000);//2000ms = 2s
        System.out.print(".");
        Thread.sleep(1000);//2000ms = 2s
        
        System.out.print("\b\b\b");
        
        
        System.out.println("Closed");
    }
    
}
