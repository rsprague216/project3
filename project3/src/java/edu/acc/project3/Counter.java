package edu.acc.project3;

/**
 * @author Ryan Sprague
 */
public class Counter {
    int count;
    
    public Counter() {
        this.count = 0;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int increment() {
        this.count++;
        return count;
    }
}
