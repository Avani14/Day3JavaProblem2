class LengthCalculation{
	 public static float lengthOfLine( float x1, float y1,float x2,float y2) 
	 {
		 float ans = (float) Math.sqrt(Math.pow((x2 - x1),2)+Math.pow((y2- y1),2));
		 return ans;
	 }
}
public class LineComparison {
	

	 
	public static void main(String[] args) {
		System.out.println("Welcome to Line\r\n"
				+ "Comparison Computation\r\n"
				+ "Program on Master Branch");
		float line1 = LengthCalculation.lengthOfLine(12.3f, 0.1f, 12.5f, 0.5f);
		System.out.println("Length of line one is : "+line1);
		float line2 = LengthCalculation.lengthOfLine(44.12f,4.0f,12.3f,0.5f);
		System.out.println("Length of line two is : "+line2);
	}
	

}
