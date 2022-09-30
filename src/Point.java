public class Point {
    //instance variables
    private int x;
    private int y;

    //constructor with 2 parameters
    public Point (int x, int y) {
        this.x=x;
        this.y=y;
    }

    //constructor with 1 parameter
    public Point(int point) {
        x = point;
        y = point;
    }

    //getter method for x
    public int getX () {
        return x;
    }

    //getter method for y
    public int getY () {
        return y;
    }

    //constructor with no parameters
    public Point() {
        x = 0;
        y = 0;
    }


}
