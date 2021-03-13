public class Tetrahedrone extends ThreeDimentional{
    private double edgelenght;
    public Tetrahedrone(double edgelenght){
        if (edgelenght<0){
            throw new IllegalArgumentException("edgelengh should be grater than zero");
        }
        this.edgelenght=edgelenght;

    }
    public void setEdgelenght(double edgelenght){
        if (edgelenght<0){
            throw new IllegalArgumentException("edgelenght should be grater than zero");
        }
        this.edgelenght=edgelenght;

    }
    public double getEdgelenght(){
        return edgelenght;
    }

    @Override
    public double getarea(){
        return Math.sqrt(3)*Math.pow(getEdgelenght(),2);
    }
    @Override
    public double getvolume(){
        return Math.pow(edgelenght,3)/6*Math.sqrt(2);

    }
    @Override
    public String toString(){
        return String.format("%s%.2f and  %s%.2f","area is:",getarea(),"volume is:",getvolume());
    }
    public String getName(){
        return "Tetrahedrone";
    }
}
