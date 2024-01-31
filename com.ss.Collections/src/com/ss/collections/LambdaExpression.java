package com.ss.collections;
//@FunctionalInterface
interface Draw{
	 public String  drawPictue(String pictureName,String userName);
	
 // void news();
}

public class LambdaExpression {

	public static void main(String[] args) {
		
		Draw d=(String pictureName,String userName)->{ 
		return "ganesh";	
		};
		System.out.println(d.drawPictue("The best Picture", "me"));
	}

}

