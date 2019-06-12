/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singly.linked.lists;

/**
 *
 * @author 21614
 */
public interface SinglyListInterface<T> {
     public void addToFront(T item);
    public T removeFront();
    public void addToBack(T item);
    public T removeBack();
    public ListNode contain(T target);
    public boolean isEmpty();
    public void clear();
    public void display();
    public int numOfItems();
    public void RemoveMiddle();
    public void AddToMiddle(T item);
    public void Add(T item,int position);
    public void Remove(int position);
}
