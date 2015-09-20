package leetcode.easy;

import java.util.Stack;

/**
 * author: Hao 
 * date:Sep 16, 2015
 * time:3:22:39 PM
 * purpose:	Implement Queue using Stacks
 */
public class Q232 {
	Stack<Integer> stack = new Stack<Integer>();
	
    // Push element x to the back of queue.
    public void push(int x) {
        Stack<Integer> newStack = new Stack<Integer>();
        while(!stack.isEmpty()){
        	newStack.push(stack.pop());
        }
        newStack.push(x);
        while(!newStack.isEmpty()){
        	stack.push(newStack.pop());
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(!stack.isEmpty())
        	stack.pop();
    }

    // Get the front element.
    public int peek() {
        if(!stack.isEmpty())
        	return stack.peek();
        else
        	return Integer.MIN_VALUE;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}

