public class Cube extends ThreeDimentional{
    private double lenght;
    private double width;
    private double height;
    public  Cube  (double lenght,double width,double height){
        if(lenght<0.0){
            throw new IllegalArgumentException("lenght should be grater than zero");
        }
        if(width<0.0){throw new IllegalArgumentException("width should be grater than zero");}
        if(height<0.0){throw new IllegalArgumentException("height should be grater than zero");}
        this.lenght=lenght;
        this.width=width;
        this.height=height;
    }
    public void setlenght(double lenght){
        if(lenght<0.0){throw new IllegalArgumentException("lenght should be grater than zero");}
        this.lenght=lenght;
    }
    public void setWidth(double width){
        if(width<0.0){throw new IllegalArgumentException("width should be grater than zero");}
        this.width=width;
    }
    public void setHeight(double height){
        if(height<0.0){throw new IllegalArgumentException("height should be grater than zero");}
        this.height=height;
    }

    public double getLenght(){
        return lenght;
    }
    public double getWidth(){
        return width;
}
public double getHeight(){
        return height;
}
@Override
    public double getarea(){
        return 2*getLenght()*getWidth()+2*getWidth()*getHeight()+2*getLenght()*getHeight();
}
@Override
    public double getvolume(){
     return getHeight() * getLenght()* getWidth();

}
    @Override
    public String toString(){
        return String.format("%s%.2f and  %s%.2f","area is:",getarea(),"volume is:",getvolume());
    }
    public String getName(){
        return "cube";
    }
}
