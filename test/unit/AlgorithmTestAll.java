package unit;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

public class AlgorithmTestAll extends TestSuite {

    @Test
    public void TestSuite(){
        TestSuite ts = new TestSuite();
        ts.addTestSuite(SequenceAlgorithm.class);     //参数必须必须是TestCase的子类
    }
}
