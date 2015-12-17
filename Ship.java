package battleship;

/**
 * @author John Miller
 */
public class Ship {
    private String name;
    private int size;
    private int hits;
    private int direction;
    private int[] location = new int[2];
    
    public Ship (String nameIn, int sizeIn) {
        name = nameIn;
        size = sizeIn;
        hits = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public int getSize() {
        return size;
    }
    
    public int[] getLocation() { 
        return location;
    }
    
    public int getDirection() {
        return direction;
    }
    
    public void setLocation(int row, int col) {
        location[1] = row;
        location[0] = col;
    }
    
    public void setDirection(int dir) {
        direction = dir;
    }
    
    public void hit() {
        hits++;
    }
    
    public boolean isSunk() {
        if (size == hits)
            return true;
        
        return false;
    }
    
    public char getTitle() {
        return name.charAt(0);
    }
    
    public int getHits() {
        return hits;
    }
    
    public String toString() {
        return name;
    }
}
