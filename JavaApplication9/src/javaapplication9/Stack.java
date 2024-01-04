/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

import static javaapplication9.JavaApplication9.size;
import static javaapplication9.JavaApplication9.stack;
import static javaapplication9.JavaApplication9.top;

public class Stack {
    private final static int max = 100;
    private int[]stk = new int[max];
    private int top;
    public Stack(){top = -1;}
    public boolean push2(int n){
        if(top == max - 1){
            System.out.println("stack is full or stackoverflow");
            return false;
        }
        else{
            stk[++top] = n;
            return true;
        }
    }
    public int pop2(){
    if(top<0){
       System.out.println("stack is Empty");
       return 0;
    }
    else{
     int max = stk[top--];
        while (top>=0) {            
            if(max<stk[top])
                max = stk[top];
            top--;    
        }
        return max;
    }
    }
    public int peek(){
    if(top<0){
       System.out.println("stack is Empty");
       return 0;
    }
    else{
    return stk[top];
    }
    }
    public boolean is_empty(){
    return (top<0);
    }
    public void display(){
        for (int i = 0; i <= top; i++) {
            System.out.println(stk[i]);
        }
    }
     public int search(int value) {
        for (int i = top; i >= 0; i--) {
            if (stack[i] == value) {
                return top - i + 1;
            }
        }
        return -1;
    }
}
