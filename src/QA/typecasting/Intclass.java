package QA.typecasting;

public class Intclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		System.out.println("the integer value :"+num);
		
		String data =String.valueOf(num);
		System.out.println("the string value :"+data);
	
		
		String Str = "111";
		System.out.println("the string value :" + Str);
		
		int inum =Integer.parseInt(Str);
		System.out.println("the integer value :" + inum);
		
		double dnum =Double.parseDouble(Str);
		System.out.println("the double value :" + dnum);
		
	}

}
