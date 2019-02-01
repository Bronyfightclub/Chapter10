package chapter10;
public class Point2D {
    private int x;
    private int y;
    public Point2D(){
        this.x = 0;
        this.y = 0;
    }
    public Point2D(int xy){
        this.x = xy;
        this.y = xy;
    }
    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getx(){
        return this.x;
    }
    public int gety(){
        return this.y;
    }
    public void setx(int x){
    }
    public void sety(int y){
    }
    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
}