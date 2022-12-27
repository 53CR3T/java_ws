package test_basics;

import com.careerit.cj.basics.MissingNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {
    @Test
    void withmissingnumbertest(){
        MissingNumber obj= new MissingNumber();
        int num =obj.missingnumber(new int[]{2,3,1,4,5},new int[]{2,3,4,1});
        Assertions.assertEquals(5,num);
    }
}
