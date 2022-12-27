package test_basics;

import com.careerit.cj.basics.whileloop.GenerateNPrimes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeTest {
    @Test
    void testisprime(){
        GenerateNPrimes obj= new GenerateNPrimes();
        boolean actual=obj.isPrime(17);
        Assertions.assertEquals(true,actual);
    }
    @Test
    void testisnotprime(){
        GenerateNPrimes obj= new GenerateNPrimes();
        boolean actual=obj.isPrime(27);
        Assertions.assertEquals(false,actual);
    }
    @Test
    void testisnegative(){
        GenerateNPrimes obj= new GenerateNPrimes();
        boolean actual=obj.isPrime(-17);
        Assertions.assertEquals(false,actual);
    }

}
