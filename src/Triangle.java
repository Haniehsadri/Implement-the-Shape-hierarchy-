public class Triangle extends TwoDimentonal{
 private double height;
private double base;
    public  Triangle(double height,double base){
        if(height<0.0){
            throw new IllegalArgumentException("height should be grater than zero");}
            if(base<0.0){
            throw new IllegalArgumentException("base should be grater than zero");
        }
            this.height=height;
            this.base=base;

    }
    public void setHeight(double height){  if(height<0.0){
        throw new IllegalArgumentException("height should be grater than zero");}

    }
    public void setBase(double base){
        if(base<0.0){
        throw new IllegalArgumentException("base should be grater than zero");
    }
    this.base=base;}
    public double getHeight(){
        return height;
        }
    public double getBase(){
        return base;
    }
    @Override
    public double getarea(){
        return getBase()*getHeight();
    }
    @Override
    public String toString(){
        return String.format("%s%.2f ","area is:",getarea());
    }
    public String getName(){
        return "triangle";
    }

    }
