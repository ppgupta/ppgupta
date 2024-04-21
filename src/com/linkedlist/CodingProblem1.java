package com.linkedlist;



//print string in return while maintaining whitespaces , input ="Hey, how are you?"  output ="?you are how ,Hey"
import java.util.*;

public class CodingProblem1 {

	
	public String reverseWords(String word) {
		String output="";
		ArrayList<String> list=new ArrayList<String>();
		int start=0;

		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==' '|| i==word.length()-1) {
				list.add((i==word.length()-1)?word.substring(start,i+1):word.substring(start,i));
				start=i+1;
			}
		}
		if(list.size()==0) {
			output=word;
		}
		else {
			for(int i=list.size()-1;i>=0;i--) {
				output+=list.get(i)+" ";
			}
		}
		
		return output;
		
	}
    public static void main(String[] args) 
    {
    	CodingProblem1 obj= new CodingProblem1();
    	Scanner input=new Scanner(System.in);
    	
    	String inputword= input.nextLine();
    	
    	System.out.println(obj.reverseWords(inputword));
    }
}
