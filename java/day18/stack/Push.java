package stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class Push {

	public static void main(String[] args) {
		//creating an object of Stack class  
		Stack <Integer> stk = new Stack<>();  
		System.out.println("stack: " + stk);//shows empty   
		//pushing elements into the stack  
		pushelmnt(stk, 20);  
		pushelmnt(stk, 13);  
		pushelmnt(stk, 89);  
		pushelmnt(stk, 90);  
		pushelmnt(stk, 11);  
		pushelmnt(stk, 45);  
		pushelmnt(stk, 18);  
		//popping elements from the stack  
		popelmnt(stk);  
		popelmnt(stk);  
		//throws exception if the stack is empty  
		try   
		{  
		popelmnt(stk);  
		}   
		catch (EmptyStackException e)   
		{  
		System.out.println("empty stack");  
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
		}  //main closes
		//performing push operation  
		static void pushelmnt(Stack<Integer> stk, int x)   
		{  
		//invoking push() method      
		stk.push(x);  
		System.out.println("push -> " + x);  
		//prints modified stack  
		System.out.println("stack: " + stk);  
		}  
		//performing pop operation  
		static void popelmnt(Stack<Integer> stk)   
		{  
		System.out.print("pop -> ");  
		//invoking pop() method   
		Integer x =stk.pop();  
		System.out.print(x);  
		System.out.println();
		//prints modified stack  
		System.out.println("stack: " + stk); 

	}

}
