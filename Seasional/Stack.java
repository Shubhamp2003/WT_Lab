package WT_Lab.Seasional;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            top++;
            stackArray[top] = value;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int pop() {
        if (top >= 0) {
            int value = stackArray[top];
            top--;
            return value;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println("Popped value: " + stack.pop());
        System.out.println("Popped value: " + stack.pop());
        System.out.println("Popped value: " + stack.pop());
        System.out.println("Popped value: " + stack.pop());
        System.out.println("Popped value: " + stack.pop());
        System.out.println("Popped value: " + stack.pop());
    }
}