class LengthCalculation{
	 public static float lengthOfLine( float x1, float y1,float x2,float y2) 
	 {
		 float ans = (float) Math.sqrt(Math.pow((x2 - x1),2)+Math.pow((y2- y1),2));
		 return ans;
	 }
	 public static void checkingIfEqual(float l1, float l2)
	 {
		 Float x = new Float(l1);
		 Float y = new Float(l2);
		 if(x.equals(y))
		 {
			 System.out.println("The two lines are equal");
		 }
		 else {
			 System.out.println("The lines are not equal");
			 if(x > y)
			 {
				 System.out.println("line one with length :"+x+" is greater than line two with lenght : "+y);
			 }
			 else if(y>x)
			 {
				 System.out.println("line two with length :"+y+" is greater than line one with lenght : "+x);
			 }
		 }
		 
	 }
}
public class LineComparison {
	

	 
	public static void main(String[] args) {
		System.out.println("Welcome to Line\r\n"
				+ "Comparison Computation\r\n"
				+ "Program on Master Branch");
		float line1 = LengthCalculation.lengthOfLine((float)(Math.random()*10), (float)(Math.random()*10), (float)(Math.random()*10), (float)(Math.random()*10));
		System.out.println("Length of line one is : "+line1);
		float line2 = LengthCalculation.lengthOfLine((float)(Math.random()*10), (float)(Math.random()*10), (float)(Math.random()*10), (float)(Math.random()*10));
		System.out.println("Length of line two is : "+line2);
		
		LengthCalculation.checkingIfEqual(line1, line2);
	}
	

}
