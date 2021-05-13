package problems;

public class RevisingQuadraticEquations {

    //Coefficients
    private double a;
    private double b;
    private double c;

    private String discriminantChecker(double d){
        if(d < 0)
            return "Unequal & Imaginary";
        else if(d == 0)
            return "Real and Equal";
        else
            return "Real and unequal";
    }
    public void findRoots(){
        // formula to find the roots of quadratic Equation - ax^2+bx+c
        // +-(sqrt(b^2-4ac)/2a)
        double d =b*b-4*a*c;
        String rootIs = discriminantChecker(d);
        double x1 = (-b + Math.sqrt(d))/2*a;
        double x2 = (-b - Math.sqrt(d))/2*a;
        System.out.println("The types of the roots are: "+rootIs);
        System.out.println("Roots: "+(int)x1+" "+(int)x2);
    }

    public RevisingQuadraticEquations(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
