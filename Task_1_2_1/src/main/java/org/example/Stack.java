package org.example;

/**
 * A class implementing the stack.
 */

public class Stack {

    /**
     * An array that stores objects.
     */

    private Object [] list;

    /**
     * Stack size.
     */

    private int size;

    /**
     * The actual size of the array.
     */

    private int cap;

    /**
     * Constructor that sets initial values.
     */

    public Stack() {
        list = new Object[10];
        size = 0;
        cap = 10;
    }

    /**
     *Method that increases the size of the array.
     *if there is not enough space.
     */

    private void realloc() {
        cap *= 2;
        Object [] temp = new Object [size];
        System.arraycopy(list, 0, temp, 0, size);
        list = new Object [cap];
        if (size >= 0) {
            System.arraycopy(temp, 0, list, 0, size);
        }
    }

    /**
     *The method adds an object to the stack.
     *
     * @param obj The object to add to the stack.
     */
    public void push(Object obj) {
        if (size == cap) {
            realloc();
        }
        list[size] = obj;
        size++;
    }

    /**
     *The method adds a group of objects to the stack.
     *
     * @param obj Array of objects to be added to the stack.
     */

    public void pushStack(Object [] obj) {
        for (Object i : obj) {
            push(i);
        }
    }

    /**
     * The method removes 1 object from the stack.
     */

    public void pop() {
        if (size > 0) {
            size--;
            list[size] = null;
        }
    }

    /**
     * The method removes the specified number of objects from the stack.
     *
     * @param k number of objects.
     */

    public void popStack(int k) {
        for (int i = 0; i < k; i++) {
            pop();
        }
    }

    /**
     * Method for determining the stack size.
     *
     * @return stack size.
     */

    public int count() {
        return size;
    }

    /**
     * The method that returns the stack.
     *
     * @return stack.
     */

    public Object [] show() {
        if (size == 0) {
            return new Object[0];
        }
        Object [] ans = new Object[size];
        System.arraycopy(list, 0, ans, 0, size);
        return ans;
    }
}
