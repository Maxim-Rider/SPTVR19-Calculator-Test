

import calc.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest {
    private static Calculator obj; //объявляем статический объект класса 
    
    @BeforeClass //инициализация объекта должна выполняться 
                //перед выполнением каждого теста
    public static void RunT(){ //метод инициализации объекта
        obj=new Calculator();
        }
       
    @Test
        public void test_liitmine(){
            double tulemus=obj.liitmine(3,5);
            //if (tulemus!=8) Assert.fail();
            //Assert.assertTrue("Liitmine ei toota",tulemus==1);
            //Assert.assertFalse("Liitmine ei toota",tulemus==1);
            //Assert.assertNull(obj);
            Assert.assertNotEquals("liitmine ei toota",8);
    }
    ///////////////////////////////////////////
     
        @Test
        public void test_lahutamine(){
            double tulemus=obj.lahutamine(15,5);
            Assert.assertTrue(tulemus==10);
    }
        ///////////////////////////////////////////
        @Test
        public void test_korrutamine(){
            double tulemus=obj.korrutamine(5,5);
            if (tulemus!=25) Assert.fail();
    }
     ///////////////////////////////////////////
        @Test
        public void test_jagamine(){
            double tulemus=obj.jagamine(15,5);
            if (tulemus!=3) Assert.fail();
    }
}
