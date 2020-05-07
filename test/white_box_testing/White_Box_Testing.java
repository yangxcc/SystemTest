package white_box_testing;

import org.junit.Test;

public class White_Box_Testing {

    Calculate calculate = new Calculate();
    int size = 10; // 数组的长度,暂定为10

    @Test
    public void testInit(){
        calculate.init(size);
        for (int i =0;i<size;i++){
            System.out.println(calculate.score[i]);
        }
        System.out.println(calculate.score.length);
    }

    @Test
    public void testCalculateValue(){
        float average = calculate.calculate_value(size);
//        for (int i =0;i<size;i++){
//            System.out.println(calculate.score[i]);
//        }
//        System.out.println("****************************");
        System.out.println(average);
    }
}
