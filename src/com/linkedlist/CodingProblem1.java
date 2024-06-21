package com.linkedlist;



//print string in return while maintaining whitespaces , input ="Hey, how are you?"  output ="?you are how ,Hey"
import java.util.*;

public class CodingProblem1 {

	
	public String reverseWords(String word) {
		StringBuilder output =new StringBuilder() ;
		ArrayList<String> list = new ArrayList<>();

		list.addAll(Arrays.asList(word.split(" "))) ;
		int start=0;

		Collections.reverse(list);

//		for(int i=0;i<word.length();i++) {
//			if(word.charAt(i)==' '|| i==word.length()-1) {
//				list.add((i==word.length()-1)?word.substring(start,i+1):word.substring(start,i));
//				start=i+1;
//			}
//		}

		if(list.size()==0) {
			output.toString().equals(word);
		}
		else
		{

			for (String item:list){
				output.append(item).append(" ");
			}

		}
//
//		{
//			for(int i=list.size()-1;i>=0;i--) {
//				output+=list.get(i)+" ";
//			}
//		}
		
		return output.toString();
		
	}
    public static void main(String[] args) 
    {
    	CodingProblem1 obj= new CodingProblem1();
    	Scanner input=new Scanner(System.in);
    	
    	String inputword= input.nextLine();
    	
    	System.out.println(obj.reverseWords(inputword));
    }
}
