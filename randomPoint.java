import java.util.Random;

public class randomPoint {

  public static void main(String[] args) {
    
	Random rand = new Random();
    double x1 = (((rand.nextDouble() + 0.01) * 2) - 1) * 5;
    
	if (x1 > 5)
      x1 = 5;
    
	double y1 = (((rand.nextDouble() + 0.01) * 2) - 1) * Math.pow((25 - Math.pow(x1, 2)), 0.5);
    
	if (y1 > Math.pow((25 - Math.pow(x1, 2)), 0.5))
      y1 = Math.pow((25 - Math.pow(x1, 2)), 0.5);
    
	System.out.println("The point is (" + x1 + ", " + y1 + ") and its distance to the origin is "
        + Math.pow(Math.pow(x1, 2) + Math.pow(y1, 2), 0.5));

  }

}
