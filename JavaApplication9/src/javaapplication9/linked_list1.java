/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

public class linked_list1 {
    linked2 first;
    
    public boolean isempty()
    {
    return first == null;
    }
    public void insert(int data)
    {
    linked2 l1 = new linked2(data);
    if(first == null)
    {first = l1;}
    else
    {
        l1.next = first;
        first = l1;
    }
    }
    public int DeleteFirst()
    {
    int data = first.data;
    first= first.next;
    return data;
    }
    public void display()
    {
    linked2 curr = first;
    if(curr != null){
    while(true){
        System.out.println(curr.data);
        curr = curr.next;
    }
    
    }
    
    }
    public boolean search(int val)
    {
    linked2 curr = first;
   
    while(curr != null){
        if(curr.data == val){
        System.out.println(curr.data);
       return true;
    }
    curr = curr.next;
    }
    return !(curr == null);
    }
}
