
import java.util.Random;
public class TestDemo {
	 public int addPositive(int a, int b) {
		    if(a > 0 && b > 0 ) {
		      int sum = a + b;
		      return sum;
		    } else {
		      throw new IllegalArgumentException("Both parameters must be positive!");
		    }
		  } //
		  //grabs random number between 1 and 10 calls getRandomInt() returns square of that integer
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;}

public int randomNumberSquared(){
	int randomNumber = getRandomInt();
	int randomNumberSquared = randomNumber * randomNumber;
	return randomNumberSquared;}
//end method squared


}//..end class
	
