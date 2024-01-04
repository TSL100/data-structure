/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import java.util.Scanner;

public class JavaApplication9 {
    final static int size = 10;
    static int stack[] = new int[size];
    static int top = -1;
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Stack s = new Stack();
        s.push2(300);        
        s.push2(200);
        System.out.println(s.pop2());
    }
    public static void push(int number){
        if(top == size - 1)
            System.out.println("stack is full or stackoverflow");
        else
            stack[++top] = number;
    }
    public static int pop(){
        if(top == -1)
            return -1;
        else
            return stack[top--];
    }
}
