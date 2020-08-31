/**
 *  Project 2 
 *  CompSci 122 - Advanced Java
 *  Author: Brett Bernardi
 *  September 1, 2020
 */
package bernardi;

public class Project2BrettBernardi 
{

    public static void main(String[] args) 
    {
        myArrayList list = new myArrayList();
        list.add(8);
        list.add(83);
        list.add(1);
        list.add(5);
        list.add(10);

        list.add(-98);
        
        System.out.println(list);
        System.out.println("size = " + list.size());
        System.out.println("It's " + list.contains(20) + " that the list contains 20");
        System.out.println();
        list.add(2, 20);
        System.out.println(list);
        System.out.println("size = " + list.size());
        
        System.out.println("It's " + list.contains(20) + " that the list contains 20");
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        list.add(3);
        list.add(4);
        list.add(99);
        list.add(-92);
        list.add(1000);
        
        System.out.println(list);
        System.out.println("size = " + list.size());
        
        try
        {
            System.out.println("Element with index 3 = " + list.get(12));
        }
        catch(Exception e)
        {
            System.out.println("Invalid index");
        }
        
        
    }
    
}
