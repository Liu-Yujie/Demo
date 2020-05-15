package solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemHandlerTest {

    @Test
    public void testFindMethod(){
        int[] arr = new int[]{8,10,2,3,6,1,5};
        int tem = ProblemHandler.findSpecificNum(arr,3);
        System.out.println(tem);
    }
}