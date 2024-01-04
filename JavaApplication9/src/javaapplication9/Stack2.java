/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

public class Stack2 {
   private int top;
   private int stk[];
   private int max;

    public Stack2(int max) {
        this.top = -1;
        this.stk = new int[max];
        this.max = max;
    }
    public void push(int i)
    {
    top++;
    stk[top] = i;
    }
    public int pop()
    {
    return stk[top--];
    }
    public int peek()
    {return stk[top];}
    public boolean isempty()
    {return top != max -1;}
    public boolean isfull()
    {return top == max -1;}
    public boolean iscompempty()
    {return top == -1;}
    
}
