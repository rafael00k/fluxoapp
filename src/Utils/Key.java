package Utils;

public class Key {

    private final int x;
    private final int y;

    public Key(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Key)) return false;
        Key key = (Key) o;
        return x == key.x && y == key.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
    @Override
    public String toString() {
    	
    	return "de :"+this.x+"para"+this.y;    			
    }
    public int getX() {
    return this.x;	
    }
    public int getY() {
    return this.y;	
    }

}