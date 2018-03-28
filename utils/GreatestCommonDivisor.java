/**
 * 
 * Minimo Comun Multipo
 * Greatest Common Divisor
 * @author Carlos Abraham
 */

public class Gcd{

    public static  void main(String[] args){

        Gcd a = new Gcd();
        System.out.println(
                a.gcd(2,3)+
                a.gcd(2,10)+
                a.gcd(25,35));
       
      
    }
    public int gcd(int m, int n){
        
        if(m % n == 0)
            return n;
        else
            return gcd(n, m%n);
    }
}
