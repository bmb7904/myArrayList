/**
 * This class will define a container class which will contain any object. The 
 * size of the list will be dynamically sized, with various methods for to adding,
 * removing from, and checking the list if empty. 
 * 
 * Author: Brett Bernardi
 */
package bernardi;

public class myArrayList 
{
    // the number of elements in the arrayList
    private int size;
    
    // stores the actual list as an array
    private Object[] arrayList;
    
    // the current capacity of array attribute
    private int cap;
    
    /**
     * Constructor that creates the myArrayList object with the intial capacity
     * of the array specified in the parameter
     * @param - length 
     */
    public myArrayList(int length)
    {
        this.cap = length;
        arrayList = new Object[cap];
        size = 0;
    }
    
    /**
     * Default constructor that creates myArrayList object with a default capacity
     * of 10. An exampled of chaining constructors.
     * @param - none
     */
    public myArrayList()
    {
        this(10);
    }
    
    /**
     * Appends the specified element to the end of the list
     * @param e -  the Object to be added
     */
    public void add(Object e)
    {
        if(size >= arrayList.length)
        {
            increaseCap();
        }
        arrayList[size] = e;
        size++;
    }
    
    /**
     * Inserts the specified element to the end of the list
     * @param - index, the position of object in list
     * @param - e, the object to be added
     */
    public void add(int index, Object e)
    {
        if(size >= arrayList.length)
        {
            increaseCap();
        }
        
        for(int i = size - 1; i >= index; i--)
        {
            arrayList[i + 1] = arrayList[i];
        }
        arrayList[index] = e;
        size++;
    }
    
    /**
     * returns the size of the list
     */
    public int size()
    {
        return size;
    }
    
    /**
     * returns the object in the list at the specified index
     * If index is invalid, throw exception
     * @param index 
     * @return object
     */
    public Object get(int index) throws IndexOutOfBoundsException
    {
        //arrayList[size] does not exist! arrayList[size-1] is last element in 
        // the list
        if(index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Index " + Integer.toString(index )+ " does not"
                    + "exist!");
        }
        return arrayList[index];
    }
    
    /**
     * Replaces the element at the specified index with the specified object in
     * the parameter
     */
    public void set(int index, Object o) throws IndexOutOfBoundsException
    {
        //arrayList[size] does not exist! arrayList[size-1] is last element in 
        // the list
        if(index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Index " + Integer.toString(index )+ " does not"
                    + "exist!");
        }
        
        arrayList[index] = o;
    }
    
    /**
     * checks if specified object is in the list
     * @param - o, Object
     * @return - true is object in list, otherwise false
     */
    public boolean contains(Object o)
    {
        for(int i = 0; i < size; i++)
        {
            if(arrayList[i].equals(o))
            {
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * helper method that increases capacity of the array by creating a new array
     * with 2 times the capacity and copying everything over
     */
    private void increaseCap()
    {
        Object[] newList = new Object[arrayList.length * 2];
        for(int i = 0; i < size; i++)
        {
            newList[i] = arrayList[i];
        }
        arrayList = newList;
    }
    
    /**
     * Checks if list is empty
     * @param - none
     * @return - true if list contains no elements, false otherwise
     */
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    /**
     * Overrides toString method to return the entire list as a String
     * @return - string representing the list
     */
    @Override
    public String toString()
    {
       String str = "[ ";
       
       for(int i = 0; i < size; i++)
       {
           if(i != size - 1)
           {
               str += arrayList[i].toString() + ", ";
           }
           else
           {
               str += arrayList[i].toString() + " ";
           }
       }
       
       str += "]";
       
       return str;
    }
    
    
}
