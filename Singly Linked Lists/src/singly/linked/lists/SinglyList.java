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
public class SinglyList<T> implements SinglyListInterface<T> {
    ListNode head;
    int numOfItem;
    
    SinglyList(){
        head = null;
        numOfItem = 0;
    }

    @Override
    public void addToFront(T item) {
        head = new ListNode(item,head);
        numOfItem++;
    }

    @Override
    public T removeFront() {
        T value = null;
        if(!isEmpty()){
            value = (T) head.getItem();
            head = head.getNext();
        }
        numOfItem--;
        return value;
    }

    @Override
    public void addToBack(T item) {
        ListNode current = head;
        // we start with one because we don't want the 
        // current to become null before adding
        int cnt = 1;
        while(current!=null && cnt < numOfItem){
            current = current.getNext();
            cnt++;
        }
        
        if (current!=null){
            ListNode newNode = new ListNode(item);
            current.setNext(newNode);
            numOfItem++;
            
        }
        //when the list is empty
        else{
            addToFront(item);
        }
    }

    @Override
    public T removeBack() {
        T value = null;
        if(!isEmpty()){
            ListNode current = head;
            //to make sure the current will point to the node before the last node
            int cnt = 2;
            while(current!=null && cnt <numOfItem)
            {
                current = current.getNext();
                cnt++;
            }
            
            if(current!=null)
            {
                //current is pointing to the node before the last node
                value = (T) current.getNext().getItem();
                current.setNext(null);
            }  
        }
        numOfItem--;
        return value;
    }
    
    //return a reference for the target node

    @Override
    public ListNode contain(T target) {
        ListNode temp = null;
        ListNode current = head;
        while (current!=null){
            if(current.getItem().equals(target))
            {
                temp = current;
            }
            current = current.getNext();
           
        }
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public void clear() {
        head = null;
        numOfItem=0;
    }

    @Override
    public void display() {
        ListNode current = head;
        while(current!=null){
            System.out.println(current.getItem());
            current = current.getNext();
        }
    }

    @Override
    public int numOfItems() {
        return numOfItem;
    }
    @Override
    public void RemoveMiddle()
    {
        if(!isEmpty())
        {
           int mid=numOfItem/2,count=0;
           ListNode current=head,next;
           for(int i =0;i<mid;i++)
           {
               current=current.getNext();
               count++;
           }
           if(current!=null )
           {
               while(numOfItem-1>mid)
                   {
                   next=current.getNext();
                   current.setItem(next.getItem());
                   current=current.getNext();
                   mid++;
                   }
                   current.setItem(null);
                   numOfItem--;
           }
        }
    }
    
    @Override
    public void AddToMiddle(T item)
    {
        if(!isEmpty())
        {
          ListNode current=head,prev=null;
          int count=0,mid=numOfItem/2;
          while(count!=mid)
          {
              count++;
              prev=current;
              current=current.getNext();
          }
          
          ListNode newNode= new ListNode(item);
          newNode.setItem(item);
          newNode.setNext(current);
          prev.setNext(newNode);
          numOfItem++;
        }
    }
    @Override
    public void Add(T item, int position)
    {
        if(!isEmpty())
        {
            ListNode node=head,prev=null;
            int count=0;
            while(count!=position-1)
            {
                count++;
                prev=node;
                node=node.getNext();
                
            }
            ListNode newNode=new ListNode(item);
            newNode.setItem(item);
            newNode.setNext(node);
            if(count==0)
            {
                head=newNode;
            }
            else
            {
                prev.setNext(newNode);
            }
                numOfItem++;
        }
    }
    
    @Override
    public void Remove(int position)
    {
        if(!isEmpty())
        {
            ListNode current=head,prev=null;
            int count=0;
            while(count!=position-1)
            {
                count++;
                prev=current;
                current=current.getNext();
            }
            if(current!=null)
            {
                 prev.setNext(current.getNext());
                 current.setNext(null);
            }    
            numOfItem--;
        }
            
    }
    
}
