public class Test {


    public static void main(String[] args){
        Square s=new Square(1,7);
        circle c=new circle(3.5);
        Triangle t=new Triangle(4,5);
        Sphere s1=new Sphere(5.75);
        Cube c1=new Cube(7,8,11);
        Tetrahedrone t1=new Tetrahedrone(4);
        Shape []shape=new Shape[6];
        shape[0]=s;
        shape[1]=c;
        shape [2]=t;
        shape[3]=s1;
        shape[4]=c1;
        shape[5]=t1;
        for(Shape currentshapes:shape){

            if(currentshapes instanceof TwoDimentonal){
                System.out.printf("the %s is Two dimentional and %S",((TwoDimentonal) currentshapes).getName(),currentshapes.toString());
                System.out.println();
            }
            if(currentshapes instanceof ThreeDimentional){
                System.out.printf("the %s is Two dimentional and %S",((ThreeDimentional) currentshapes).getName(),currentshapes.toString());
                System.out.println();
            }

            }
        }

    }

