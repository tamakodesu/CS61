/** A class that represents a path via pursuit curves. */
public class Path {
    private double x1,x2;
    private double y1,y2;
    public Path(double x,double y){
        this.x1=x+0.0001;
        this.y1=y+0.0001;
    }
    public double getCurrX(){
        return this.x1;
    }
    public double getCurrY(){
        return this.y1;
    }
    public double getNextX(){
        return this.x2;
    }
    public double getNextY(){
        return this.y2;
    }
    public void iterate(double dx,double dy){
        this.x1=x2;
        this.y1=y2;
        this.x2+=dx;
        this.y2+=dy;
    }
    // TODO

}
