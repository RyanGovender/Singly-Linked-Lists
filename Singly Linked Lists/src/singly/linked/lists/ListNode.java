/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singly.linked.lists;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author 21614
 */
public class ListNode<T> implements NodeInterface<T>{
   
    private T item;
    private ListNode next;
    

    ListNode(T value){
        this(value, null);
    }
    

    ListNode(T value, ListNode n){
        item = value;
        next = n;
    }
    
    @Override
    public void setNext(ListNode n) {
        next = n;
    }

    @Override
    public ListNode getNext() {
        return next;
    }

    @Override
    public void setItem(T item) {
        this.item = (T) item;
    }

    @Override
    public T getItem() {
        return (T) item;
    }
    
}
