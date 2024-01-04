/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

public class Queue2 {
    private int rear,front,nelement,max;
    private int data[];

    public Queue2(int max) {
        this.rear = -1;
        this.front = 0;
        this.nelement = 0;
        this.max = max;
        this.data = new int[max];
    }
    public void enqueue(int newv)
    {
    if(rear == max-1){
     rear = -1; 
    }
    data[rear] = newv;
    nelement++;
    }
    public int dequeue()
    {
    int val = data[front];
    front++;
    if(front == max){
    front = 0;
    }
    nelement--;
    return val;
    }
    public int peek()
    {
    return data[front];
    }
    public boolean isfull()
    {return nelement == max;}
    public boolean isempty()
    {return nelement != max;}
}
