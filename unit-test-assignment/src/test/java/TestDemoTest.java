import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import java.util.stream.Stream;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;


class TestDemoTest {
	
 TestDemo testDemo =  new TestDemo();//new object of TestDemo
		 
	
	@BeforeEach
	void setUp() throws Exception  {
	}

	@ParameterizedTest
	@MethodSource("TestDemoTest#argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAddedCorrectly() {
		int a = 0;
		int b = 0;
		int expected = 0;
		boolean expectException = true;
		
		
		    if(!expectException) {
		      assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
	}//Lambda expression with no parameters is a method call to testDemo.addPositive
else { assertThatThrownBy(() -> testDemo.addPositive(a,b)).isInstanceOf(IllegalArgumentException.class);//As a parameter to assertThatThrownBy, add a Lambda expression with no parameters
	}//assertion isInstanceOf(IllegalArgumentException.class) to ensure that the correct exception is thrown.
//...the above is an else clause to test for the thrown exception..
	}
	
	//...parameter source method below
     static Stream<Arguments> argumentsForAddPositive() {
    	 return(Stream.of(
    			 arguments(6, 0, 6, true), 
                 arguments(2, 4, 6, false), 
                 arguments(-5, -3, -18, true), 
                 arguments(0, 0, 0, true), 
                 arguments(-2, 6, 4, false),
                 arguments(0, 19, 19, false)
                 
    			 ));
	}
    
     
     @Test//tests randomNumberSquared. mocks TestDemo using mokito spy with a known value. 
     void assertThatNumberSquaredIsCorrect() {
       TestDemo mockDemo = spy(testDemo);
       
       doReturn(5).when(mockDemo).getRandomInt();
       
       int fiveSquared = mockDemo.randomNumberSquared();//call method randomNumberSqured on mocked TestDemo object
       
       assertThat(fiveSquared).isEqualTo(25);//asserThst to test the value returned from randomNumberSquared is equal to 5^2
     } 
     
	
}//...end
