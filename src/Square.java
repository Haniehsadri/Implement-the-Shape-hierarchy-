public class Square extends TwoDimentonal {
    private double lenght;
    private double width;
    public  Square (double lenght,double width){
        if(lenght<0.0){
            throw new IllegalArgumentException("lenght should be grater than zero");
        }
        if(width<0.0){throw new IllegalArgumentException("width should be grater than zero");}
        this.lenght=lenght;
        this.width=width;
    }
    public void setlenght(double lenght){
        this.lenght=lenght;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLenght(){
        return lenght;
    }
    public double getWidth(){
        return width;
    }
    @Override
    public double getarea(){
        return getLenght()*getWidth();

    }
    @Override
    public String toString(){
        return String.format("%s%.2f ","area is:",getarea());


    }
    public String getName(){
        return "square";
    }


}



