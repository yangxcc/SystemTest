package unit;

import org.junit.Test;

public class DataBaseTest {
    DataBaseOperate dbo ;

    @Test
    public void testgetCon(){
        dbo = new DataBaseOperate();
        dbo.getCon();
    }

    @Test
    public void testaddUser(){
        dbo = new DataBaseOperate();
        dbo.getCon();
        dbo.addUser("hhhhh","456789");
    }
}
