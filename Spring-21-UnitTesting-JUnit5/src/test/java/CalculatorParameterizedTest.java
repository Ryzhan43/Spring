import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class CalculatorParameterizedTest {

    //console
    //mvn -Dtest=TestCircle#mytest test
    //mvn -Dtest=test2
    // maven-surefire-plugin


    @ParameterizedTest
    @ValueSource(strings = {"Java","JS","TS"})
    @EmptySource
    @NullSource
    @NullAndEmptySource
    @Tag("test2")
    void testCase1(String args){
        Assertions.assertTrue(!args.isEmpty());
    }

    @ParameterizedTest
    @ValueSource(ints = {3,6,10})
    void testCase2(int numbers){
        Assertions.assertEquals(0, numbers % 3);
    }

    @ParameterizedTest
    @ValueSource(ints = {3,6,9})
    void testCase3(int numbers){
        Assertions.assertEquals(0, numbers % 3);
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testCase4(String args){
        Assertions.assertNotNull(args);
    }

    static String[] stringProvider(){
        return new String[]{"Java", "TS","JS"};
    }

    @ParameterizedTest
    @CsvSource({"10,20,30","20,20,40","30,20,100"})
    void testCase5(int num1, int num2, int result){
        Assertions.assertEquals(result, Calculator.add(num1,num2));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/sample-data.csv",numLinesToSkip = 1)
    void testCase6(int num1, int num2, int result){
        Assertions.assertEquals(result, Calculator.add(num1,num2));
    }

}
