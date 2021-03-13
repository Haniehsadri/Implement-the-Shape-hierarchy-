public class Sphere extends ThreeDimentional {
    private double radius;
    public Sphere (double radius){
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
        return 4*Math.PI*Math.pow(getRadius(),2);

    }@Override
    public double getvolume(){
        return 4/3*Math.PI*Math.pow(getRadius(),3);
    }
    @Override
    public String toString(){
        return String.format("%s%.2f and   %s%.2f","area is:",getarea(),"volume is:",getvolume());
    }
    public String getName(){
        return "sphere";
    }
}
