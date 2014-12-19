package example;

import java.util.Iterator;
import java.util.Stack;
import common.io.StdIn;

public class Parentheses {

	public static void main(String[] args) {
		Stack<String> inputStack = new Stack<String>();
		
		StdIn in = new StdIn();
		while (!in.isEmpty()) {
            String item = in.readNextChar();
           if (!item.equals(new String("-"))) {
            	inputStack.push(item); 
           }
		}
		
		for(Iterator<String> s = inputStack.iterator(); s.hasNext();) {
			System.out.println(s.next());
		}
	} 

}
