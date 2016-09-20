/*
 * program to implement a queue using stack
You can use two stacks and use one as the incoming stack and the
other as the outgoing stack. A queue is a FIFO structure, so when 
we enqueue something, we need to make sure that it does not get 
popped off before something that was already there. Similarly, 
when we dequeue something, we have to make sure that elements 
that were inserted earlier get ejected first.
 */


/*
READ ME

This program queue will hold up to 10 elements.

If you want to add an element to the back of the queue,
use the "insert(integer)" method.

If you want to call the element that is at the front of the line,
do "next();"

You can add and call elements to and from the queue at any time
in the main method of the program.

The "-" indicates that there is space avalable in the queue.

Currently, the program is set for integers but can be set for an variable
by changing the array type and the elements inserted.
*/

package queue;

/**
 * @author leemartinc
 */
public class MyQueue {
    
    
//create space in memory for the queue
    static int[] line = new int[10];
//feclares front and back of line
    static int front = 0;
    static int last = 0;
    
    public static void main(String[] args) {
        
        //add item to the line
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
       
        
        
        
        //Print the queue
        for(int i= 0; i <= line.length-1 ;i++){ 
            if(line[i] == 0){
              System.out.println("-");
          }
            else{
          System.out.println(line[i]);}
          
        } 
        
        //make a space between the original line and the updated one
        System.out.println();
        
        //Call out the element from the front
        next();
        next();
        
        
        //another element joins the queue
        insert(8);
        insert(9);
        insert(10);
        
        //Tells which item is at the front of the queue
        System.out.println("First is " + line[front]);
        
        System.out.println();
        
        //print the updated line
        for(int i= 0; i <= line.length-1 ;i++){ 
            if(line[i] == 0){
              System.out.println("-");
          }
            else{
          System.out.println(line[i]);}
          
        }   
    }
    
    
    //method to add elements to queue
    public static void insert(int num){
        
        //add the number to the list
        line[last] = num;
        last++;
        
    }
    
    //method to call the element from the front of the line
    public static void next(){
        
        //moves the first item up in the que
        line[front] = line[1];
        
        //moves the remaining item up in the quees
        for (int i=1;i<line.length-1;i++){
        line[i] = line [i+1];
        
        }
        
        //cleares the back of the line
        line[last-1] = 0;
        
        //moves any element that joins the queue up in the line from the back
        last--;
              
        
    }   
}