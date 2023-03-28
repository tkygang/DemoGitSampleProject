package org.htc;

public class DemoSample {
	
	public static void main(String[] args) {
		String s = "tomorrow";
		if (s.contains("o")) {
			
			String s1 = s.replace('o','$');
			String s2 = s1.substring(0, 4);
			//CharSequence s3 = s1.subSequence(4, 7);
			String s3 = s1.substring(4, 7);
			String s4 = s1.substring(7);
			
			System.out.println("Old String : "+s);
			System.out.println("New String : "+s2+"$"+s3+"$$"+s4);
			
			System.out.println("b1");
		
			}
	}

}
