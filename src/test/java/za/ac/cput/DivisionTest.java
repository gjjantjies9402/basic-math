package za.ac.cput;
/* Gaynor Jantjies
    213069555
    01/04/2021
*/
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivisionTest

{   int Num1 =9;
    int Num2 =3;
    @Test
    public void dVsn()
    {

        int result =Num1/Num2;
        assertEquals(3,result);
    }

}