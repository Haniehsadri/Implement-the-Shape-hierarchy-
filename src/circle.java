public class circle extends TwoDimentonal{
    private double radius;

    public circle(double radius){
        if (radius<0){
            throw new IllegalArgumentException("radius should be grater than zero");
        }

        this.radius=radius;
    }
    public void setRadius(double radius){
        if (radius<0){
            throw new IllegalArgumentException("radius should be grater than zero");
        }this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    @Override
    public double getarea(){
        return getRadius()*2*Math.PI;
    }
    @Override
    public String toString(){
        return String.format("%s%.2f ","area is:",getarea());
    }
    public String getName(){
        return "circle";
    }
}


