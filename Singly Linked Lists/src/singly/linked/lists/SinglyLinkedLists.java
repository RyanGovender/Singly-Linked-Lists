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
public class SinglyLinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      SinglyListInterface<Integer> myList = new SinglyList<>();
        System.out.println("==========Testing addToBack method===============");
        
        myList.addToBack(10);
        myList.addToBack(20);
        myList.addToFront(25);
        myList.addToBack(30);
        myList.addToFront(50);
        myList.display();
        //Testing
        System.out.println("==============Testing remove Back================");
        int val = myList.removeBack();
        myList.display();
        System.out.println("value of the  removed node: "+ val);
        
        System.out.println("=========Testing numOfItems method========");
        System.out.println("Number Of Item in the List: "+ myList.numOfItems());
        
        System.out.println("==========Testing clear method=======");
        myList.clear();
        System.out.println("Numer of Items in the List: "+ myList.numOfItems());
        
        System.out.println("============Testing addFront method=======");
        myList.addToFront(4);
        myList.addToFront(6);
        myList.display();
        
        System.out.println("==========Testing removeFront=============");
        val = myList.removeFront();
        System.out.println("Value of the removed node: "+ val);
        myList.display();
        System.out.println("num of items: "+ myList.numOfItems());
        
        System.out.println("========Testing contain methods=======");
        ListNode target = myList.contain(4);
        if (target.equals(null)){
            System.out.println("Not Found");
        }
        else {
            //System.out.println("Value have been found: "+ target.getItem());
            
        }
        System.out.println("========Remove middle methods=======");
         myList.addToBack(10);
        myList.addToBack(20);
        myList.addToFront(25);
        myList.addToBack(30);
        myList.addToFront(50);
        myList.display();
         System.out.println("========Remove middle methods=======");
        // myList.AddToMiddle(150);
        // myList.Add(99, 3);
         myList.Remove(3);
         myList.display();
    }
    
}
